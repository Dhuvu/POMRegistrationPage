package NopCommerceRegistrationPageTest;

import NopCommerceRegistrationPage.Base.BrowserBasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class BrowserBaseTest {

    BrowserBasePage basePage;
    Properties Prop;
    WebDriver driver;

    @Test
    public void OpenBrowser(){
        basePage=new BrowserBasePage();
        Prop=basePage.InitialiseProperty();
        String WebEngine= Prop.getProperty("Browser");
        driver=basePage.InitialiseWebDriver(WebEngine);
        driver.get(Prop.getProperty("Url"));


    }
}
