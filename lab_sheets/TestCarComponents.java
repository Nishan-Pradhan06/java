// Car.java (outer class)
class Car {
    // Inner class: Wheel
    class Wheel {
        void rotate() {
            System.out.println("Wheel rotate");
        }
    }

    // Static nested class: Engine
    static class Engine {
        void start() {
            System.out.println("Engine start");
        }
    }
}

// TestCarComponents.java (separate class to instantiate and use objects)
public class TestCarComponents {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine();
        engine.start();

   
        Car car = new Car(); 
        Car.Wheel wheel = car.new Wheel();
        wheel.rotate();
    }
}
