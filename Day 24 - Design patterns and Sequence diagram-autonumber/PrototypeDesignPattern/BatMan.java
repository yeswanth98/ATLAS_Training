package PrototypeDesignPattern;

class BatMan extends HumanBeing {
    public BatMan(String name) {
        super(name, "BatMan");
    }

    @Override
    public void walk() {
        System.out.println("BatMan walks...");
    }

    @Override
    public void see() {
        System.out.println("Bat-cave vision!");
    }

    @Override
    public void talk() {
        System.out.println("I'm Batman.");
    }

    public void superDooperRich() {
        System.out.println("Batman's gadgets are limitless!");
    }

    public void smart() {
        System.out.println("Batman's intellect at work!");
    }

    public void kindHearted() {
        System.out.println("I fight for justice.");
    }
}