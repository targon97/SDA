package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    By loginButton = By.id("login");

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}