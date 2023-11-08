package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\M249SAW\\IdeaProjects\\Selenium\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/books");

        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
        String isbn1 = driver.findElement(By.id("userName-value")).getText();
        driver.findElement(By.id("addNewRecordButton")).click();

        driver.findElement(By.id("see-book-Learning JavaScript Design Patterns")).click();
        String isbn2 = driver.findElement(By.id("userName-value")).getText();
        driver.findElement(By.id("addNewRecordButton")).click();

        driver.findElement(By.id("see-book-Designing Evolvable Web APIs with ASP.NET")).click();
        String isbn3 = driver.findElement(By.id("userName-value")).getText();
        driver.get("https://demoqa.com/books");

        driver.findElement(By.id("see-book-Speaking JavaScript")).click();
        String isbn4 = driver.findElement(By.id("userName-value")).getText();
        driver.get("https://demoqa.com/books");

        driver.findElement(By.id("see-book-You Don't Know JS")).click();
        String isbn5 = driver.findElement(By.id("userName-value")).getText();
        driver.get("https://demoqa.com/books");

        driver.findElement(By.id("searchBox")).sendKeys("Programming JavaScript Applications");
        driver.findElement(By.id("see-book-Programming JavaScript Applications")).click();
        String isbn6 = driver.findElement(By.id("userName-value")).getText();
        driver.get("https://demoqa.com/books");

        driver.findElement(By.id("searchBox")).sendKeys("Eloquent JavaScript, Second Edition");
        driver.findElement(By.id("see-book-Eloquent JavaScript, Second Edition")).click();
        String isbn7 = driver.findElement(By.id("userName-value")).getText();
        driver.get("https://demoqa.com/books");

        driver.findElement(By.id("searchBox")).sendKeys("Understanding ECMAScript 6");
        driver.findElement(By.id("see-book-Understanding ECMAScript 6")).click();
        String isbn8 = driver.findElement(By.id("userName-value")).getText();
        driver.get("https://demoqa.com/books");

        System.out.println("Numer ISBN książki Git Pocket Guide to " + isbn1);
        System.out.println("Numer ISBN książki JavaScript Design Patterns to " + isbn2);
        System.out.println("Numer ISBN książki Designing Evolvable Web APIs with ASP.NET to " + isbn3);
        System.out.println("Numer ISBN książki Speaking JavaScript to " + isbn4);
        System.out.println("Numer ISBN książki You Don't Know JS to " + isbn5);
        System.out.println("Numer ISBN książki Programming JavaScript Applications to " + isbn6);
        System.out.println("Numer ISBN książki Eloquent JavaScript, Second Edition to " + isbn7);
        System.out.println("Numer ISBN książki Understanding ECMAScript 6 to " + isbn8);





    }
}
