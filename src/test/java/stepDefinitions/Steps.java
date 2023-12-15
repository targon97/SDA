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
import pages.CustomerPage;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class Steps {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    HomePage homePage;
    public ChromeOptions options;
    LoginPage loginPage;
    CustomerPage customerPage;
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

    @Then("^User clicks Customer Login$")
    public void userClickOnLoginButton() {


        pageObjectManager = new PageObjectManager(driver);
        loginPage = pageObjectManager.getLoginPage();
        loginPage.clickLogin();
    }

    @And("^User selects customer$")
    public void userSelectsCustomer() {
        pageObjectManager  = new PageObjectManager(driver);
        loginPage = pageObjectManager.getLoginPage();
        loginPage.clickSelectUser();
    }

    @Then("^User enters transactions$")
    public void userEntersTransactions() {
        pageObjectManager  = new PageObjectManager(driver);
        customerPage = pageObjectManager.getCustomerPage();
        customerPage.clicktransactions();
    }

    @Then("^User uses right click$")
    public void userUsesRightClick() {
        pageObjectManager  = new PageObjectManager(driver);
        customerPage = pageObjectManager.getCustomerPage();
        customerPage.clickright();
    }

    @And("^User presses Top click$")
    public void userPressesTopClick() {
        pageObjectManager  = new PageObjectManager(driver);
        customerPage = pageObjectManager.getCustomerPage();
        customerPage.clicktop();
    }

}





