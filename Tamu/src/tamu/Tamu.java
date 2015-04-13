/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamu;

/**
 *
 * @author ASUS 451LN
 */
public class Tamu {

   private int id;
   private String nama;
   private int lama;
   
   Tamu(){
       nama = "Hendrayana";
       System.out.println(nama);
   }
   Tamu(String n){
       nama = n;
       System.out.println(nama);
   }
   
   public void setNama(String iNama){
       Nama = iNama;
   }
   
   public int getNama(){
       return nama;
   }
    
   public double Harga(double iHarga){
       return iHarga;
   }
   
   public double Harga(double iHarga, double mul){
       return iHarga * mul;
   }
   
    public static void main(String[] args) {
   Tamu Hendrayana = new Tamu();
   System.out.println(Hendrayana.Harga(1,120000));
   Tamu Fauzi = new Tamu("Fauzi");
   System.out.println(Hendrayana.Harga(3,120000));
   }
    
}
