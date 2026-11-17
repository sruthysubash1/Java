package sef.module4.activity2;

public class Mammal {


    private Animal myAnimal;

    private String name;

    // TODO: Create constructor for Mammal with parameter name
    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {

        myAnimal = animal;

    }

    public void animalIsSleeping() {

        System.out.println("Animal with name: " + name + " is ...");

        // TODO: Write code so that Animal sleep implementation is used
        myAnimal.sleep();

    }

    public void animalIsSpeaking() {

        System.out.println("Animal with name: " + name + " is ...");

        // TODO: Write code so that Animal animalSound implementation is used
        myAnimal.animalSound();
    }
}
