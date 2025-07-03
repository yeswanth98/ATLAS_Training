import java.util.Stack;

class Task5 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(89);
        s.push(76);
        System.out.println(s);
        int temp = s.pop();
        System.out.println(temp);
        System.out.println(s);
    }
}