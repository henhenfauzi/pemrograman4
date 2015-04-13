/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author STUDENT
 */
public class Hewan {
    //constructor
    public Hewan(){
    }
    //methode
    protected void tidur(){
        System.out.println("Hewan dapat tidur...");
    }
    //methode
    public void makan(){
        System.out.println("Hewan dapat makan...");
    }

    public static void main(String[] args) {
        
    Hewan hewan1 = new Hewan();
    hewan1.tidur();
    hewan1.makan();
    
    Kucing kucing1 = new Kucing();
    kucing1.bermain();
    kucing1.makan();
    
    Harimau harimau1 = new Harimau();
    harimau1.tidur();
    harimau1.makan();
            
    }
}
