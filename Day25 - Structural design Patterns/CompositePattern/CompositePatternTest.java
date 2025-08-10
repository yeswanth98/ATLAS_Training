package CompositePattern;

public class CompositePatternTest {
    public static void main(String[] args) {
        Leaf apple = new Leaf("Apple");
        Leaf samsung = new Leaf("Samsung");
        Leaf sony = new Leaf("Sony");

        Composite phoneBrands = new Composite("Phone Brands");
        phoneBrands.add(apple);
        phoneBrands.add(samsung);

        Composite allBrands = new Composite("All Brands");
        allBrands.add(phoneBrands);
        allBrands.add(sony);

        allBrands.brandName();
    }
}