package module10;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    // 4 test cases for add methods
    @Test
    public void testAddTwoNumbers() {
        assertEquals(15, calculator.add(7, 8));
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        assertEquals(-12, calculator.add(-5, -7));
    }

    @Test
    public void testAddFourPositiveNumbers() {
        assertEquals(32, calculator.add(10, 12, 8, 2));
    }

    @Test
    public void testAddFourMixedNumbers() {
        assertEquals(10, calculator.add(10, -8, 3, 5));
    }

    // 2 test cases for subtract method

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(12, calculator.subtract(20, 8));
    }

    @Test
    public void testSubtractResultInNegative() {
        assertEquals(-4, calculator.subtract(5, 9));
    }

    //2 test cases for divide method

    @Test
    public void testDivideValidNumbers() {
        assertEquals(5, calculator.divide(25, 5));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, calculator.divide(20, 0));
    }

    //2 test cases for multiply method

    @Test
    public void testMultiplyValidNumbers() {
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(9, 0));
    }

}
