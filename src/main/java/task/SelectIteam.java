package task;

import model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.TargetUtils;

import static interfaces.TargetHome.VALIDATION;
import static interfaces.TargetInicial.*;

import static interfaces.TargetIteam.SELECT_SHOES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectIteam implements Task {



    private String shoes;



    private String action;

    public SelectIteam(String shoes,String action) {
        this.action =action;


        this.shoes = shoes;
    }

    public static SelectIteam the(String shoes, String action){
        return instrumented(SelectIteam.class,shoes,action);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(TargetUtils.selectIntoTheScroll(SELECT_CONTRY,shoes)),
                Click.on(TargetUtils.selectGender(SELECT_SHOES,shoes))
        );


    }



}
