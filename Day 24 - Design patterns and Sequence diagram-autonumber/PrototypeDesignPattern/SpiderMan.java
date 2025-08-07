package PrototypeDesignPattern;

class SpiderMan extends HumanBeing {
    public SpiderMan(String name) {
        super(name, "SpiderMan");
    }

    @Override
    public void walk() {
        System.out.println("SpiderMan walks...");
    }

    @Override
    public void see() {
        System.out.println("Spider senses tingling!");
    }

    @Override
    public void talk() {
        System.out.println("Friendly neighborhood SpiderMan!");
    }

    public void crawling() {
        System.out.println("SpiderMan crawling on wall...");
    }

    public void throwingWeb() {
        System.out.println("Throws a web!");
    }
}