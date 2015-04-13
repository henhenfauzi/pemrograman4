/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author STUDENT
 */
public class Kucing extends Hewan{
    //constructor
    public Kucing(){
        super();
        System.out.println("Sebuah objek Kucing baru dibuat !");
    }
    //methode
    public void bermain(){
        System.out.println("Kucing dapat bermain...");
    }
}
