package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    String speak() {
        return "Woof!";
    }
}