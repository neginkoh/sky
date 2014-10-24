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
public class Staff
{

    public String staffId;
    public String staffName;
    public String staffContact;
    public String staffEmail;

    public Staff(String staffId, String staffName, String staffContact, String staffEmail)
    {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffContact = staffContact;
        this.staffEmail = staffEmail;
    }

    /**
     * @return the staffId
     */
    public String getStaffId()
    {
        return staffId;
    }

    /**
     * @return the staffName
     */
    public String getStaffName()
    {
        return staffName;
    }

    /**
     * @return the staffContact
     */
    public String getStaffContact()
    {
        return staffContact;
    }

    /**
     * @return the staffEmail
     */
    public String getStaffEmail()
    {
        return staffEmail;
    }

}
