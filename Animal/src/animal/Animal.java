package animal;

public class Animal {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animaldog = new Dog();
        animaldog.makeNoise();
        
        
        // Downcast
        Animal animals = new Dog();
        Dog castedDog = animals();
        castedDog.makeNoise();
        //
        
        //Upcast
        Animal binatang = new Dog();
        binatang.makeNoise();
        
        
        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }
        else if(dog instanceof Animal) {
            System.out.println("dog is Animal");
        }
        else if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }
        else if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }

    
        public void makeNoise(){
            System.out.println("talk");
            }
        
        public static class Dog extends Animal{
            public void makeNoise(){
                System.out.println("Bark");
            }
        }
}

       

