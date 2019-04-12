/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author raka
 */
public class Dog implements PetOut, Petinfo{
    private String nama;
    private String breed;

    public Dog() {
    }

    public Dog(String nama, String breed) {
        this.nama = nama;
        this.breed = breed;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
        return "Dog{" + "nama=" + nama + ", breed=" + breed + ", Umur : " + AGE_DOG + '}';
    }
    
   
    
}
