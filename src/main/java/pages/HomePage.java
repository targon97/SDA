package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="login")
    WebElement loginButton;

    public void clickLogin() {
        loginButton.click();
    }
    public void navigateToHomePage(){
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
    }
}