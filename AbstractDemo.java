
abstract class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println(brand + " vehicle is starting.");
    }

    abstract void move();
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car moves on four wheels.");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike moves on two wheels.");
    }
}

class Bus extends Vehicle {
    void move() {
        System.out.println("Bus carries many passengers.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Vehicle vehicles[] = {
            new Car(), new Bike(), new Bus()
        };

        for (Vehicle v : vehicles) {
            v.start();
            v.move();
        }
    }
}
