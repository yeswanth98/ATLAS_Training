import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task09 {

    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 < n2) return -1;
        return 0;
    }

    @Test
    void testCompareWhenFirstIsGreater() {
        Task09 obj = new Task09();
        assertEquals(1, obj.compare(10, 5));
    }

    @Test
    void testCompareWhenSecondIsGreater() {
        Task09 obj = new Task09();
        assertEquals(-1, obj.compare(5, 10));
    }

    @Test
    void testCompareWhenEqual() {
        Task09 obj = new Task09();
        assertEquals(0, obj.compare(5, 5));
    }
}