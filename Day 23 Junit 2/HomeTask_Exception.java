import org.junit.Test;

public class HomeTask_Exception{
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int a = 10 / 0;
    }
}
