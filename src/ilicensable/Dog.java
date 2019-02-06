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
public class Dog extends Pet implements Ilicensable{
    protected License license;
    
    public Dog(String name, License license) {
        super(name);
        this.license = license;
        
    }

    @Override
    public void speak() {
        System.out.println("guau");
    }

    @Override
    public License getLicense() {
        return this.license;
    }
    
}
