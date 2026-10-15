class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }

    void stop() {
        System.out.println("Vehicle stops.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery is charging.");
    }
}

public class Q9ElectricCar {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.stop();
        e.drive();
        e.chargeBattery();
    }
}