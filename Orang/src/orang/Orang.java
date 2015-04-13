/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orang;

/**
 *
 * @author ASUS 451LN
 */
public class Orang {

    private String nama;
    private String nim;
    private String nip;
    private double gaji;
    
    public Orang(){
    }
    public void nama(){
        System.out.println("Hendrayana");
    }
    public void cetakInfo(){
    }
    public static void main(String[] args) {
        Orang orang1 = new Orang();
        orang1.nama();
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama();
        mahasiswa1.nim();
        
        Dosen dosen1 = new Dosen();
        dosen1.nama();
        dosen1.nip();
        dosen1.gaji();
    }
    
}
