package CompositePattern;

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void brandName() {
        System.out.println("Brand: " + name);
    }
}