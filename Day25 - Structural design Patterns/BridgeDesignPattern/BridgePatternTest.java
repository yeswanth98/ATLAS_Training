package BridgeDesignPattern;

public class BridgePatternTest {
    public static void main(String[] args) {
        ShapeBridge redCircle = new CircleShape(10, new RedColor());
        ShapeBridge greenCircle = new CircleShape(20, new GreenColor());

        redCircle.draw();
        greenCircle.draw();
    }
}