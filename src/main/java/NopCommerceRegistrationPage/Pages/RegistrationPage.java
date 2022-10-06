package NopCommerceRegistrationPage.Pages;

import NopCommerceRegistrationPage.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {


    WebDriver driver;
    Utils utils;

    By registrationLink=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");

    By Gender=By.id("gender-female");
    By fName=By.id("FirstName");
    By lName=By.id("LastName");
    By Date=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By Month=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By Year=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By Email=By.id("Email");
    By CName=By.id("Company");
    By Password=By.id("Password");
    By ConfirmPassword=By.id("ConfirmPassword");
    By RegisterButton=By.id("register-button");

    public RegistrationPage(WebDriver driver){
        this.driver=driver;
        utils=new Utils(driver);

    }

    public void clickOnRegistrationLink(){
        utils.doClick(registrationLink);
    }

    public void doRegistration(String R_fname,String R_lname,String R_date,String R_month,String R_year,String R_email,String R_cname,String R_pwd,String R_cpwd) throws InterruptedException {

        utils.doClick(Gender);
        utils.doSendkey(fName,R_fname);
        utils.doSendkey(lName,R_lname);
        Thread.sleep(2000);
        utils.doSendkey(Date,R_date);
        Thread.sleep(2000);
        utils.doSendkey(Month,R_month);
        Thread.sleep(2000);
        utils.doSendkey(Year,R_year);
        utils.doSendkey(Email,R_email);
        utils.doSendkey(CName,R_cname);
        utils.doSendkey(Password,R_pwd);
        utils.doSendkey(ConfirmPassword,R_cpwd);
        utils.doClick(RegisterButton);

    }


}

