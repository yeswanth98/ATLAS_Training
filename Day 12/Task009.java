import java.util.LinkedList;

public class Task009 {
    public static void main(String[] args) {
        LinkedList <String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");
        fruits.add("Guava");

        LinkedList <String> cloned = (LinkedList<String>) fruits.clone();

        System.out.println("\n original linked list: " + fruits);
        System.out.println("\n Cloned: " + cloned);

        cloned.add("Berries");

        System.out.println("\n original linked list: " + fruits);
        System.out.println("\n Cloned: " + cloned);

    }
}

