import java.util.*;

class Task013 {
    public static void main(String[] args) {

        LinkedList <String> lobj = new LinkedList<>();

        lobj.add("Prasunamba");
        lobj.add("Meher");
        lobj.add(".MK");
        lobj.add("Yeswanth");

        Spliterator<String> sitobj = lobj.spliterator();

        Spliterator<String> sitobj2 = sitobj.trySplit();


        System.out.println("Splititerator 1");

        while (sitobj.tryAdvance(n)-> {System.out.println(n);});
        while (sitobj2.tryAdvance(n)-> {System.out.println(n);});
    }
}