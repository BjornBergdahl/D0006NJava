/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schemat;

import java.util.Date;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;

/**
 *
 * @author Björn
 */
public class Handelse {
    /** 
     * Handelse creates an instance of a schemanotification
     */
   private String titel = new String();
   private String plats = new String();
   private Date datum = new Date();   

    /**
     * @return the titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * @param titel the titel to set
     */
    
    
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * @return the plats
     */
    public String getPlats() {
        return plats;
    }

    /**
     * @param plats the plats to set
     */
    public void setPlats(String plats) {
        this.plats = plats;
    }

    /**
     * @return the datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }
   
   
}
