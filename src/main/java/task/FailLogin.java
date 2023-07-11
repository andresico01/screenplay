package task;

import model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import interfaces.TargetUtils;

import static interfaces.TargetInicial.*;
import static interfaces.TargetInicial.LET_GO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FailLogin implements Task {

    private User user;

    public FailLogin(User user){this.user = user;}

    public static FailLogin the(User user){
        return instrumented(FailLogin.class,user);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SHOW_CONTRYS),
                Click.on(TargetUtils.selectIntoTheScroll(SELECT_CONTRY, user.getOriginalContry().getContry())),
                Click.on(TargetUtils.selectGender(SELECT_GENDER,user.getGender())),
                Click.on(LET_GO)

        );
    }


}
