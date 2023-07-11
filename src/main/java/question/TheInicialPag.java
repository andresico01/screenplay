package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static interfaces.TargetHome.VALIDATION;
@Subject("The incial page")
public class TheInicialPag implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATION.resolveFor(actor).isVisible();
    }
  public static TheInicialPag isVisible(){ return new TheInicialPag();}
}
