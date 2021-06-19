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
public class Doctor extends LiteraryStaff{
    private String Salary;
    private String Username;
    private String password;
    private String MartialStatus;
    private String DateofJoining;
    private String Age;
    private String DID;
    private String Department;
    private String Specialization;

    /**
     * @return the Specialization
     */
    public String getSpecialization() {
        return Specialization;
    }

    /**
     * @param Specialization the Specialization to set
     */
    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }
    
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
    public String getDID() {
        return DID;
    }

    /**
     * @param DeskID the DeskID to set
     */
    public boolean setDID(String DID) {
        boolean flag= false;
        int count=0;
        int len= DID.length();
        char [] aEmployeeID= new char [len];
        aEmployeeID= DID.toCharArray();
        if(len==7)
        {
            if(aEmployeeID[0]>='A' && aEmployeeID[0]<='Z' && aEmployeeID[1]>='A' && aEmployeeID[1]<='Z' && aEmployeeID[2]>='A' && aEmployeeID[2]<='Z')
            {
                count= count+1;
            }
            if(aEmployeeID[3]=='-')
            {
            count=count+1; 
            }

            if(aEmployeeID[4]>='0' && aEmployeeID[4]<='9' && aEmployeeID[5]>='0' && aEmployeeID[5]<='9' && aEmployeeID[6]>='0' && aEmployeeID[6]<='9')
            {
                count=count+1;
            }
     
            if(count==3)
            {
                this.DID = DID;
                flag=true;
            }
        }
        return flag;
        
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
    public boolean setSalary(String Salary) {
        boolean flag = true;
        int len=Salary.length();
        char[] aSalary=new char[len];
        aSalary=Salary.toCharArray();
        for (int i = 0; i < len; i++) {
            if(!(aSalary[i]>='0' && aSalary[i]<='9'))
            {
                flag=false;
            }
            
        }
        if(flag==true){
            this.Salary= Salary; //To change body of generated methods, choose Tools | Templates.
        }
        return flag;
    }

    @Override
    public String getUsername() {
        return Username; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setUsername(String Username) {
        boolean flag= true;   
        int count=0;
        int len= Username.length();
        char[] aUsername= new char[len];
        aUsername= Username.toCharArray();
        if(len<=10)
        {
            for(int i=0; i<len; i++)
            {
                if((aUsername[i]>='A' && aUsername[i]<='Z') || (aUsername[i]>='a' && aUsername[i]<='z') || (aUsername[i]>='0' && aUsername[i]<='9') )
                {
                    count= count+1;
                }
      
            }
            if(count==len)
            {
                this.Username= Username;
                flag= true;
            }
            else
            {
       
                flag= false;
            }
        }
        return flag;
         //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public String getPassword() {
        return password;        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setPassword(String password) {
        this.password= password; //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public String getAge() {
       return Age; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setAge(String Age) {
        boolean flag = true;
        int len=Age.length();
        char[] aAge=new char[len];
        aAge=Age.toCharArray();
        for (int i = 0; i < len; i++) {
            if(!(aAge[i]>='0' && aAge[i]<='9'))
            {
                flag=false;
            }
            
        }
        if(flag==true){
            this.Age= Age; //To change body of generated methods, choose Tools | Templates.
        }
        return flag;
         //To change body of generated methods, choose Tools | Templates.
        
    }
    
   
    

    @Override
    public String getDepartment() {
        return Department; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDepartment(String Department) {
        this.Department= Department;//To change body of generated methods, choose Tools | Templates.
    }
    
}
