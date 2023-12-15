package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import java.time.Duration;

public class CustomerPage{
        WebDriver driver;

        public CustomerPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);

        }

        public void clicktransactions() {
            driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
        }

        public void clickright(){
            driver.findElement(By.xpath("//button[@ng-click='scrollRight()']")).click();}

        public void clicktop(){
            driver.findElement(By.xpath("//button[@ng-click='scrollTop()']")).click();
        }
}
