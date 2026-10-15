class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

interface Electric {
    void chargeBattery();
}

class ElectricCar extends Car implements Electric {
    public void chargeBattery() {
        System.out.println("Battery is charging.");
    }
}

public class Q18ElectricCar {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
    }
}