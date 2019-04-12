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
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Duck duck = new Duck("Angsa", "lokal");
            Cat cat = new Cat("Si Manis", "Cianjur");
            Dog dog = new Dog("Blacky", "Bandung");
            Spaniel spaniel = new Spaniel("Herder", "Toy", "Bandung");
            
            PetOut[] myAnimal={duck, cat, spaniel, dog};
            for (PetOut animal : myAnimal){
                System.out.println(animal);
                System.out.println("Sound :: ");
                animal.sound();
            }
            
            Petinfo[] animalInfo = {dog, spaniel};
            for (Petinfo animal : animalInfo){
                System.out.println(animal);
                animal.info();
            }
    }
    
}
