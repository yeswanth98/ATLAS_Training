abstract class Bird {
    abstract void fly() ;
}
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println(" Eagles fly");
    }
}
class Ostrich  extends Bird {
    @Override
    public void fly() { // dummy implentation
        System.out.println("cant fly high but It lays big egg");
    }
}
class HomeTask_ViolationofLiskovPrinciple_Task05 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird ostrich = new Ostrich();
        eagle.fly();
        ostrich.fly();
    }
}
