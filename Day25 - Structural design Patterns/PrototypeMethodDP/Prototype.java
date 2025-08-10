package PrototypeMethodDP;

// Prototype Interface
interface Plant extends Cloneable {
    void grow();

    String getGrowthType();
    void setGrowthType(String growthType);

    Plant clone();
}