package FactoryDesignPattern;

abstract class Pizza {
    public abstract void prepare();
    public void bake() {
        System.out.println("Baking pizza...");
    }
    public void cut() {
        System.out.println("Cutting pizza...");
    }
    public void boxIt() {
        System.out.println("Boxing pizza...");
    }
}