package DesignPatterns;

class Car {
    private String engine;
    private int wheels;

     private Car(Builder builder) {
        engine = builder.engine;
        wheels = builder.wheels;
    }

    public void display() {
        System.out.println(engine + " " + wheels);
    }

    public static class Builder {

        private String engine;
        private int wheels;

        public Builder buildEngine(String engine){
            this.engine = engine;
            return this; // returns the same object
        }

        public Builder buildWheels (int wheels) {
            this.wheels = wheels;
            return this; // also returns the same Builder object
        }

        public Car build() {
            return new Car(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        /*

        Car.Builder builder = new Car.Builder();
        builder.buildEngine("V8");
        builder.buildWheels(4);
        Car car = builder.build();

        This code is equivalent to lower code.

         */


        Car car = new Car.Builder()
                .buildEngine("V8")
                .buildWheels(4)
                .build();

        car.display();
    }
}
