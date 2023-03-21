import calculator.Calculator ;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator = new Calculator();
    private static final double DELTA = 1e-15;
    @Test
    void computeFactorial() {
        assertEquals( 120, MathCalculator.computeFactorial(5), DELTA);
        assertEquals( 1, MathCalculator.computeFactorial(0), DELTA);
        assertEquals( 2, MathCalculator.computeFactorial(2), DELTA);
        assertEquals( 3628800, MathCalculator.computeFactorial(10), DELTA);
        assertEquals( 720, MathCalculator.computeFactorial(6), DELTA);

    }

    @Test
    void computeSquareRoot() {
        assertEquals( 4, MathCalculator.computeSquareRoot(16), DELTA);
        assertEquals( 1, MathCalculator.computeSquareRoot(1), DELTA);
        assertEquals( 9, MathCalculator.computeSquareRoot(81), DELTA);
        assertEquals( 6, MathCalculator.computeSquareRoot(36), DELTA);
    }

    @Test
    void computePower() {
        assertEquals(8, MathCalculator.computePower(2, 3), DELTA);
        assertEquals( 1, MathCalculator.computePower(1, 3), DELTA);
        assertEquals(81, MathCalculator.computePower(3, 4), DELTA);
        assertEquals( 64, MathCalculator.computePower(4, 3), DELTA);
        assertEquals( 64, MathCalculator.computePower(4, 3), DELTA);

    }

    @Test
    void computeNaturalLog() {
        assertEquals( 0, MathCalculator.computeNaturalLog(1), DELTA);

    }


}
