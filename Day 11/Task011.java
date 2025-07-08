import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task011{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,2,1);
        List<Integer> RemoveDups = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(RemoveDups);
    }
}