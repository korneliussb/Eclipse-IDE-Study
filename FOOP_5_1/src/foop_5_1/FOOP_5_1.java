package foop_5_1;
/*@author Kornelius S B*/
public class FOOP_5_1 {

    public class Animal{
        public void makeNoise(){
            System.out.println("talk");
        }
    }
    
    public class Dog extends Animal{
        public void makeNoise(){
            System.out.println("Bark");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animaldog = new Dog();
        animaldog.makeNoise();
        
        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }
        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }
        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }
        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
    
}
