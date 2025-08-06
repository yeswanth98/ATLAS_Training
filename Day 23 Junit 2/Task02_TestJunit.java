import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task02_TestJunit {
    //Customer cobj = new Customer();
    //cobj.testCaseCust();
    String message = "hello all How are you";

    @Test
    public void testMsg() {
        assertEquals("hello all How are you", message);
        System.out.println("Task02_TestJunit passed");
    }
}