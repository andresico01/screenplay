package interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TargetHome {
    public final static Target VALIDATION = Target.the("Product check")
            .located(By.xpath("//android.widget.TextView[@text='Products']"));
}
