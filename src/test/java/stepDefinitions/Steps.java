package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class Steps {

    WebDriver driver;
    PageObjectManager pageObjectManager;
    HomePage homePage;
    ChromeOptions options;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    WebDriver.Timeouts timeouts;

    @Given("User is on home page")
    public void user_is_on_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M249SAW\\IdeaProjects\\Selenium\\ChromeDriver\\chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);


        pageObjectManager = new PageObjectManager(driver);

        homePage = pageObjectManager.getHomePage();

        homePage.navigateToHomePage();
    }

    @When("^User click on login button$")
    public void userClickOnLoginButton() {
        homePage.clickLogin();
    }

    @And("^User enter username$")
    public void userEnterUsername() {
    loginPage = pageObjectManager.getLoginPage();
    loginPage.enterUserName();
    }

    @And("^User write (.*)$")
    public void userEnterString(String password) {
        loginPage.enterPassword(password);

    }

    @And("^User clicked on login button$")
    public void userClickedOnLoginButton() {
        loginPage.clickLogin();
    }



    @Then("^Correct user is logged in$")
    public void correctUserIsLoggedIn() {
        timeouts = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        dashboardPage = pageObjectManager.getDashboardPage();
        Assert.assertEquals("gunjankaushik", dashboardPage.getLoggedInUser());
    }
}




