import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = null;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldReturnSumOfTwoNumber2And5As7() {
        int sum = calculator.add(2, 5);
        Assertions.assertEquals(7, sum);
    }

    @Test
    void shouldReturn4When6SubtractedFrom10() {
        int sum = calculator.subtract(10, 6);
        Assertions.assertEquals(4, sum);
    }

    @Test
    void shouldReturn20When10MultipliedBy2() {
        int sum = calculator.multiply(10, 2);
        Assertions.assertEquals(20, sum);
    }

    @Test
    void shouldReturn2When10DividedBy5() {
        double value = calculator.divide(10, 5);
        Assertions.assertEquals(2, value);
    }

    @Test
    void shouldReturnArithmeticExceptionsWhenDividedByZero() {
        ArithmeticException arithmeticException = Assertions
                .assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        Assertions.assertEquals("can't divide by zero", arithmeticException.getMessage());
    }
}
