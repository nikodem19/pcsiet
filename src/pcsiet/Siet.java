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
 * @author Nikodém Babirád
 */
public class Siet {
    
    private List<Zariadenie> zariadenia = new ArrayList<>();

    public void vypisZariadenia() {
        System.out.println("Sieť:");
        for (Object object : zariadenia) {
            System.out.println(object);
        }
    }
    
    public void pridajZariadenie(Zariadenie z) {
        zariadenia.add(z);
    }
    
    public void odoberZariadenie(Zariadenie z){
        zariadenia.remove(z);
    }
}
