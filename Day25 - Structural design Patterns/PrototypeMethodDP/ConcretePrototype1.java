package PrototypeMethodDP;

class Creeper implements Plant {
    private String growthType;

    public Creeper() {}
    public Creeper(Creeper source) {
        this.growthType = source.growthType;
    }

    @Override
    public void grow() {
        System.out.println("Creeper is growing by crawling.");
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
        return new Creeper(this);
    }
}