/*Q9. Write a Java program demonstrating interfaces, method overriding, and method
overloading. Define a Vehicle interface with abstract methods accelerate() and
brake(). Implement Car and Bicycle classes that override these methods with specific
messages for acceleration and braking. Introduce method overloading in both classes
by defining multiple accelerate() methods with different parameters (e.g., speed,
duration). In the VehicleApp class, instantiate Car and Bicycle objects, test
overridden methods, and invoke overloaded accelerate() methods to showcase
polymorphism. */
public class Q9 {
    public static void main(String[] args) {
        // Instantiate Car and Bicycle objects
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Test overridden methods
        car.accelerate();
        car.brake();
        bicycle.accelerate();
        bicycle.brake();

        // Test overloaded accelerate methods
        Car myCar = new Car();
        myCar.accelerate(60);
        myCar.accelerate(60, 10);

        Bicycle myBicycle = new Bicycle();
        myBicycle.accelerate(20);
        myBicycle.accelerate(20, 5);
    }
}

interface Vehicle {
    void accelerate();
    void brake();
}

class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    // Overloaded methods
    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Overloaded methods
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }
}
