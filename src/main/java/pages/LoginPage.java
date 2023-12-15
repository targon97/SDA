package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import java.time.Duration;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    WebElement login;

    public void clickLogin() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        login = driver.findElement(By.className("btn-primary"));
        login.click();
    }

    WebElement selectuser;

    public void clickSelectUser() {
        driver.findElement(By.xpath("//option[@value='1']")).click();
        driver.findElement(By.className("btn-default")).click();
    }
}
