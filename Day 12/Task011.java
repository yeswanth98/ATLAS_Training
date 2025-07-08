import java.util.LinkedList;

class Task011 {
    public static void main(String[] args) {
        LinkedList <Integer> randomintegers = new LinkedList<>();

        randomintegers.push(89);
        randomintegers.push(932);
        randomintegers.push(525);

        System.out.println(randomintegers);

        randomintegers.pop();

        System.out.println(randomintegers);
    }
}