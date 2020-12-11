package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTests {
    @Test
    void positiveTest() {
        Assertions.assertEquals(48, 6 * 8);
    }

    @Test
    void negativeTest() {
        Assertions.assertTrue(Math.PI == 3.14);
    }
}
