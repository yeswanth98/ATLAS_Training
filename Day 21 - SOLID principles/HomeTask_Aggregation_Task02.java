//class Driver {
//    private String name;
//
//    public Driver(String name) {
//        this.name = name;
//    }
//
//    // Getter for name (optional)
//    public String getName() {
//        return name;
//    }
//}
//
//class Car {
//    private Driver driver; // Aggregation
//
//    public Car(Driver driver) {
//        this.driver = driver;
//    }
//
//    // Getter for driver (optional)
//    public Driver getDriver() {
//        return driver;
//    }
//}
//
//public class HomeTask_Task02 {
//    public static void main(String[] args) {
//        Driver driver = new Driver("John");
//        Car myCar = new Car(driver);
//
//        System.out.println("Driver's name: " + myCar.getDriver().getName());
//    }
//}