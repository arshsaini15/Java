package SOLID;

// L -> Liskov Substitution Principle (Subclasses must be substitutable for their base class.)

interface Bird {}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void fly() {}
}

class Ostrich implements Bird {}

public class L {
    public static void main(String[] args) {

    }
}
