import java.util.Stack;

class Task7 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(89);
        s.push(67);
        s.push(100);
        System.out.println(s);
        System.out.println(s.search(100));
        System.out.println(s.search(89));
        System.out.println(s.peek());
    }
}