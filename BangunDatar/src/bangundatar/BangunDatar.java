/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS 451LN
 */
public class BangunDatar {

    private int sisi;
    private int a,b,c;
    float keliling;
    float luas;
    
    public BangunDatar(){
}

public BangunDatar(String Nama){
    System.out.print(Nama);
}

public void KelPersegi(float sisi){
    sisi = sisi * 4;
    System.out.println(sisi);
    }
public void LPersegi(float sisi){
    sisi *= sisi;
    System.out.println(sisi);
}
public void KelSegitiga(float kel, float a, float b, float c){
    keliling = a + b + c;
    System.out.println(keliling);
}
public void Lsegitiga(float a, float tinggi , float luas){
    luas = (a * tinggi ) / 2;
    System.out.println(luas);
}

public void Kelpp(float a, float b, float kel){
    kel = (a+b) * 2;
    System.out.println(kel);
}

public void Lpp(float a, float b, float Lpp){
    Lpp = a * b;
    System.out.println(Lpp);
}

    public static void main(String[] args) {
    
      BangunDatar Luas = new BangunDatar("Luas Persesgi = ");
      Luas.LPersegi(10);
        
      BangunDatar Kel = new BangunDatar("Keliling Persegi = ");
      Kel.KelPersegi(10);
        
      BangunDatar Lppanjang = new BangunDatar("Luas persegi panjang = ");
      Lppanjang.Lpp(4,5,0);
        
      BangunDatar Kelppanjang = new BangunDatar("Keliling Persegi Panjang = ");
      Kelppanjang.Kelpp(8,4,0);
        
      BangunDatar Lseg = new BangunDatar("Luas Segitiga = ");
      Lseg.Lsegitiga(2,25,0);
        
      BangunDatar KelSeg = new BangunDatar("Keliling Segitiga = ");
      KelSeg.KelSegitiga(0,10,10,10);
        
       
}
    
}
