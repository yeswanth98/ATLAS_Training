import java.util.LinkedList;

public class Task005 {
    public static void main(String[] args) {
        LinkedList <String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");
        fruits.add("Guava");

        System.out.println("Before replacing: " + fruits);
        
        fruits.set(2,"Berries");

        System.out.println("After Replacing: " + fruits);

    }
}