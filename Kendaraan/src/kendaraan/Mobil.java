/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author STUDENT
 */
public class Mobil extends Kendaraan{
    //constructor
    public Mobil(){
        super();
        System.out.println("Sebuah objek Mobil baru dibuat !");
    }
    //methode
    @Override
    public void bergerak(){
        System.out.println("Mobil dapat bergerak...");
    }
    
    @Override
    public void mengerem(){
        System.out.println("Mobil dapat mengerem...");
    }
    
    public void berjalanMundur(){
        System.out.println("Mobil dapat Berjalan Mundur...");
    }
}
    

