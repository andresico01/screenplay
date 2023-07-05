package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.builder.UserBuilder;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.TheHomePag;
import question.TheInicialPag;
import task.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ShoppinStepDefinition  {


    @Before
    public void prepareStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @When("I login with me name (.*) in (.*) and gender (.*)$")
    public void iLoginWithMeNameAndresInColombia(String name, String location,String gender) throws Throwable  {


        theActorCalled("Andres").attemptsTo(Login.the(UserBuilder.user(name).withLocationAndGender(location,gender)));

    }

    @Then("I should see the inicial page from shop app")
    public void iShouldSeeTheInicialPageFromShopApp() throws Throwable {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheInicialPag.isVisible()));

    }



}
