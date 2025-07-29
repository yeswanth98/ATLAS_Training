// Abstraction
interface IProduct {
    void SeeReviews();
    void getSample();
}

// Low-level module 1
class Clothes implements IProduct {
    @Override
    public void SeeReviews() {
        System.out.println("Clothes rating: 4.5/5");
    }

    @Override
    public void getSample() {
        System.out.println("Viewing clothes sample...");
    }
}

// Low-level module 2
class Books implements IProduct {
    @Override
    public void SeeReviews() {
        System.out.println("Books rating: 4.7/5");
    }

    @Override
    public void getSample() {
        System.out.println("Reading book sample...");
    }
}

// High-level module (depends on IProduct interface, not concrete classes)
class Cupboard {
    private IProduct product;

    public void addProduct(IProduct product) {
        this.product = product;
    }

    public void customizeProduct() {
        if (product != null) {
            product.getSample();
            product.SeeReviews();
        } else {
            System.out.println("No product added.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard();

        // Adding Clothes
        IProduct clothes = new Clothes();
        cupboard.addProduct(clothes);
        System.out.println("=== Clothes ===");
        cupboard.customizeProduct();

        // Adding Books
        IProduct books = new Books();
        cupboard.addProduct(books);
        System.out.println("\n=== Books ===");
        cupboard.customizeProduct();
    }
}