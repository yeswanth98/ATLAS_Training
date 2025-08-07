package FactoryDesignPattern;

class CheezyPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheezy FactoryDesignPattern.Pizza with extra cheese...");
    }
}