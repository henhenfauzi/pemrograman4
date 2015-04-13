/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author ASUS 451LN
 */
public class Mahasiswa {
    private String nama;
    double ongkos;
public Mahasiswa() {
}
public Mahasiswa(String nami) {
    System.out.println(nami);
}
public void setNama(String NamaNew){
    nama = NamaNew;
}
public String getNama(){
    System.out.println("Nama : " + nama);
    return nama;
}

public static double ongkos(int n1){
    return n1*2;
}
public void ongkos(){
    System.out.println(5000);
}

public static void main(String[] args) {
    Mahasiswa ngaran = new Mahasiswa("Fajar");
    System.out.println("Nama : " + ngaran.getNama());
    System.out.println("Ongkos : " + ngaran.getOngkos());
    
    Mahasiswa nami = new Mahasiswa("Rini",5000);
    System.out.println("Nama : " + nami.getNama());
    System.out.println("Ongkos : " + nami.getOngkos());
    }
    
}
