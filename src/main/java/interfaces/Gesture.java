package interfaces;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.JavascriptExecutor;


public class Gesture {

    public Gesture() {
    }
    public void  scrollView(AndroidDriver driver) {
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "elementId","00000000-0000-05be-ffff-ffff00000033",
                    "direction", "down",
                    "percent", 3.0
            ));
        } while (canScrollMore );
    }


}
