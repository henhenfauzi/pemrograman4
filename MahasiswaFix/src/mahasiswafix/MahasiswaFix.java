/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswafix;

/**
 *
 * @author Adi Fahman
 */
public class MahasiswaFix {
    private String nama;
    //double ongkos;
    
    /* Contstuctor */
    MahasiswaFix(){
        nama = "Fajar";
        System.out.println(nama);
    }
    MahasiswaFix(String n){
        nama = n;
        System.out.println(nama);
    }
    
    /* Method */
    public void setNama(String iNama){
        nama = iNama;
    }
    public String getNama(){
        return nama;
    }
    public double Ongkos(double iOngkos){
        return iOngkos;
    }
    public double Ongkos(double iOngkos, double mul){
        return iOngkos * mul;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MahasiswaFix fajar = new MahasiswaFix();
        System.out.println(fajar.Ongkos(2000,2));
        MahasiswaFix rini = new MahasiswaFix("Rini");
        System.out.println(fajar.Ongkos(5000));
    }
    
}
