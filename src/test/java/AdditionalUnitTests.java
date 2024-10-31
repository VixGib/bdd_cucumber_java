import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// unit tests for the functions we have created using the 3 A's for different input values

public class AdditionalUnitTests {
    @Test
    public void add_int_1_and_int_2_returns_3(){
        // ARRANGE
        int a = 1;
        int b = 2;
        Number expectedAnswer = 3.0;
        Calculator calc = new Calculator();

        //ACT
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();

        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);

    }

    @Test
    public void add_int_2_and_int_2_returns_4(){
        // ARRANGE
        int a = 2;
        int b = 2;
        Number expectedAnswer = 4.0;
        Calculator calc = new Calculator();

        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();

        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);


    }
}
