package SOLID;

// L -> Liskov Substitution Principle
// Subtypes must honor the behavioral contract of their base type.

interface Worker {
    void work();
}

interface Eater {
    void eat();
}

// Multiple capabilities — perfectly valid
class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Human is completing assigned tasks.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating food.");
    }
}

// Single capability — also perfectly valid
class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is executing programmed tasks.");
    }
}

// Add another worker to pressure-test substitution
class Dog implements Worker {
    @Override
    public void work() {
        System.out.println("Dog is guarding the house.");
    }
}

public class L {
    public static void makeWork(Worker worker) {
        worker.work();
    }

    public static void makeEat(Eater eater) {
        eater.eat();
    }

    public static void main(String[] args) {

        Worker human = new Human();
        Worker robot = new Robot();
        Worker dog = new Dog();

        makeWork(human);
        makeWork(robot);
        makeWork(dog);

        Eater eater = new Human();
        makeEat(eater);
    }
}
