//Abstraction:-) The process of hiding certain details and showing only essential information to the user.
//Abstract classes- A class that cannot be instantiated and is often used as a base class for other classes. It can contain abstract methods (methods without a body) that must be implemented by subclasses.
//Abstract methods- A method that is declared without an implementation. Subclasses that inherit from an abstract class must provide an implementation for all abstract methods.
abstract class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract void startEngine();

    public void displayInfo() {
        System.out.println("Vehicle Model: " + model + " (" + year + ")");
    }
}

class Car extends Vehicle {

    public Car(String model, int year) {
        super(model, year);
    }

    public void startEngine() {
        System.out.println(model + " starts with a key ignition and purrs to life.");
    }
}

class Bike extends Vehicle {

    public Bike(String model, int year) {
        super(model, year);
    }

    public void startEngine() {
        System.out.println(model + " starts with a kick-start or self-start button.");
    }
}

public class day5 {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Honda Civic", 2026);
        Vehicle myBike = new Bike("Yamaha ", 2025);

        myCar.displayInfo();
        myCar.startEngine();

        System.out.println();

        myBike.displayInfo();
        myBike.startEngine();
    }
}