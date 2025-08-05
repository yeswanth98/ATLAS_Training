import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task08 {

    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        return -1;
    }

    @Test
    void testCompareWhenFirstIsGreater() {
        Task08 obj = new Task08();
        assertEquals(1, obj.compare(10, 5));
    }

    @Test
    void testCompareWhenSecondIsGreater() {
        Task08 obj = new Task08();
        assertEquals(-1, obj.compare(5, 10));
    }

    @Test
    void testCompareWhenEqual() {
        Task08 obj = new Task08();
        assertEquals(-1, obj.compare(5, 5));  // your logic returns -1 even if equal
    }
}