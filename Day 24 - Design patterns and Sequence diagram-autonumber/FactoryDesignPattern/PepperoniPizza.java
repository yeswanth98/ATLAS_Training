package FactoryDesignPattern;

class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni FactoryDesignPattern.Pizza with pepperoni slices...");
    }
}