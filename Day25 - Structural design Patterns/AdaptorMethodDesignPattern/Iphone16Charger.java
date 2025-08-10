package AdaptorMethodDesignPattern;

public class Iphone16Charger implements Charger{
    Iphone16Charger() {
    }

    @Override
    public void Charge() {
        System.out.println("I am a charging iphone 16");
    }

    @Override
    public void removeCharge() {
        System.out.println("Stopped charging iPhone 16");
    }
}
