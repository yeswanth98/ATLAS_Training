class Wheel {
    public Wheel() {
        System.out.println("Wheel created");
    }
}

class Car {
    private Wheel[] wheels; // Composition: Car owns the wheels

    public Car() {
        // Car creates and owns its 4 wheels
        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    // Getter if needed
    public Wheel[] getWheels() {
        return wheels;
    }
}

public class HomeTask_Composition_Task03 {
    public static void main(String[] args) {
        Car myCar = new Car(); // All wheels are created with the car
    }
}
