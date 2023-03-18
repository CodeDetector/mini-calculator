import calculator.Calculator ;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    void multiplication() {
        assertEquals(15, calculator.multiplication(5,3), DELTA);
        assertEquals(24, calculator.multiplication(6,4), DELTA);
        assertNotEquals(120, calculator.multiplication(5,8), DELTA);
        assertNotEquals(80, calculator.multiplication(4,10), DELTA);

    }

    @Test
    void cuberoot() {
        assertEquals(5, calculator.cuberoot(125), DELTA);
        assertEquals(-5, calculator.cuberoot(-125), DELTA);
        assertNotEquals(11, calculator.cuberoot(121), DELTA);
        assertNotEquals(3, calculator.cuberoot(8), DELTA);
    }

    @Test
    void square() {

        assertEquals( 16, calculator.square(4), DELTA);
        assertEquals(1, calculator.square(1), DELTA);
        assertNotEquals( 10, calculator.square(3), DELTA);
        assertNotEquals(20, calculator.square(4), DELTA);
    }

    @Test
    void sub() {
        assertEquals(2, calculator.sub(5,3), DELTA);
        assertEquals(-2, calculator.sub(6,8), DELTA);
        assertNotEquals(3, calculator.sub(5,8), DELTA);
        assertNotEquals(-1, calculator.sub(5,4), DELTA);
    }
}