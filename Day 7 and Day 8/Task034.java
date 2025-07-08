public class Task034 {
    void add(int x, int y) {
        System.out.println(x+","+y);
    }

    // Corrected: Removed typo "usage"
    void add(int x, int y, int z) {
        System.out.println(x+","+y+","+z);
    }

    public static void main(String[] args) {
        Task034 calculator = new Task034();
        calculator.add(10, 20);
        calculator.add(50, 20, 30);
    }
}
