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
public class Switch extends Zariadenie{
    private String id;
    private List<Zariadenie> pripojeneZariadenia = new ArrayList<>();
    
    public Switch() {
        
    }
    
    public void pridajZariadenie(Zariadenie z) {
        pripojeneZariadenia.add(z);
        if(z instanceof Pocitac) {
            ((Pocitac) z).setPripojeneNa(this);
        }
        
    }
    
    public void vypisPripojeneZariadenia() {
        System.out.println("Zariadenia pripojené na SW:");
        for (Object object : pripojeneZariadenia) {
            System.out.println(object);
        }
    }
    
    public void preposli(Sprava s){
        s.posli(s.getCiel());
    }

    @Override
    public void pridajSpravu(Sprava s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
