package interfaces;

import static interfaces.InicialPag.*;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.ByMobileTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TargetInicial {

    private  String contry;

    public final static Target SHOW_CONTRYS = Target.the("Show contrys")
            .located(By.id("com.androidsample.generalstore:id/spinnerCountry"));





    public final static String SELECT_CONTRY = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"%s\"));";

    public final static Target SET_NAME = Target.the("Send name ")
            .located(By.xpath("//android.widget.EditText[@text='Enter name here']"));

    public final static String SELECT_GENDER = "//android.widget.RadioButton[@text='%s']";

    public final static Target LET_GO = Target.the("Let Go")
            .located(By.id("com.androidsample.generalstore:id/btnLetsShop"));

    public TargetInicial(String contry) {
        this.contry = contry;
    }
}
