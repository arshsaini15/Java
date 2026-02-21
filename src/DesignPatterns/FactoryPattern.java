package DesignPatterns;

/*
    FACTORY PATTERN

    Intent:
    Provide a single place responsible for object creation.

    WHY?

    Instead of writing:

        if(type.equals("dog")) new Dog();
        else new Cat();

    everywhere in the codebase,
    we centralize it inside a Factory.
*/

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog sound");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat sound");
    }
}


/*
    FACTORY CLASS
    Responsible ONLY for object creation.
*/

class AnimalFactory {
    public static Animal getAnimal(String type){

        if(type == null){
            throw new IllegalArgumentException("Type cannot be null");
        }

        switch(type.toLowerCase()){

            case "dog":
                return new Dog();

            case "cat":
                return new Cat();

            default:
                throw new IllegalArgumentException("Unknown animal type");
        }
    }
}


public class FactoryPattern {
    public static void main(String[] args) {

        String type = "dog"; // imagine coming from API

        Animal animal = AnimalFactory.getAnimal(type);
        animal.sound();
    }
}
