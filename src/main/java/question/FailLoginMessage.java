package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static interfaces.LoginException.FAIL_MESSAGE;

@Subject("Fail the inicial page")
public class FailLoginMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return FAIL_MESSAGE.resolveFor(actor).isVisible();
    }

    public static FailLoginMessage isVisible(){
        return new FailLoginMessage();
    }
}
