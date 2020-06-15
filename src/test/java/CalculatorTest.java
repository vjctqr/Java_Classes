import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(20, 5);
    }

    @Test
    public void canAdd(){
        assertEquals(25, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(15, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(100, calculator.multiply());
    }

    @Test
    public void canDivide(){
        Calculator newNumbers = new Calculator(5.00, 2.00);
        assertEquals(2.5, newNumbers.divide(), 0.1);
    }




}
