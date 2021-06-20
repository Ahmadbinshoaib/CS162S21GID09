/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria
 */

public class HealthCareSystem {
    static HealthCareSystem instance;
    //static HealthCareSystem a= new HealthCareSystem();
    
    public List<DeskPersonal>desklist;
    public List<IndManager>imlist;
    public List<IndWorker>iwlist ;
    public List<Doctor>dlist;
    public List<Pharmacist>plist;
    public List<Patients>Patientlist;
    public List<Patients>EPatientlist;
    
    HealthCareSystem(){
         desklist= new ArrayList<>();
         imlist= new ArrayList<>();
         iwlist= new ArrayList<>();
         dlist= new ArrayList<>();
         plist= new ArrayList<>();
         Patientlist= new ArrayList<>();
     }
    
    public static HealthCareSystem getInstance(){
        if(instance==null)
        {
            instance = new HealthCareSystem();
        }
        
        return instance;
    }
     
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      HealthCareSystem h= HealthCareSystem.getInstance();
        h.loadDeskPerson();
        h.loadDoctor();
        h.loadPharmacist();
        h.loadIndustrialManager();
        h.loadWorker();
        EKnowMain a= new EKnowMain();
        a.setVisible(true);
        
        
        
        
    }
    
    public void addList( DeskPersonal a)
    {
        desklist.add(a);
    }
    
   public void deleteEmployee(int a)
   {
       desklist.remove(a);
   }
   
   public void updateEmployee(DeskPersonal b, int a)
   {
       desklist.set(a,b);
       
   }
   
   public boolean saveDeskPerson() 
    {
        try (FileWriter fw = new FileWriter("DeskPersons.txt",false);){
            
            for(int i = 0 ; i< desklist.size() ; i++ )
          {
            fw.write(desklist.get(i).getDeskID()+","+desklist.get(i).getName()+","+desklist.get(i).getContactNumber()+","+ desklist.get(i).getEmail()+","+ desklist.get(i).getCNIC()+","+ desklist.get(i).getAge() +","+ desklist.get(i).getGender()+","+ desklist.get(i).getMartialStatus()+
                            ","+ desklist.get(i).getSalary()+","+ desklist.get(i).getDateofJoining()+","+ desklist.get(i).getBloodgroup()+","+ desklist.get(i).getAddress()+","+desklist.get(i).getUsername()+","+ desklist.get(i).getPassword()+"\n"  ) ; 
          }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
 
    }
   
    public void loadDeskPerson() 
    {
        
        try {
            
            FileReader fr = null;
            try {
                fr = new FileReader("DeskPersons.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            
            String read = br.readLine();
            while(read!=null){
                String []array=read.split(",");
                
                DeskPersonal s = new DeskPersonal();
                s.setDeskID(array[0]);
                s.setName(array[1]);
                s.setContactNumber(array[2]);
                s.setEmail(array[3]);
                s.setCNIC(array[4]);
                s.setAge(array[5]);
                s.setGender(array[6]);
                s.setMartialStatus(array[7]);
                s.setSalary(array[8]);
                s.setDateofJoining(array[9]);
                s.setBloodgroup(array[10]);
                s.setAddress(array[11]);
                s.setUsername(array[12]);
                s.setPassword(array[13]);
                
                
               this.desklist.add(s);
               
                
                read =br.readLine();
                
            }
            fr.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }
   
   public void addIM( IndManager a)
    {
        imlist.add(a);
    }
    
   public void deleteIM(int a)
   {
      imlist.remove(a);
   }
   
   public void updateIM(IndManager b, int a)
   {
       imlist.set(a,b);
       
   }
   
   public boolean saveIndustrialManager() 
    {
        try (FileWriter fw = new FileWriter("IndustrialManagers.txt",false);){
            
            for(int i = 0 ; i< imlist.size() ; i++ )
          {
            fw.write(imlist.get(i).getIMID()+","+imlist.get(i).getName()+","+imlist.get(i).getContactNumber()+","+ imlist.get(i).getEmail()+","+ imlist.get(i).getCNIC()+","+ imlist.get(i).getAge() +","+ imlist.get(i).getGender()+","+ imlist.get(i).getMartialStatus()+
                            ","+ imlist.get(i).getSalary()+","+ imlist.get(i).getDateofJoining()+","+ imlist.get(i).getBloodgroup()+","+ imlist.get(i).getAddress()+","+imlist.get(i).getUsername()+","+ imlist.get(i).getPassword()+","+imlist.get(i).getDesignation()+"\n"  ) ; 
          }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
 
    }
   
   
   public void loadIndustrialManager() 
    {
        
        try {
            
            FileReader fr = null;
            try {
                fr = new FileReader("IndustrialManagers.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            
            String read = br.readLine();
            while(read!=null){
                String []array=read.split(",");
                
                IndManager s = new IndManager();
                s.setIMID(array[0]);
                s.setName(array[1]);
                s.setContactNumber(array[2]);
                s.setEmail(array[3]);
                s.setCNIC(array[4]);
                s.setAge(array[5]);
                s.setGender(array[6]);
                s.setMartialStatus(array[7]);
                s.setSalary(array[8]);
                s.setDateofJoining(array[9]);
                s.setBloodgroup(array[10]);
                s.setAddress(array[11]);
                s.setUsername(array[12]);
                s.setPassword(array[13]);
                s.setDesignation(array[14]);
                
               this.imlist.add(s);
               
                
                read =br.readLine();
                
            }
            fr.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }
    
    public void addIW( IndWorker a)
    {
        iwlist.add(a);
    }
    
   public void deleteIW(int a)
   {
      iwlist.remove(a);
   }
   
   public void updateIW(IndWorker b, int a)
   {
       iwlist.set(a,b);
       
   }
   
   public boolean saveWorker() 
    {
        try (FileWriter fw = new FileWriter("Workers.txt",false);){
            
            for(int i = 0 ; i< iwlist.size() ; i++ )
          {
            fw.write(iwlist.get(i).getIWID()+","+iwlist.get(i).getName()+","+iwlist.get(i).getContactNumber()+","+ iwlist.get(i).getEmail()+","+ iwlist.get(i).getCNIC()+","+ iwlist.get(i).getAge() +","+ iwlist.get(i).getGender()+","+ iwlist.get(i).getMartialStatus()+
                            ","+ iwlist.get(i).getSalary()+","+ iwlist.get(i).getDateofJoining()+","+ iwlist.get(i).getBloodgroup()+","+ iwlist.get(i).getAddress()+","+iwlist.get(i).getUsername()+","+ iwlist.get(i).getPassword()+","+iwlist.get(i).getLabour()+"\n"  ) ; 
          }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
 
    }
   
   public void loadWorker() 
    {
        
        try {
            
            FileReader fr = null;
            try {
                fr = new FileReader("Workers.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            
            String read = br.readLine();
            while(read!=null){
                String []array=read.split(",");
                
                IndWorker s = new IndWorker();
                s.setIWID(array[0]);
                s.setName(array[1]);
                s.setContactNumber(array[2]);
                s.setEmail(array[3]);
                s.setCNIC(array[4]);
                s.setAge(array[5]);
                s.setGender(array[6]);
                s.setMartialStatus(array[7]);
                s.setSalary(array[8]);
                s.setDateofJoining(array[9]);
                s.setBloodgroup(array[10]);
                s.setAddress(array[11]);
                s.setUsername(array[12]);
                s.setPassword(array[13]);
                s.setLabour(array[14]);
                
               this.iwlist.add(s);
               
                
                read =br.readLine();
                
            }
            fr.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }
   
   public void addD( Doctor a)
    {
        dlist.add(a);
    }
    
   public void deleteD(int a)
   {
      dlist.remove(a);
   }
   
   public void updateD(Doctor b, int a)
   {
       dlist.set(a,b);
       
   }
   
   public boolean saveDoctor() 
    {
        try (FileWriter fw = new FileWriter("Doctors.txt",false);){
            
            for(int i = 0 ; i< dlist.size() ; i++ )
          {
            fw.write(dlist.get(i).getDID()+","+dlist.get(i).getName()+","+dlist.get(i).getContactNumber()+","+ dlist.get(i).getEmail()+","+ dlist.get(i).getCNIC()+","+ dlist.get(i).getAge() +","+ dlist.get(i).getGender()+","+ dlist.get(i).getMartialStatus()+
                            ","+ dlist.get(i).getSalary()+","+ dlist.get(i).getDateofJoining()+","+ dlist.get(i).getBloodgroup()+","+ dlist.get(i).getAddress()+","+dlist.get(i).getUsername()+","+ dlist.get(i).getPassword()+","+ dlist.get(i).getDepartment()+","+dlist.get(i).getSpecialization()+"\n" ) ;
          }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
 
    }
    
   public void loadDoctor() 
    {
        
        try {
            
            FileReader fr = null;
            try {
                fr = new FileReader("Doctors.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            
            String read = br.readLine();
            while(read!=null){
                String []array=read.split(",");
                
                Doctor s = new Doctor();
                s.setDID(array[0]);
                s.setName(array[1]);
                s.setContactNumber(array[2]);
                s.setEmail(array[3]);
                s.setCNIC(array[4]);
                s.setAge(array[5]);
                s.setGender(array[6]);
                s.setMartialStatus(array[7]);
                s.setSalary(array[8]);
                s.setDateofJoining(array[9]);
                s.setBloodgroup(array[10]);
                s.setAddress(array[11]);
                s.setUsername(array[12]);
                s.setPassword(array[13]);
                s.setDepartment(array[14]);
                s.setSpecialization(array[15]);
                
               this.dlist.add(s);
               
                
                read =br.readLine();
                
            }
            fr.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }
   
   
   public void addP( Pharmacist a)
    {
        plist.add(a);
    }
    
   public void deleteP(int a)
   {
      plist.remove(a);
   }
   
   public void updateP(Pharmacist b, int a)
   {
       plist.set(a,b);
       
   }
   
  public boolean savePharmacist() 
    {
        try (FileWriter fw = new FileWriter("Pharmacists.txt",false);){
            
            for(int i = 0 ; i< plist.size() ; i++ )
          {
            fw.write(plist.get(i).getPID()+","+plist.get(i).getName()+","+plist.get(i).getContactNumber()+","+ plist.get(i).getEmail()+","+ plist.get(i).getCNIC()+","+ plist.get(i).getAge() +","+ plist.get(i).getGender()+","+ plist.get(i).getMartialStatus()+
                            ","+ plist.get(i).getSalary()+","+ plist.get(i).getDateofJoining()+","+ plist.get(i).getBloodgroup()+","+ plist.get(i).getAddress()+","+plist.get(i).getUsername()+","+ plist.get(i).getPassword()+","+ plist.get(i).getDepartment()+","+plist.get(i).getCategory()+"\n" ) ;
          }
         fw.flush();
         fw.close();
         return true;
          
        } catch (Exception e) {
            return false;
        }
 
    }
  
  public void loadPharmacist() 
    {
        
        try {
            
            FileReader fr = null;
            try {
                fr = new FileReader("Pharmacists.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            
            String read = br.readLine();
            while(read!=null){
                String []array=read.split(",");
                
                Pharmacist s = new Pharmacist();
                s.setPID(array[0]);
                s.setName(array[1]);
                s.setContactNumber(array[2]);
                s.setEmail(array[3]);
                s.setCNIC(array[4]);
                s.setAge(array[5]);
                s.setGender(array[6]);
                s.setMartialStatus(array[7]);
                s.setSalary(array[8]);
                s.setDateofJoining(array[9]);
                s.setBloodgroup(array[10]);
                s.setAddress(array[11]);
                s.setUsername(array[12]);
                s.setPassword(array[13]);
                s.setCategory(array[14]);
                s.setSpecialization(array[15]);
                
               this.plist.add(s);
               
                
                read =br.readLine();
                
            }
            fr.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(HealthCareSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }
  
  
  public void addPatient( Patients a)
    {
        Patientlist.add(a);
    }
  
  public void addEmergencyPatient( Patients a)
    {
        EPatientlist.add(a);
    }
  

  
}
