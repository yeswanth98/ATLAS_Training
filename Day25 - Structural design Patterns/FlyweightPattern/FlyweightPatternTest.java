package FlyweightPattern;

public class FlyweightPatternTest {
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[i]);
            circle.setX(i * 10);
            circle.setY(i * 20);
            circle.setRadius(5);
            circle.draw();
        }
    }
}