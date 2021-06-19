/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maria
 */

public class HealthCareSystem {
    static HealthCareSystem instance;
    static HealthCareSystem a= new HealthCareSystem();
    
    public List<DeskPersonal>desklist= new ArrayList<>();
    public List<IndManager>imlist= new ArrayList<>();
    public List<IndWorker>iwlist= new ArrayList<>();
    public List<Doctor>dlist= new ArrayList<>();
    public List<Pharmacist>plist= new ArrayList<>();
    
    public static HealthCareSystem getInstance(){
        if(instance==null)
        {
            instance = new HealthCareSystem();
        }
        
        return instance;
    }
     
     private HealthCareSystem(){
         
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
}
