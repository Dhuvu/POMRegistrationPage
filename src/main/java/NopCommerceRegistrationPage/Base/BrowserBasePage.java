package NopCommerceRegistrationPage.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserBasePage {
    WebDriver driver;
    Properties Prop;
    FileInputStream file;


    public WebDriver InitialiseWebDriver(String browserName) {
        if (browserName.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser Not Match");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public Properties InitialiseProperty(){
        Prop=new Properties();

        try {
            file=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\POMRegistrationPage\\src\\test\\resources\\TestData\\config.properties");
            Prop.load(file);

        } catch (FileNotFoundException e) {

            System.out.println("Config Property File Is not found");
            e.printStackTrace();

        }catch (IOException e){

            System.out.println("Properties Could Not Found");
        }
        return Prop;

    }
}
