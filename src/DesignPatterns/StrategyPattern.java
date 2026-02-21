/*
    STRATEGY PATTERN

    Intent:
    Define a family of algorithms (strategies),
    encapsulate each one, and make them interchangeable
    at runtime WITHOUT modifying existing code.

    Real-world example:
    Payment systems (Card, UPI, PayPal, Stripe)

    PURE STRATEGY PATTERN
    No factory.
    Strategy is injected from outside.
*/

package DesignPatterns;

interface Payment {
    void pay(double amount);
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class StripePayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Stripe");
    }
}

class PaymentProcessor {

    private Payment payment;

    // Constructor Injection
    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    // runtime switch
    public void setPayment(Payment payment){
        this.payment = payment;
    }
}

public class StrategyPattern {

    public static void main(String[] args) {

        Payment payment = new CardPayment();

        PaymentProcessor processor = new PaymentProcessor(payment);
        processor.process(500);

        // Runtime change
        processor.setPayment(new StripePayment());
        processor.process(1000);
    }
}
