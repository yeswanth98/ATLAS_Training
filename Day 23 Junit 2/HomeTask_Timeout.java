import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeTask_Timeout {
    //Customer cobj = new Customer();
    //cobj.testCaseCust();
    String message = "hello all How are you";

    @Test(timeout = 5)
    public void test() throws InterruptedException {
        Thread.sleep(150);
        assertEquals("hello all How are you", message);
        System.out.println("Task02_TestJunit passed");
    }
}