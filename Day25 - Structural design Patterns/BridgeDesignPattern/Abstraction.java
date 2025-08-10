package BridgeDesignPattern;

abstract class ShapeBridge {
    protected Color color;

    public ShapeBridge(Color color) {
        this.color = color;
    }

    abstract void draw();
}