import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

/* we create a class calculator step definitions which contain the steps we need to fulfill the requirements
using given when then.  The first line @given/when/then is what the function is supposed to do, the next line is the function
must be public void and have a name representing the requirement to be met, then the logic is added  */

public class CalculatorStepDefinitions {

    private Calculator calc;
    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        calc = new Calculator();

        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calc.push(int1);
        calc.push(int2);
        calc.push("+");
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("the result is {int}")
    public void the_result_is(double expected) {
        Number value = calc.value();
        assertEquals(expected, value);
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(Integer int1, Integer int2) {
        calc.push(int2);
        calc.push(int1);
        calc.push("-");
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

}
