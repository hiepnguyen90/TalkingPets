package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class MainApplication extends Pet {


    public MainApplication(String name) {
        super(name);
    }


    @Override
    String speak() {
        return null;
    }

    public static void main(String[] args) {

        Pet hiep = new Fish("Hiep");
        Pet tony = new Dog("Tony");
        Pet mary = new Cat("Mary");

        Pet.addPet(hiep);
        Pet.addPet(tony);
        Pet.addPet(mary);

        System.out.print(Pet.pets.toString());
    }
}
