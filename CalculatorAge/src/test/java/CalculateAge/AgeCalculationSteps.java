package CalculateAge;
import CalculateAge.AgeCalculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AgeCalculationSteps {
    private AgeCalculator ageCalculator;
    private String birthdate;
    private int calculatedAgeInDays;

    @Given("the user provides a birthdate {string}")
    public void the_user_provides_a_birthdate(String birthdate) {
        this.birthdate = birthdate;
        ageCalculator = new AgeCalculator();
    }

    @When("the user calculates the age")
    public void the_user_calculates_the_age() {
        calculatedAgeInDays = ageCalculator.calculateAgeInDays(birthdate);
    }

    @Then("the age in days should be {int}")
    public void the_age_in_days_should_be(int expectedAge) {
        Assert.assertEquals(expectedAge, calculatedAgeInDays);
    }
}




