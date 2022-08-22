package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Join;
import tasks.OpenUp;
import tasks.Register;

public class UTestStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());}

    @Given("^than leonardo can automate the page$")
    public void thanLeonardoCanAutomateThePage() {
        OnStage.theActorCalled("Leonardo").wasAbleTo(OpenUp.thePage(), (Join.onThePage()));
          }


    @When("^he seeks to enterthe Utest page$")
    public void heSeeksToEntertheUtestPage(String form) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(form));

          }

    @Then("^he finds to be able to foll out the fields of the form$")
    public void heFindsToBeAbleToFollOutTheFieldsOfTheForm() {

         }

}
