/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilicensable;

/**
 *
 * @author dmadero
 */
public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void speak() {
        System.out.println("miau");
    }


}
