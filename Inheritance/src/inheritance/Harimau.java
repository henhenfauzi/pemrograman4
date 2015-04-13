/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author STUDENT
 */
public class Harimau extends Hewan{
    //constructor
    public Harimau(){
        super();
        System.out.println("Sebuah objek Harimau baru dibuat !");
    }
    //methode
    
    @Override
    public void tidur(){
        System.out.println("Harimau galak lagi tidur...");
    }
    
    @Override
    public void makan(){
        System.out.println("Harimau makan Daging...");
    }
}
