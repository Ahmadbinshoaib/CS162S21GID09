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
public class Patients extends Person{
    
    private String PatientID;
    private String Name;
    private String ContactNumber;
    private String Email;
    private String CNIC;
    private String bloodgroup;
    private String Gender;
    private String Address;
    private String MartialStatus;
    private String Age;
    private String TokenNumber;
    private String Disease;
    private String DoctorName;
    private String Deparment;
    private String DateTime;
    private String RoomNo;
    private String AppointmentDate;

    /**
     * @return the AppointmentDate
     */
    public String getAppointmentDate() {
        return AppointmentDate;
    }

    /**
     * @param AppointmentDate the AppointmentDate to set
     */
    public void setAppointmentDate(String AppointmentDate) {
        this.AppointmentDate = AppointmentDate;
    }

    
    
    /**
     * @return the RoomNo
     */
    public String getRoomNo() {
        return RoomNo;
    }

    /**
     * @param RoomNo the RoomNo to set
     */
    public void setRoomNo(String RoomNo) {
        this.RoomNo = RoomNo;
    }
    
    
    
    
    public String getAge() {
       return Age; //To change body of generated methods, choose Tools | Templates.
    }

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
    public String getName() {
        return Name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setName(String Name) {
        boolean flag= true;   
    int count=0;
    int len= Name.length();
    char[] aname= new char[len];
    aname= Name.toCharArray();
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

    /**
     * @return the TokenNumber
     */
    public String getTokenNumber() {
        return TokenNumber;
    }

    /**
     * @param TokenNumber the TokenNumber to set
     */
    public void setTokenNumber(String TokenNumber) {
        this.TokenNumber = TokenNumber;
    }

    /**
     * @return the Disease
     */
    public String getDisease() {
        return Disease;
    }

    /**
     * @param Disease the Disease to set
     */
    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    /**
     * @return the DoctorName
     */
    public String getDoctorName() {
        return DoctorName;
    }

    /**
     * @param DoctorName the DoctorName to set
     */
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    /**
     * @return the Deparment
     */
    public String getDeparment() {
        return Deparment;
    }

    /**
     * @param Deparment the Deparment to set
     */
    public void setDeparment(String Deparment) {
        this.Deparment = Deparment;
    }

    /**
     * @return the DateTime
     */
    public String getDateTime() {
        return DateTime;
    }

    /**
     * @param DateTime the DateTime to set
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    /**
     * @return the PatientID
     */
    public String getPatientID() {
        return PatientID;
    }

    /**
     * @param PatientID the PatientID to set
     */
    public boolean setPatientID(String PatientID) {
        this.PatientID = PatientID;
        return true;
    }
    
    
}
