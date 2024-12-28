package com.dsa.practices.dec2024.dec27.factory;

public class AnimalFactory_Simple {
    public static Animal createAnimal(String animalType) {
        if ("Dog".equals(animalType)) {
            return new Dog();
        } else if ("Cat".equals(animalType)) {
            return new Cat();
        }
        return null;
    }
}