package com.dsa.practices.desginPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrategyDesignPattern {

    /*
        Definition: Strategy Pattern defines a family of algorithms, encapsulates each one,
        and makes them interchangeable at runtime.
        Key point: Instead of using if-else to pick an algorithm, we inject it via composition.
    */
    public static void main(String[] args) {
        // Register strategies in a map
        Map<String, Payment> strategies = new HashMap<>();
        strategies.put("CARD", new CardPayment());
        strategies.put("UPI", new UpiPayment());

        // Runtime user choice (input or config)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Payment Method (CARD / UPI): ");
        String method = sc.nextLine().toUpperCase();

        // Directly fetch strategy, no if-else
        Payment payment = strategies.get(method);

        if (payment == null) {
            throw new IllegalArgumentException("Invalid payment method: " + method);
        }

        ShoppingCart cart = new ShoppingCart();
        cart.setPayment(payment);
        cart.checkout(1000);
    }

    /* Context */
    public static class ShoppingCart {
        private Payment payment;

        public void setPayment(Payment payment) {
            this.payment = payment;
        }

        public void checkout(int amount) {
            payment.pay(amount);
        }
    }

    /*  Strategy */
    interface Payment {
        void pay(int amount);
    }

    /* Concrete Strategies */
    public static class CardPayment implements Payment {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " by Card");
        }
    }

    public static class UpiPayment implements Payment {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " by UPI");
        }
    }
}
