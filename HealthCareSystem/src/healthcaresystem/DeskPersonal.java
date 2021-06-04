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
public class DeskPersonal extends ManagingStaff{

    private String Salary;
    private String Username;
    private String password;
    private String MartialStatus;
    private String DateofJoining;
    private String Age;
    private String DeskID;
    /**
     * @return the DateofJoining
     */
    public String getDateofJoining() {
        return DateofJoining;
    }

    /**
     * @param DateofJoining the DateofJoining to set
     */
    public void setDateofJoining(String DateofJoining) {
        this.DateofJoining = DateofJoining;
    }
    
    /**
     * @return the DeskID
     */
    public String getDeskID() {
        return DeskID;
    }

    /**
     * @param DeskID the DeskID to set
     */
    public void setDeskID(String DeskID) {
        this.DeskID = DeskID;
    }
    
    
    /**
     * @return the MartialStatus
     */
    public String getMartialStatus() {
        return MartialStatus;
    }

    /**
     * @param MartialStatus the MartialStatus to set
     */
    public void setMartialStatus(String MartialStatus) {
        this.MartialStatus = MartialStatus;
    }
    
    

    @Override
    public String getSalary() {
        return Salary; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSalary(String Salary) {
        this.Salary= Salary; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        return Username; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsername(String Username) {
        this.Username= Username; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return password;        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) {
        this.password= password; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAge() {
       return Age; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAge(String Age) {
        this.Age= Age; //To change body of generated methods, choose Tools | Templates.
    }
    
}
