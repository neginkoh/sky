/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package skyhighmedical;

/**
 *
 * @author user
 */
public class AppointmentAll {
    private String PatientID;
    private String Time;
    private String FirstName;
    private String LastName;
    private String AppointmentInfo;
    
    public AppointmentAll(String PatientID,String Time, String firstName, String lastName, String AppointmentInfo) {
        this.PatientID = PatientID;
        this.Time = Time;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.AppointmentInfo= AppointmentInfo;
    }
    public String getPatientID(){
        return PatientID;
    }
    
    public String getTime(){
        return Time;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public String getAppointmentInfo(){
        return AppointmentInfo;
    }
    

}
        
         