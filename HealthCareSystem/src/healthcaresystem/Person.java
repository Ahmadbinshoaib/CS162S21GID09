/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

/**
 *
 * @author Maria
 */
public abstract class Person {
    
    /**
     * @return the Name
     */
    public abstract String getName();

    /**
     * @param Name the Name to set
     */
    public abstract boolean setName(String Name);

    /**
     * @return the ContactNumber
     */
    public abstract String getContactNumber();
    /**
     * @param ContactNumber the ContactNumber to set
     */
    public abstract boolean setContactNumber(String ContactNumber);

    /**
     * @return the Email
     */
    public abstract String getEmail();

    /**
     * @param Email the Email to set
     */
    public abstract boolean setEmail(String Email);

    /**
     * @return the CNIC
     */
    public abstract String getCNIC();

    /**
     * @param CNIC the CNIC to set
     */
    public abstract boolean setCNIC(String CNIC);

    /**
     * @return the bloodgroup
     */
    public abstract String getBloodgroup();
    /**
     * @param bloodgroup the bloodgroup to set
     */
    public abstract void setBloodgroup(String bloodgroup);

    /**
     * @return the Gender
     */
    public abstract String getGender();

    /**
     * @param Gender the Gender to set
     */
    public abstract void setGender(String Gender);

    /**
     * @return the Address
     */
    public abstract String getAddress();

    /**
     * @param Address the Address to set
     */
    public abstract void setAddress(String Address);
    
    
    
    
}
