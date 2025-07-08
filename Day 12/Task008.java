import java.util.LinkedList;

public class Task008 {
    public static void main(String[] args) {
        LinkedList <String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");
        fruits.add("Guava");

        System.out.println(fruits);

        Object[] fruitsArray = fruits.toArray();

        for (Object element : fruitsArray){
            System.out.println(element);
        }
    }
}