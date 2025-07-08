import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task013{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Yeswanth","Anand","Kumar","Sanawar");
        List<String> names_sorted = names.stream().sorted().collect(Collectors.toList());
        System.out.println(names);
        System.out.println(names_sorted);
    }
}