package testScript;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass {

    @Test

    public void userLogin()throws Exception{
        LoginPage cs = new LoginPage(driver);
        System.out.println("Login User Test started");

        Thread.sleep(5000);
        cs.pasoUno();
        Thread.sleep(5000);
        cs.pasoDos();
        cs.pasoTres("manuel.morales@crehana.com");
        driver.quit();
    }
}
