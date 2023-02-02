import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 */

public class CalculatorTest {

    @Test
    /** Key Points :
     * Test methods don't need to be public.
     * They don't need to return anything.
     * Unit test as their name suggests only test one thing , one single scenario.
     * Name should be very descriptive.
     */
    void twoPlusTwoShouldEqualFour(){
        Calculator calculator = new Calculator();
        // To verify if our method is working as expected we use Assert Statement.
        Assertions.assertEquals(4,calculator.add(2,2));
        Assertions.assertNotEquals(4,calculator.add(2,5));
    }

    @Test
    void twoPlusThreeShouldEqualFive(){
        Calculator calculator = new Calculator();
        // To verify if our method is working as expected we use Assert Statement.
        Assertions.assertEquals(5,calculator.add(2,3));
    }
}
