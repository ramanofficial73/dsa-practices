package com.dsa.practices.dec2024.dec27.factory;

public class DogFactory extends AnimalFactory_FactoryMethod {
    public Animal createAnimal() {
        return new Dog();
    }
}