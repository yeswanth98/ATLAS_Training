package PrototypeMethodDP;

class PrototypePatternDemo {
    public static void main(String[] args) {
        Plant creeperPrototype = new Creeper();
        creeperPrototype.setGrowthType("Crawl");

        Plant shrubPrototype = new Shrub();
        shrubPrototype.setGrowthType("Upright");

        Plant clonedCreeper = creeperPrototype.clone();
        Plant clonedShrub = shrubPrototype.clone();

        System.out.println("Prototype Creeper Growth: " + creeperPrototype.getGrowthType());
        clonedCreeper.grow();

        System.out.println("Prototype Shrub Growth: " + shrubPrototype.getGrowthType());
        clonedShrub.grow();

        // You can also customize clones further:
        clonedShrub.setGrowthType("Bonsai form");
        System.out.println("Modified cloned Shrub Growth: " + clonedShrub.getGrowthType());
    }
}