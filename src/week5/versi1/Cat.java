/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.versi1;


/**
 *
 * @author raka
 */
public class Cat extends ProfileAnimal implements PetOut{

    public Cat() {
    }

    public Cat(String nama, String breed) {
        super(nama, breed);
    }

    
    @Override
    public void sound() {
        System.out.println("Meong...Meong...Meong...");
}

    @Override
    public String toString() {
        return "Cat{" + super.toString() + ", Umur : " + AGE_CAT +'}';
    }
    
}
