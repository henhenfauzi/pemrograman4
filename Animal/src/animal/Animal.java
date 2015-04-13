/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author ASUS 451LN
 */
public class Animal {

    protected int legs;
    
    public Animal(){
        
    }
    protected Animal(int legs){
        System.out.println("Breeding an Animal");
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Animal can walk");
    }

    public void eat(){
        System.out.println("Animal can eat");
    }

    public static void main(String[] args) {
        Cat kucing = new Cat();
        Fish ikan = new Fish();
        Spider laba = new Spider();
        
        kucing.eat();
        kucing.walk();
        
        ikan.play();
        ikan.walk();
        
        laba.eat();
    }
    
}
