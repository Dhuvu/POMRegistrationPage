package NopCommerceRegistrationPageTest;

import NopCommerceRegistrationPage.Base.BrowserBasePage;
import NopCommerceRegistrationPage.Pages.RegistrationPage;

import NopCommerceRegistrationPage.Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegistrationTestPage {

    WebDriver driver;
    BrowserBasePage basePage;
    Properties prop;
    RegistrationPage registrationPage;
    BrowserBaseTest baseTest;

    @BeforeMethod
    public void OpenBrowser() {
        basePage = new BrowserBasePage();
        prop = basePage.InitialiseProperty();
        String WebEngine = prop.getProperty("Browser");
        driver = basePage.InitialiseWebDriver(WebEngine);
        driver.get(prop.getProperty("Url"));
        registrationPage=new RegistrationPage(driver);
    }
    @Test
public void RegistrationTest() throws InterruptedException {
    registrationPage.clickOnRegistrationLink();
    Thread.sleep(3000);
    registrationPage.doRegistration( prop.getProperty("FirstName"),prop.getProperty("LastName"), prop.getProperty("Date"), prop.getProperty("Month"), prop.getProperty("Year"), prop.getProperty("Email"),prop.getProperty("CompanyName"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword") );
}
@AfterMethod
        public void closeBrowser() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
}

}
