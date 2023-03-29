package Calculator;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    @Test
    public void testFactorial() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(120.0, calculator.factorial(5));
        Assertions.assertEquals(1.0, calculator.factorial(0));
    }


    //comment
    @Test
    public void testSqRoot() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2.0, calculator.sqroot(4));
        Assertions.assertEquals(Double.NaN, calculator.sqroot(-4));
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(8.0, calculator.power(2, 3));
        Assertions.assertEquals(1.0, calculator.power(2, 0));
    }

    @Test
    public void testNaturalLog() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0.0, calculator.naturalLog(1));
        Assertions.assertEquals(Double.NaN, calculator.naturalLog(-1));
    }


}

