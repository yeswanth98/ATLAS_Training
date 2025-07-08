import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task009{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddNums = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(oddNums);
    }
}