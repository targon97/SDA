package pages;

<<<<<<< HEAD
=======
import org.openqa.selenium.By;
>>>>>>> origin/costam-z-sda
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

<<<<<<< HEAD
=======
    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    By loginButton = By.id("login");

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
>>>>>>> origin/costam-z-sda
}
