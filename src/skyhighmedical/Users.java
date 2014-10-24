/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyhighmedical;

/**
 *
 * @author Negin
 */
public class Users
{

    private static String userNo;
    private static String userName;
    private static String userPassword;
    private static String userPrivilege;
    private static String staffId;

    public Users(String userNo, String userName, String userPassword, String userPrivilege, String staffId)
    {

        this.userNo = userNo;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPrivilege = userPrivilege;
        this.staffId = staffId;
    }

    /**
     * @return the userNo
     */
    public String getUserNo()
    {
        return userNo;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword()
    {
        return userPassword;
    }

    /**
     * @return the userPrivilege
     */
    public String getUserPrivilege()
    {
        return userPrivilege;
    }

    /**
     * @return the staffId
     */
    public String getStaffId()
    {
        return staffId;
    }
}
