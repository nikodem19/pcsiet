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
public class Hlavna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Siet s1 = new Siet();
        
        Switch sw1 = new Switch();
        Switch sw2 = new Switch();
        
        s1.pridajZariadenie(sw1);
        s1.pridajZariadenie(sw2);
        
        Pocitac pc1 = new Pocitac();
        s1.pridajZariadenie(pc1);
        
        Pocitac pc2 = new Pocitac();
        s1.pridajZariadenie(pc2);
        
        sw1.pridajZariadenie(pc1);
        sw1.pridajZariadenie(pc2);
        
        sw1.pridajZariadenie(sw2);
        
        Pocitac pc3 = new Pocitac();
        s1.pridajZariadenie(pc3);
        sw2.pridajZariadenie(pc3);
        
        sw2.pridajZariadenie(sw1);
        
        Sprava sprava1 = pc1.vytvorSpravu("ahoj",pc3);
        pc1.vypisZoznamSprav();
        pc2.vypisZoznamSprav();
        pc1.posliSpravu(sprava1);
        System.out.println("posielam Správu...");
                
        pc1.vypisZoznamSprav();        
        pc3.vypisSpravy();
        

        
    }
    
}
