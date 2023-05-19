package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
    @AndroidFindBy(id = "com.crehana.android:id/log_in_button")
    private AndroidElement pasoUno;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button")
    private AndroidElement pasoDos;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private AndroidElement pasoTres;


    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void pasoUno() {
        pasoUno.click();
    }

    public void pasoDos() {
        pasoDos.click();
    }

    public void pasoTres(String string) {
        pasoTres.sendKeys(string);
    }
}
