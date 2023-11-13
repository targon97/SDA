package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    By loggedInUser = By.id("userName-value");
    public String getLoggedInUser(){
      return driver.findElement(loggedInUser).getText();
    }
}
