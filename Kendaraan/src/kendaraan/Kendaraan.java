/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author STUDENT
 */
public class Kendaraan {

    //constructor
    public Kendaraan(){
    }
    private int tanggalProduksi;
    //methode
    protected void bergerak(){
        System.out.println("Kendaraan dapat bergerak...");
    }
    //methode
    public void mengerem(){
        System.out.println("Kendaraan dapat mengerem...");
    }
    public static void main(String[] args) {
    Kendaraan kendaraan1 = new Kendaraan();
    kendaraan1.bergerak();
    kendaraan1.mengerem();
        
    Mobil mobil1 = new Mobil();
    mobil1.bergerak();
    mobil1.mengerem();
    mobil1.berjalanMundur();
    
    Pesawat pesawat1 = new Pesawat();
    pesawat1.mengerem();
    pesawat1.terbang();
    }
}
