import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task01_TestJunit {
    @Test(expected = ArithmeticException.class)
    public void testSubtract() {
        int num1 = 10;
        int num2 = 5;
        int res = num1 - num2;
        assertEquals(6 , res);
        System.out.println("Task01_TestJunit passed");
    }
}