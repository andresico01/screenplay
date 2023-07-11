package interfaces;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class TargetUtils {

    public static Target selectIntoTheScroll(String xpath, String concat){
        return Target.the("Target with concat")
                .located(AppiumBy.androidUIAutomator(String.format(xpath,concat)));
    }

    public static Target selectGender(String xpath, String concat){
        return Target.the("Target with concat")
                .located(AppiumBy.xpath(String.format(xpath,concat)));
    }
}
