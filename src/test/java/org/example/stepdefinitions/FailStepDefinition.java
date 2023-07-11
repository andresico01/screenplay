package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.builder.UserBuilder;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import task.FailLogin;

import static interfaces.LoginException.FAIL_MESSAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FailStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("I am fail in tne login because i dont put the name in the app put (.*) and is (.*)$")
    public void iAmFailInTneLoginBecauseIDontPutTheNameInTheApp(String contry, String gender) {
        theActorCalled("Andres").attemptsTo(FailLogin.the(UserBuilder.user("").withLocationAndGender(contry,gender)));
    }
    @Then("appear the message")
    public void appearTheMessage() {
        Assert.assertEquals("Please enter your name",FAIL_MESSAGE.resolveFor(theActorInTheSpotlight()).getElement().getText());
    }
}
