import java.util.Stack;

class Task8 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(50);
        s.push(100);
        System.out.println(s.isEmpty());
        System.out.println(s);
    }
}