package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.builder.UserBuilder;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import task.Login;
import task.SelectIteam;

import static interfaces.TargetIteam.BUY_SHOES;
import static interfaces.TargetIteam.CHECK;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingShoesStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The login user with me name (.*) in (.*) and gender (.*)$")
    public void theLoginUserWithMeNameCesarInColombiaAndGenderFemale(String name, String contry, String gender) {
        theActorCalled(name).attemptsTo(Login.the(UserBuilder.user(name).withLocationAndGender(contry,gender)));
    }
    @When("Select the (.*) and (.*)$")
    public void selectTheNikeSFBJungleAndADDTOCART(String shoes, String action) {
        theActorInTheSpotlight().attemptsTo(SelectIteam.the(shoes,action));
    }
    @When("buy the shoes")
    public void buyTheShoes() {
        theActorInTheSpotlight().attemptsTo(Click.on(BUY_SHOES));
    }
    @Then("Check the (.*)$")
    public void checkTheCart(String magigWord) {
        Assert.assertEquals(magigWord,CHECK.resolveFor(theActorInTheSpotlight()).getElement().getText());

    }
}
