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
public class PrescribePatients extends Patients{
    
    private String Description;
    private String Tests;
    private String PrescribedDisease;

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Tests
     */
    public String getTests() {
        return Tests;
    }

    /**
     * @param Tests the Tests to set
     */
    public void setTests(String Tests) {
        this.Tests = Tests;
    }

    /**
     * @return the PrescribedDisease
     */
    public String getPrescribedDisease() {
        return PrescribedDisease;
    }

    /**
     * @param PrescribedDisease the PrescribedDisease to set
     */
    public void setPrescribedDisease(String PrescribedDisease) {
        this.PrescribedDisease = PrescribedDisease;
    }
    
    
    
            
    
}
