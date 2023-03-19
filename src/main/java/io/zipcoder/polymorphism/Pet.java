package io.zipcoder.polymorphism;


import java.util.ArrayList;

public abstract class Pet {
    protected String name;
    protected static ArrayList<Pet> pets = new ArrayList<>();

    public Pet(String name) {
        this.name = name;
    }

    abstract String speak();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void addPet(Pet name){
        pets.add(name);
    }

    public String toString(){
        return this.name;
    }
}

