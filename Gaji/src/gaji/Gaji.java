/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;
import java.text.DecimalFormat;
/**
 *
 * @author ASUS 451LN
 */
public class Gaji {
    DecimalFormat formattitik = new DecimalFormat("###,###,###.##");
    String namapegawai;
    int umurpegawai;
    String alamatpegawai;
    double gajipegawai;
public Gaji() {
}
public void setNama(String NampegNew){
    namapegawai = NampegNew;
}
public String getNama(){
    System.out.println("Nama : " + namapegawai);
    return namapegawai;
}
public void setUmur(int UmpegNew){
    umurpegawai = UmpegNew;
}
public int getUmur(){
    System.out.println("Umur : " + umurpegawai);
    return umurpegawai;
}
public void setAlamat(String AlpegNew){
    alamatpegawai = AlpegNew;
}
public String getAlamat(){
    System.out.println("Alamat : " + alamatpegawai);
    return alamatpegawai;
}
public void setGaji(double GajpegNew){
    gajipegawai = GajpegNew;
}
public double getGaji(){
    System.out.println("Gaji : Rp." + formattitik.format(gajipegawai));
    return gajipegawai;
}
public void CetakInfo(){
  
}
public static void main(String[] args) {
    Gaji Info = new Gaji();
    Info.setNama("Harun");
    Info.getNama();
    Info.setUmur(34);
    Info.getUmur();
    Info.setAlamat("Jalan Cikutra No.36");
    Info.getAlamat();
    Info.setGaji(2000000);
    Info.getGaji();
    Info.CetakInfo();    
    }    
}
