import calculator.Calculator ;

import org.junit.Test ;

import static org.junit.Assert.*;


class CalculatorTest {

    Calculator calculator = new Calculator();
    private static final double DELTA = 1e-15;
    @Test
   public void computeFactorial() {
        assertEquals( 120, calculator.computeFactorial(5), DELTA);
        assertEquals( 1, calculator.computeFactorial(0), DELTA);
        assertEquals( 2, calculator.computeFactorial(2), DELTA);
        assertEquals( 3628800, calculator.computeFactorial(10), DELTA);
        assertEquals( 720, calculator.computeFactorial(6), DELTA);

    }

    @Test
    public void computeSquareRoot() {
        assertEquals( 4, calculator.computeSquareRoot(16), DELTA);
        assertEquals( 1, calculator.computeSquareRoot(1), DELTA);
        assertEquals( 9, calculator.computeSquareRoot(81), DELTA);
        assertEquals( 6, calculator.computeSquareRoot(36), DELTA);
    }

    @Test
    public void computePower() {
        assertEquals(8, calculator.computePower(2, 3), DELTA);
        assertEquals( 1, calculator.computePower(1, 3), DELTA);
        assertEquals(81, calculator.computePower(3, 4), DELTA);
        assertEquals( 64, calculator.computePower(4, 3), DELTA);
        assertEquals( 64, calculator.computePower(4, 3), DELTA);

    }

    @Test
    public void computeNaturalLog() {
        assertEquals( 0, calculator.computeNaturalLog(1), DELTA);

    }


}
