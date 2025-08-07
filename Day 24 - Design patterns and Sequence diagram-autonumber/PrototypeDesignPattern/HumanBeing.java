package PrototypeDesignPattern;
public abstract class HumanBeing implements Cloneable {
    String name;
    String type;

    public HumanBeing(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void walk();
    public abstract void see();
    public abstract void talk();

    @Override
    public HumanBeing clone() {
        try {
            return (HumanBeing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Prototype clone failed", e);
        }
    }
}