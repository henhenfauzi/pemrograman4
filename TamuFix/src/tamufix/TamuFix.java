/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamufix;

/**
 *
 * @author ASUS 451LN
 */
public class TamuFix {

    private int id_ruangan;
    private String nm_ruangan;
    private int lm_menginap;
    
    TamuFix(){
        
    }
    
    TamuFix(String nama){
        System.out.println("Nama Tamu : " + nama);
    }
    public void setID(int id){
        id_ruangan = id;
    }
    
    public int getID(){
        System.out.println("ID Ruangan : " + id_ruangan);
        return id_ruangan;
    }
    
    public void setNM(String nm){
        nm_ruangan = nm;
    }
    
    public String getNM(){
        System.out.println("Nama Ruangan : " + nm_ruangan);
        return nm_ruangan;
    }
    
    public void setLM(int lm){
        lm_menginap = lm;
    }
    
    public int getLM(){
        System.out.println("Lama menginap : " + lm_menginap + " hari");
        return lm_menginap;
    }
    
    public int jmlBiaya(){
        return 3 * 120000;
    }
    
    public int jmlBiaya(int lama){
        return lama * 120000;
    }
    public static void main(String[] args) {
     TamuFix hendra = new TamuFix();
        hendra.setID(1);
        hendra.setNM("Melati");
        hendra.setLM(10);
        
        hendra.getID();
        hendra.getNM();
        hendra.getLM();
        System.out.println("Jumlah Biaya : " + hendra.jmlBiaya());
    }
    
}
