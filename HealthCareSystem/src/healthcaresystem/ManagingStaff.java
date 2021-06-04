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
    public abstract boolean setAge(String Age);
    

    /**
     * @return the Salary
     */
    public abstract String getSalary();

    /**
     * @param Salary the Salary to set
     */
    public abstract boolean setSalary(String Salary);

    /**
     * @return the Username
     */
    public abstract String getUsername();

    /**
     * @param Username the Username to set
     */
    public abstract boolean setUsername(String Username);

    /**
     * @return the password
     */
    public abstract String getPassword();

    /**
     * @param password the password to set
     */
    public abstract boolean setPassword(String password);
   
    
    

    @Override
    public String getName() {
        return Name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setName(String name) {
        boolean flag= true;   
    int count=0;
    int len= name.length();
    char[] aname= new char[len];
    aname= name.toCharArray();
    if(len<=50)
    {
    for(int i=0; i<len; i++)
    {
      if((aname[i]>='A' && aname[i]<='Z') || (aname[i]>='a' && aname[i]<='z') || aname[i]==' ' )
     {
        count= count+1;
     }
      
    }
    if(count==len)
    {
    this.Name= Name;
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
    public String getContactNumber() {
       return ContactNumber; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setContactNumber(String ContactNumber) {
        boolean flag= false;
         int count=0;
        int len= ContactNumber.length();
        char [] aphoneNumber= new char [len];
        aphoneNumber= ContactNumber.toCharArray();
        if(len==11)
        {
            if(aphoneNumber[0]>='0' && aphoneNumber[0]<='9' && aphoneNumber[1]>='0' && aphoneNumber[1]<='9' && aphoneNumber[2]>='0' && aphoneNumber[2]<='9' && aphoneNumber[3]>='0' && aphoneNumber[3]<='9' && aphoneNumber[4]>='0' && aphoneNumber[4]<='9' && aphoneNumber[5]>='0' && aphoneNumber[5]<='9' && aphoneNumber[6]>='0' && aphoneNumber[6]<='9' && aphoneNumber[7]>='0' && aphoneNumber[7]<='9' && aphoneNumber[8]>='0' && aphoneNumber[8]<='9' && aphoneNumber[9]>='0' && aphoneNumber[9]<='9' && aphoneNumber[10]>='0' && aphoneNumber[10]<='9')
            {
                count= count+1;
            }
      
     
            if(count==1)
            {
                this.ContactNumber= ContactNumber;
                flag=true;
            }
        }
    return flag;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return Email; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmail(String Email) {
        boolean test=true;
        int index = 0;
        char[] ch = new char[Email.length()];
        
        if (ch[0] == '@') {
            test= false;
        } else {
            for (int i = 1; i < Email.length(); i++) {
                if (ch[i] == '@') {
                    index = i;
                    break;
                }
            }
            if (ch[index] == '.') {
               test = false;
            }
        }
        if (test== true) {
            this.Email= Email;
            return true;
            
        } else {
           return false;

        }
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCNIC() {
        return CNIC; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCNIC(String CNIC) {
        boolean flag= false;
        int count=0;
        int len= CNIC.length();
        char [] aCNIC= new char [len];
        aCNIC= CNIC.toCharArray();
        if(len==13)
        {
            if(aCNIC[0]>='0' && aCNIC[0]<='9' && aCNIC[1]>='0' && aCNIC[1]<='9' && aCNIC[2]>='0' && aCNIC[2]<='9' && aCNIC[3]>='0' && aCNIC[3]<='9' && aCNIC[4]>='0' && aCNIC[4]<='9' && aCNIC[5]>='0' && aCNIC[5]<='9' && aCNIC[6]>='0' && aCNIC[6]<='9' && aCNIC[7]>='0' && aCNIC[7]<='9' && aCNIC[8]>='0' && aCNIC[8]<='9' && aCNIC[9]>='0' && aCNIC[9]<='9' && aCNIC[10]>='0' && aCNIC[10]<='9' && aCNIC[11]>='0' && aCNIC[11]<='9' && aCNIC[12]>='0' && aCNIC[12]<='9'  )
            {
                count= count+1;
            }
      
     
            if(count==1)
        {
            this.CNIC= CNIC;
            flag=true;
        }
    }
    return flag;
   }
         //To change body of generated methods, choose Tools | Templates.
    

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
