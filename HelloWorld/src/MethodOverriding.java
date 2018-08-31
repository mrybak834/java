/**
 * Methods are overriden, data members are hidden.
 */
public class MethodOverriding {
    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Audi();
        Audi c = new Audi();

        a.run(); // Car.run
        b.run(); // Audi.run
        c.run(); // Audi.run

        System.out.println(a.speed);            //Car
        System.out.println(b.speed);            //Car
        System.out.println(((Audi) b).speed);   //Audi
        System.out.println(c.speed);            //Audi
    }
}

class Car {
    int speed = 20;
    void run() {
        System.out.println("Car is running");
    }
}

class Audi extends Car {
    int speed = 200;
    void run() {
        System.out.println("Audi is running");
    }
}