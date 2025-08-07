package FactoryDesignPattern;

public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        PizzaFactory cheezyFactory = new CheezyPizzaFactory();
        PizzaFactory pepperoniFactory = new PepperoniPizzaFactory();

        Pizza pizza1 = cheezyFactory.createPizza();
        pizza1.prepare();
        pizza1.bake();
        pizza1.cut();
        pizza1.boxIt();

        System.out.println();

        Pizza pizza2 = pepperoniFactory.createPizza();
        pizza2.prepare();
        pizza2.bake();
        pizza2.cut();
        pizza2.boxIt();
    }
}