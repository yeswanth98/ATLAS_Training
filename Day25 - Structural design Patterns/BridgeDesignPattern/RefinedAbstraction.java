package BridgeDesignPattern;

class CircleShape extends ShapeBridge {
    private int radius;

    public CircleShape(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with radius " + radius + ", " + color.fill());
    }
}