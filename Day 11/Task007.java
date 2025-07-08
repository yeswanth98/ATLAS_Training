import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task007 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareOfNums = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(squareOfNums);
    }
}