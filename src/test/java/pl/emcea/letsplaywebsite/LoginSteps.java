package pl.emcea.letsplaywebsite;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends SpringBootBaseIntegrationTest  {
    @When("the client calls \\/health")
    public void the_client_calls_health() {
    }

    @Then("the client receives response status code of {int}")
    public void the_client_receives_response_status_code_of(Integer int1) {
    }

}
