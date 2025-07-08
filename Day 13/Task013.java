import java.util.*;

class Task013 {
    public static void main(String[] args) {

        LinkedList <String> lobj = new LinkedList<>();

        lobj.add("Prasunamba");
        lobj.add("Meher");
        lobj.add(".MK");

        Spliterator<String> sitobj = lobj.spliterator();

        System.out.println("Splitting the list:");

        sitobj.forEachRemaining(System.out::println);
    }
}