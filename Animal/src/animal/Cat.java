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
public class Cat extends Animal implements Pet{
protected String name;
    public Cat() {
        System.out.println("Cat adopted");
    }
    public Cat(String name) {
        System.out.println("This cat called " + name);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String newName){
        name = newName;
    }
    @Override
    public void play(){
        System.out.println("Cat is playing");
    }
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }    
}
