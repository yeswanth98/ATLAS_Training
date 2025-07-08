public class Task035 {
    void add(char x, char y) {
        System.out.println(x+","+y);
    }
    void add(int x, int y) {
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
        Task035 c = new Task035();
        c.add('d','a');
        c.add(50, 20);
    }
}
