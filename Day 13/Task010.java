import java.util.LinkedList;
import java.util.ListIterator;

public class Task010 {
    public static void main(String[] args) {
        LinkedList <String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");
        fruits.add("Guava");

        ListIterator <String> itfruits = fruits.listIterator();

        while (itfruits.hasNext()) {
            System.out.println(itfruits.next() + " ");
        }

    }
}