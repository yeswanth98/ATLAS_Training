package PrototypeMethodDP;

class Shrub implements Plant {
    private String growthType;

    public Shrub() {}
    public Shrub(Shrub source) {
        this.growthType = source.growthType;
    }

    @Override
    public void grow() {
        System.out.println("Shrub is growing upright.");
    }

    @Override
    public String getGrowthType() {
        return growthType;
    }

    @Override
    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    @Override
    public Plant clone() {
        return new Shrub(this);
    }
}