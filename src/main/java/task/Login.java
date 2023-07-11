package task;


import net.serenitybdd.screenplay.actions.Click;

import model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import interfaces.TargetUtils;


import static interfaces.TargetInicial.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private User user;
    public Login(User user){
        this.user = user;
    }

    public static Login the(User user) {
        return instrumented(Login.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(SHOW_CONTRYS),
            Click.on(TargetUtils.selectIntoTheScroll(SELECT_CONTRY, user.getOriginalContry().getContry())),
            Enter.theValue(user.getNameUser()).into(SET_NAME),
            Click.on(TargetUtils.selectGender(SELECT_GENDER,user.getGender())),
            Click.on(LET_GO)
        );
    }
}
