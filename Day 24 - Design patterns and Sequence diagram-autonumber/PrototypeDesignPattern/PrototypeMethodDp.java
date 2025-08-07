package PrototypeDesignPattern;

public class PrototypeMethodDp {
    public static void main(String[] args) {
        // Load 'prototypes'
        CloneOfHuman.loadCache();

        // Clone a SpiderMan
        HumanBeing spidey1 = CloneOfHuman.getClone("SpiderMan");
        System.out.println("Cloned: " + spidey1.type);
        spidey1.walk();

        // Clone a BatMan
        HumanBeing bat1 = CloneOfHuman.getClone("BatMan");
        System.out.println("Cloned: " + bat1.type);
        bat1.talk();

        // Clone an IronMan
        HumanBeing iron1 = CloneOfHuman.getClone("IronMan");
        System.out.println("Cloned: " + iron1.type);
        iron1.see();
    }
}