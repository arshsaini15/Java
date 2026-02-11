package SOLID;

// O -> Open/Closed Principle (A class should be open for extension but closed for modification.)

interface PaymentService {
    public void pay();
}

class Stripe implements PaymentService {
    @Override
    public void pay() {}
}

class GooglePay implements PaymentService {
    @Override
    public void pay() {}
}

public class O {
    public static void main(String[] args) {

    }
}
