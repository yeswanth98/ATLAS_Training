// Low-level module 1
class Clothes {
    void seeRating() {
        System.out.println("Clothes rating: 4.5/5");
    }

    void viewSample() {
        System.out.println("Viewing clothes sample...");
    }
}

// Low-level module 2 (newly added)
class Books {
    void seeRating() {
        System.out.println("Books rating: 4.7/5");
    }

    void readSample() {
        System.out.println("Reading book sample...");
    }
}

// High-level module that directly depends on low-level modules (DIP Violation)
class Cupboard {
    Clothes clothes;   // tight coupling
    Books books;       // tight coupling

    void addClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    void addBooks(Books books) {
        this.books = books;
    }

    void customizeClothes() {
        if (clothes != null) {
            clothes.viewSample();
            clothes.seeRating();
        }
    }

    void previewBooks() {
        if (books != null) {
            books.readSample();
            books.seeRating();
        }
    }

    // Main method to run
    public static void main(String[] args) {
        // Create instances of low-level modules
        Clothes clothes = new Clothes();
        Books books = new Books();

        // Create cupboard and inject the dependencies
        Cupboard cupboard = new Cupboard();
        cupboard.addClothes(clothes);
        cupboard.addBooks(books);

        // Interact with the cupboard
        System.out.println("=== Customizing Clothes ===");
        cupboard.customizeClothes();

        System.out.println("\n=== Previewing Books ===");
        cupboard.previewBooks();
    }
}