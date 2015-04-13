/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author STUDENT
 */
public class Pesawat extends Kendaraan{
    //constructor
    public Pesawat(){
        super();
        System.out.println("Sebuah objek Pesawat baru dibuat !");
    }
    //methode
    @Override
    public void mengerem(){
        System.out.println("Pesawat dapat mengerem...");
    }
    
    public void terbang(){
        System.out.println("Pesawat dapat Terbang...");
    }    
}
