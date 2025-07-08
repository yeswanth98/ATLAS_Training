import java.util.LinkedList;

public class Task007 {
    public static void main(String[] args) {
        LinkedList <String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");
        fruits.add("Guava");

        System.out.println("\n Using for loop:\n");

        // Using for loop
        for (int i=0; i<fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\n Using for each loop:\n");

        //Using for each loop
        for (String element : fruits){
            System.out.println(element);
        }


    }
}