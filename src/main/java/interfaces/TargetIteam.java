package interfaces;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class TargetIteam {

    public final static String SELECT_SHOES = "//android.widget.TextView[@text='%s']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@text='ADD TO CART']";

    public final static Target BUY_SHOES = Target.the("Buy")
            .located(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));

    public final static Target CHECK = Target.the("check the buy")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='Cart']"));
}
