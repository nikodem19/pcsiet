/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcsiet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikodém
 */
public class Pocitac extends Zariadenie{
    private String id;
    private Switch pripojeneNa;
    private List<Sprava> zoznamSprav = new ArrayList<>();
    
    public Pocitac() {
        
    }

    public void setPripojeneNa(Switch pripojeneNa) {
        this.pripojeneNa = pripojeneNa;
    }

    public Switch getPripojeneNa() {
        return pripojeneNa;
    }
    
    public void posliSpravu(Sprava s){
        //zisti switch a posli cez neho
        pripojeneNa.preposli(s);
        zoznamSprav.remove(s);
        
    }
    
    public void vypisSpravy() {
        System.out.println("Správy:");
        for (Sprava sprava : zoznamSprav) {
            System.out.println(sprava.getSprava());
        }
    }
    
    
    public Sprava vytvorSpravu(String str, Zariadenie zar) {
        Sprava spr=new Sprava();
        spr.setCiel(zar);
        spr.setOdosielatel(this);
        spr.setSprava(str);
        
        zoznamSprav.add(spr); 
        return spr;
    }
    
    public void vypisZoznamSprav() {
        System.out.println("Zoznam Správ:");
        for (Sprava sprava : zoznamSprav) {
            System.out.println(sprava);
        }
    }

    @Override
    public void pridajSpravu(Sprava s) {
        zoznamSprav.add(s);
    }

    

}
