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
        System.out.println("Animal");
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Animal was walking");
    }
    public void eat(){
        System.out.println("Animal were eating");
    }

    public static void main(String[] args) {
        Animal Binatang = new Animal();      
        Binatang.walk();
        Binatang.eat();
        
        Spider Tarantula = new Spider();       
        Tarantula.eat();
        
        Cat Persia = new Cat("Persia");
        Cat Anggora = new Cat();
        Persia.play();
        Persia.eat();
        
        Fish Nemo = new Fish();
        Nemo.play();
        Nemo.walk();
        Nemo.eat();
        
    }
    
}
