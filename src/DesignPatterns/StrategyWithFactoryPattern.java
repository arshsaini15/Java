package DesignPatterns;

import java.util.HashMap;
import java.util.Map;

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Upi");
    }
}

class PaymentFactory {
    private static Map<String, Payment> strategies = new HashMap<>();

    static {
        strategies.put("stripe", new StripePayment());
        strategies.put("upi", new UpiPayment());
        strategies.put("card", new CardPayment());
    }

    public static Payment getPayment (String type) {

        Payment payment = strategies.get(type.toLowerCase());

        if(payment == null) {
            throw new IllegalArgumentException("Invalid payment type");
        }

        return payment;
    }
}

public class StrategyWithFactoryPattern {
    public static void main(String[] args) {
        String type = "upi"; // assuming came with api

        Payment payment = PaymentFactory.getPayment(type);
        PaymentProcessor processor = new PaymentProcessor(payment);

        processor.process(2000);
    }
}
