package com.dsa.practices.dec2024.dec27.factory;

public class FactoryDesignPattern {
    /*
     * The Factory Design Pattern is a creational design pattern that provides an interface for
     * creating objects but allows subclasses or concrete classes to decide which class to
     * instantiate. This is particularly useful when object creation is complex or
     * when you want to delegate responsibility for creating objects.
     *
     * Types of Factory Design Patterns:
     * 1. Simple Factory
     * 2. Factory Method
     * 3. Abstract Factory
     *
     * 1. Simple Factory Pattern:
     * The Simple Factory pattern is a straightforward design where a class creates instances of
     * different classes based on input. The client provides a parameter,
     * and the factory method creates and returns the appropriate object.
     * #UseCase: When you have simple creation logic that doesn't need polymorphism.
     *
     * 2. Factory Method Pattern:
     * In the Factory Method pattern, the class doesn't know exactly which object to create,
     * and instead, it delegates the creation process to subclasses.
     * This allows subclasses to decide the type of object to create.
     * #UseCase: When you want subclasses to define how to create objects.
     *
     * 3. Abstract Factory Pattern:
     * The Abstract Factory pattern provides an interface for creating families of related or
     * dependent objects. It allows the client to work with a family of products that are designed
     * to work together. The client does not need to know the concrete classes of the products.
     * #UseCase: When you need families of related objects (e.g., UI components for Windows vs Mac).
     *
     * Advantages of Factory Pattern:
     * 1. Centralized Creation: The creation logic is isolated in one place, making it easier to change or extend.
     * 2. Loosely Coupled: The client code does not need to know the concrete class of the objects it uses.
     * 3. Flexibility: You can easily introduce new types of objects by extending the factory.
     *
     **/
}
