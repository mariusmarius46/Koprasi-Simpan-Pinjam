/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.versi2;




/**
 *
 * @author raka
 */
public class Dog extends ProfileAnimal implements PetOut, Petinfo{

    public Dog() {
    }

    
    public Dog(String nama, String breed) {
        super(nama, breed);
    }

    
    @Override
    public void sound() {
        System.out.println("Gog...Gog...Gog...");
    }

    @Override
    public void info() {
        System.out.println("Info dog....");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", Umur : " + AGE_DOG + '}';
    }
    
   
    
}
