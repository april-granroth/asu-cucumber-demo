package asu.example.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import sun.security.util.PendingException;

/**
 * Created by april.granroth on 1/25/17.
 */
public class IndustryPartnersStepDefinitions {
    private IndustryPartners partners;

    @Given("^we require a minimum of (\\d+) industry partners attending meetings$")
    public void we_require_a_minimum_of_industry_partners_attending_meetings(int minimum) throws Throwable {
        if (this.partners == null){
            this.partners = new IndustryPartners();
        }
        this.partners.setMinimumPartners(minimum);

    }


    @When("^we have (\\d+) industry partners attend the meetings$")
    public void we_have_industry_partners_attend_the_meetings(int actualParticipants) throws Throwable {
        if (this.partners == null){
            fail ("Need to have a minimum number of partners defined for industry");
        }
        this.partners.setActualNumberPartners(actualParticipants);

    }

    @Then("^we can (.*)$")
    public void we_can_continue_having_meetings(String action) throws Throwable {

        assertEquals(action, this.partners.getAction());
    }

    @Then("^we ate lunch happily$")
    public void we_ate_lunch_happily() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
