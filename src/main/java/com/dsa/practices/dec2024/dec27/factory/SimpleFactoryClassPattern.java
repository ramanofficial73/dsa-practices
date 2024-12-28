package com.dsa.practices.dec2024.dec27.factory;

public class SimpleFactoryClassPattern {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory_Simple.createAnimal("Dog");
        animal1.makeSound();

        Animal animal2 = AnimalFactory_Simple.createAnimal("Cat");
        animal2.makeSound();
    }
}
