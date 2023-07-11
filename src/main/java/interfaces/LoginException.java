package exception;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginException extends AssertionError{

    public final static Target FAIL_MESSAGE = Target.the("Fail something")
            .located(By.xpath("//(android.widget.Toast)[1]"));


    public LoginException(String message, Throwable cause) {

        super(message, cause);
    }
}
