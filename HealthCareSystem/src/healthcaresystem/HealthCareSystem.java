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
    
    
}
