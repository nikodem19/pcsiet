/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcsiet;

/**
 *
 * @author Nikodém Babirád
 */
public class Sprava {
    private Zariadenie odosielatel;
    private String sprava;
    private Zariadenie ciel;

    


   

    

    public void setCiel(Zariadenie ciel) {
        this.ciel = ciel;
    }

    public void setOdosielatel(Zariadenie odosielatel) {
        this.odosielatel = odosielatel;
    }

    public void setSprava(String sprava) {
        this.sprava = sprava;
    }

    public Zariadenie getCiel() {
        return ciel;
    }

    public Zariadenie getOdosielatel() {
        return odosielatel;
    }

    public String getSprava() {
        return sprava;
    }
    
    
    
    
    public void posli(Zariadenie ciel){
        ciel.pridajSpravu(this);
    }
    
    
}
