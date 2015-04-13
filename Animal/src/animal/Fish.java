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
public class Fish extends Animal implements Pet{
protected String name;
    public Fish() {
        System.out.println("There is a Fish");
    }
    public Fish(String name) {
        //super(this.name);
        System.out.println("This Fish called " + name);
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
        System.out.println("Fish was playing");
    }
    @Override
    public void walk(){
        System.out.println("Fish was swimming");
    }
    @Override
    public void eat(){
        System.out.println("Fish was eating");
    }    
}
