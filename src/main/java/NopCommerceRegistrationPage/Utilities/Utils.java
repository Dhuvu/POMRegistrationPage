package NopCommerceRegistrationPage.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

    WebDriver driver;

public Utils(WebDriver driver){
    this.driver=driver;
}

public WebElement getElement(By Locator){
    WebElement element=driver.findElement(Locator);
    return element;
}

public void doSendkey(By Locator,String Value){

    getElement(Locator).sendKeys(Value);
}
public void doClick(By Locator){
    getElement(Locator).click();
}

}
