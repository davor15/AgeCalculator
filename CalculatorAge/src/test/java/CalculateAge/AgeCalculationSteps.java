package CalculateAge;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AgeCalculationSteps {
    private String birthdate;
    private int ageInDays;

    @Given("the user provides a birthdate {string}")
    public void theUserProvidesABirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @When("the user calculates the age")
    public void theUserCalculatesTheAge() {
        ageInDays = AgeCalculator.calculateAgeInDays(birthdate);
    }

    @Then("the age in days should be {int}")
    public void theAgeInDaysShouldBe(int expectedAgeInDays) {
        Assert.assertEquals(expectedAgeInDays, ageInDays);
    }
}
