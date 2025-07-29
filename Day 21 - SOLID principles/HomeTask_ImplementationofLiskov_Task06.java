abstract class BirdsthatFly {
    abstract void fly() ;
}
abstract class BirdsthatDontFly {
    abstract void Speciality() ;
}
class Eagle extends BirdsthatFly {
    @Override
    public void fly() {
        System.out.println(" Eagles fly");
    }
}
class Ostrich  extends BirdsthatDontFly {
    @Override
    public void Speciality() {
        System.out.println("It lays big egg");
    }
}
class HomeTask_ImplementationofLiskov_Task06 {
    public static void main(String[] args) {
        BirdsthatFly eagle = new Eagle();
        BirdsthatDontFly ostrich = new Ostrich();
        eagle.fly();
        ostrich.Speciality();
    }
}