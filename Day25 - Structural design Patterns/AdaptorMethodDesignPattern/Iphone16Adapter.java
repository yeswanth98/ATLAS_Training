package AdaptorMethodDesignPattern;

public class Iphone16Adapter implements Iphone {
    private Charger iphone16Charger;

    public Iphone16Adapter() {
        this.iphone16Charger = new Iphone16Charger();
    }
    @Override
    public void onCharge() {
        iphone16Charger.Charge();
    }

    @Override
    public void offCharge() {
        iphone16Charger.removeCharge();
    }
}
