public class HomeTask01_SRPViolation {

    // Book class that violates SRP by mixing data, formatting, and logic
    public class Book {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getFormattedTitle() {
            return "Title: " + title.toUpperCase();
        }

        public double calculateDiscountedPrice(double discountPercentage) {
            return price * (1 - discountPercentage);
        }

        public String getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class to access inner class
        HomeTask01_SRPViolation homeTask = new HomeTask01_SRPViolation();
        Book book = homeTask.new Book("Effective Java", "Joshua Bloch", 550.0);

        // Printing formatted title - presentation logic inside Book class
        System.out.println(book.getFormattedTitle());

        // Calculating discounted price - business logic inside Book class
        double discountedPrice = book.calculateDiscountedPrice(0.10); // 10% discount
        System.out.println("Discounted Price: ₹" + discountedPrice);

        // Printing author - simple data access
        System.out.println("Author: " + book.getAuthor());
    }
}
