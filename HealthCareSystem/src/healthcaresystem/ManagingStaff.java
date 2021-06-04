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
public abstract class ManagingStaff extends Person{
    private String Name;
    private String ContactNumber;
    private String Email;
    private String CNIC;
    private String bloodgroup;
    private String Gender;
    private String Address;
 
    
    /**
     * @return the Age
     */
    public abstract String getAge();

    /**
     * @param Age the Age to set
     */
    public abstract void setAge(String Age);
    

    /**
     * @return the Salary
     */
    public abstract String getSalary();

    /**
     * @param Salary the Salary to set
     */
    public abstract void setSalary(String Salary);

    /**
     * @return the Username
     */
    public abstract String getUsername();

    /**
     * @param Username the Username to set
     */
    public abstract void setUsername(String Username);

    /**
     * @return the password
     */
    public abstract String getPassword();

    /**
     * @param password the password to set
     */
    public abstract void setPassword(String password);
   
    
    

    @Override
    public String getName() {
        return Name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String Name) {
       this.Name= Name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContactNumber() {
       return ContactNumber; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContactNumber(String ContactNumber) {
       this.ContactNumber= ContactNumber; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return Email; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String Email) {
        this.Email= Email; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCNIC() {
        return CNIC; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCNIC(String CNIC) {
        this.CNIC= CNIC; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBloodgroup() {
       return bloodgroup; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup= bloodgroup; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGender() {
        return Gender; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGender(String Gender) {
        this.Gender= Gender; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAddress() {
        return Address; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String Address) {
        this.Address= Address; //To change body of generated methods, choose Tools | Templates.
    }
    
}
