package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;

    }
    By userName = By.id("userName");
    By password = By.id("password");

    public void enterUserName(){
        driver.findElement(userName).sendKeys("gunjankaushik");
    }
    public void enterPassword(){
        driver.findElement(password).sendKeys("Password@123");
    }

}
