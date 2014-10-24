/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package skyhighmedical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AppointmentEntries {
     private Connection con;
    private PreparedStatement st;
    private ResultSet rs;
    private PreparedStatement fetchAppointment;
    private static String USERNAME = "z3419939";
    private static String PASSWORD = "zAnAnah2";
    
    public void connect() {
    
     try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            String url = "jdbc:oracle:thin:@//" + "sage.business.unsw.edu.au" + ":" + "1521" + "/" + "orcl01" + ".asbpldb001.ad.unsw.edu.au";
           
            con = DriverManager.getConnection(url, USERNAME, PASSWORD);
            System.out.println("Connected to database");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to connect to the database, please start the server"
                    + " in the 'Services' tab or read the setup instructions.");

        }
    }
    public List<AppointmentAll> getAllAppointment() {
        //new arraylist of employees, connect
        List<AppointmentAll> entries = new ArrayList<AppointmentAll>();
        connect();
        try {
            //loop through database and place everyone in the arraylist
            fetchAppointment = con.prepareStatement("SELECT * FROM APPONITEMENT");
             rs = fetchAppointment.executeQuery();
            while (rs.next()) {
                entries.add(new AppointmentAll(rs.getString("PATIENTID"), rs.getString("TIME"), rs.getString("PFIRSTNAME"), rs.getString("PLASTNAME"), rs.getString("APPOINTMENTINFO")) {

                });

            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error with database, please try again later.");
        }
        return entries;
         
    }

}
