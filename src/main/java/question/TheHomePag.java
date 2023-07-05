package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static interfaces.TargetInicial.SHOW_CONTRYS;

@Subject("the home page is visible")
public class TheHomePag implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return SHOW_CONTRYS.resolveFor(actor).isVisible();
    }

    public static TheHomePag isVisible(){
        return new TheHomePag();
    }
}
