import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCase02 {

    String message = "hello all How are you";

    @Test
    @Tags("firstPriority")
    void testMethod01() {
        assertEquals(3, 1 | 2);
    }

    @Test
    @Tag("firstPriority")
    void runTestcase02() {
        assertEquals("hello", message);
    }

    @Test
    @Tags("fastTag")
    void testMethod03() {
        assertEquals(5, Math.max(3,5));
    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
        assertEquals("hello all How are you", message);
    }
}