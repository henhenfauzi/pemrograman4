/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author ASUS 451LN
 */
public class Mahasiswa2 {

    private String nama;
    double ongkos;
Mahasiswa2(){
    nama = "Fajar";
    ongkos = 2000;         
}   
Mahasiswa2(String str, double dbl){
    nama = str;
    ongkos = dbl;
}
public String getNama(){
    return nama;
}
public void setNama(String nama){
    this.nama = nama;
}
public double getOngkos(){
    return ongkos;
} 
public void setOngkos(double ongkos){
    this.ongkos = ongkos;
}
class TestOverloading{
public static void main(String[] args) {
    Mahasiswa2 ngaran = new Mahasiswa2();
    System.out.println("Nama : " + ngaran.getNama());
    System.out.println("Ongkos : " + ngaran.getOngkos());
    
    Mahasiswa2 nami = new Mahasiswa2("Rini",5000);
    System.out.println("Nama : " + nami.getNama());
    System.out.println("Nama : " + nami.getNama());
    
    
}
    
        // TODO code application logic here
    }
}    

