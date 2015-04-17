/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Entities;

/**
 *
 * @author GlobalDev
 */
public class MeasurementUnit {
    private int Id;
    private String Description;    
    private String Abbreviation;
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

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
     * @return the Abbreviation
     */
    public String getAbbreviation() {
        return Abbreviation;
    }

    /**
     * @param Abbreviation the Abbreviation to set
     */
    public void setAbbreviation(String Abbreviation) {
        this.Abbreviation = Abbreviation;
    }
}
