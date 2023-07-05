package org.example.stepdefinitions;

import exception.LoginException;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.builder.UserBuilder;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import question.FailLoginMessage;
import task.FailLogin;

import static exception.LoginException.FAIL_MESSAGE;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FailStepDefinition {


    @Before
    public void prepareStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @When("I am fail in tne login because i dont put the name in the app put (.*) and is (.*)$")
    public void iAmFailInTneLoginBecauseIDontPutTheNameInTheApp(String contry, String gender) {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled("Andres").attemptsTo(FailLogin.the(UserBuilder.user("").withLocationAndGender(contry,gender)));
    }
    @Then("appear the message")
    public void appearTheMessage() {
        // Write code here that turns the phrase above into concrete actions


        System.out.println(seeThat(the(FAIL_MESSAGE),isPresent()));
        //theActorInTheSpotlight().should(seeThat(the(FAIL_MESSAGE),containsText("Please enter your name")));
        Assert.assertEquals("Please enter your name",FAIL_MESSAGE.resolveFor(theActorInTheSpotlight()).getElement().getText());



    }
}
