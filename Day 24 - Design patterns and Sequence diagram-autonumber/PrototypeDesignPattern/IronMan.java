package PrototypeDesignPattern;

class IronMan extends HumanBeing {
    public IronMan(String name) {
        super(name, "IronMan");
    }

    @Override
    public void walk() {
        System.out.println("IronMan struts with style!");
    }

    @Override
    public void see() {
        System.out.println("HUD scanning the environment.");
    }

    @Override
    public void talk() {
        System.out.println("I am IronMan.");
    }

    public void fly() {
        System.out.println("IronMan flying!");
    }

    public void intelligent() {
        System.out.println("Tony Stark's genius shines.");
    }

    public void fireShots() {
        System.out.println("IronMan firing repulsors!");
    }

    public void defendHimself() {
        System.out.println("IronMan shields activated!");
    }
}