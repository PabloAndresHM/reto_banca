package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataAutomation;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Answer;
import tasks.Fill;
import tasks.OpenUp;

import java.util.List;

public class RetoBancaStepDefinition {
    public RetoBancaStepDefinition() {
    }
    @Given("^that (.*) wants create a new profile on Utest$")
    public void thatUserWantsToCreateANewProfile(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }


    @When("^user complete all the require steps$")
    public void userCompleteAllTheRequireSteps(List<DataAutomation> dataAutomation ) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.the(
                dataAutomation.get(0).getName(),
                dataAutomation.get(0).getLast_name(),
                dataAutomation.get(0).getEmail(),
                dataAutomation.get(0).getBirth_day(),
                dataAutomation.get(0).getBirth_month(),
                dataAutomation.get(0).getBirth_year(),
                dataAutomation.get(0).getLanguage(),
                dataAutomation.get(0).getCity(),
                dataAutomation.get(0).getPostal(),
                dataAutomation.get(0).getCountry(),
                dataAutomation.get(0).getPassword()
        ));
    }

    @Then("^the profile is create successful$")
    public void tehProfileIsCreateSuccessful() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Question<Boolean>) Answer.toThe("The last step")));
    }
}
