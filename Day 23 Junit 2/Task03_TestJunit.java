import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;

public class Task03_TestJunit {

    String msg = "running test01 ";

    MessageUtil msgUtilobj = new MessageUtil(msg);
    //MessageUtil is a utility class
    //store a message
    @Ignore
    @Test
    public void msgTest() {
        assertEquals(msg, msgUtilobj.printMessage());
        System.out.println("Task03_TestJunit passed");
    }
}