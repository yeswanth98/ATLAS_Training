class Main {

    // SRP-compliant Book class: only holds data
    static class Book {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }
    }

    // Handles formatting logic
    static class BookFormatter {
        public String getFormattedTitle(Book book) {
            return "Title: " + book.getTitle().toUpperCase();
        }
    }

    // Handles discount logic
    static class DiscountCalculator {
        public double calculateDiscountedPrice(Book book, double discountPercentage) {
            return book.getPrice() * (1 - discountPercentage);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 550.0);

        BookFormatter formatter = new BookFormatter();
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println(formatter.getFormattedTitle(book));
        System.out.println("Author: " + book.getAuthor());

        double discountedPrice = calculator.calculateDiscountedPrice(book, 0.10);
        System.out.println("Discounted Price: ₹" + discountedPrice);
    }
}