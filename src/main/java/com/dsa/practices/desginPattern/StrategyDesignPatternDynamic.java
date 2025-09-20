package com.dsa.practices.desginPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

public class StrategyDesignPatternDynamic {

    interface Payment {
        void pay(int amount);
    }

    @Component("CARD")
    static class CardPayment implements Payment {
        public void pay(int amount) {
            System.out.println("Paid by Card");
        }
    }

    @Component("UPI")
    static class UpiPayment implements Payment {
        public void pay(int amount) {
            System.out.println("Paid by UPI");
        }
    }

    @Component
    static class ShoppingCart {
        private final Map<String, Payment> paymentStrategies;

        @Autowired
        public ShoppingCart(Map<String, Payment> paymentStrategies) {
            this.paymentStrategies = paymentStrategies; // Spring auto-wires all beans
        }

        public void checkout(String method, int amount) {
            Payment payment = paymentStrategies.get(method.toUpperCase());
            if (payment == null) throw new IllegalArgumentException("Invalid method");
            payment.pay(amount);
        }
    }
}