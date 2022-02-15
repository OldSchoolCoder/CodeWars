package kuy8;

import org.junit.Test;

import static org.junit.Assert.*;
import static kuy8.ReturnNegative.*;

public class NegativeTest {

    @Test
    public void main() {
    }

    @Test
    public void testMain() {
        assertEquals(run(1), -1);
        assertEquals(run(-5), -5);
        assertEquals(run(0), 0);
        //ReturnNegative.main(1);
    }
}