/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun;

/**
 *
 * @author ASUS 451LN
 */
public class Bangun {
    private int sisi;
    private int a,b,c;
    float keliling;
    float luas;
    
public Bangun(){
}

public Bangun(String Nama){
    System.out.print(Nama);
}

public void KelilingPersegi(float sisi){
    sisi = 4 * sisi;
    System.out.println(sisi);
    }
public void LuasPersegi(float sisi){
    sisi *= sisi;
    System.out.println(sisi);
}
public void KelilingSegitiga(float kel, float a, float b, float c){
    keliling = a + b + c;
    System.out.println(keliling);
}
public void Luassegitiga(float a, float tinggi , float luas){
    luas = (a * tinggi ) / 2;
    System.out.println(luas);
}

public void LuasPersegipanjang(float a, float b, float LuasPersegipanjang){
    LuasPersegipanjang = a * b;
    System.out.println(LuasPersegipanjang);
}

public void Kelilingpersegipanjang(float a, float b, float kel){
    kel = 2* (a+b);
    System.out.println(kel);
    }

public static void main(String[] args) {
    Bangun Luas = new Bangun("Luas Persegi = ");
        Luas.LuasPersegi(10);
        
        Bangun Kel = new Bangun("Keliling Persegi = ");

        Kel.KelilingPersegi(10);
        
        Bangun LuasPersegipanjang = new Bangun("Luas Persegi Panjang = ");
        LuasPersegipanjang.LuasPersegipanjang(4,5,0);
        
        Bangun KelilingPersegipanjang = new Bangun("Keliling Persegi Panjang = ");
        KelilingPersegipanjang.KelilingPersegipanjang(8,4,0);
        
        Bangun Luassegitiga = new Bangun("Luas Segitiga = ");
        Luassegitiga.Luassegitiga(2,25,0);
        
        Bangun KelilingSegitiga = new Bangun("Keliling Segitiga = ");
        KelilingSegitiga.KelilingSegitiga(0,10,10,10);
        
       }

    private void KelilingPersegipanjang(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
