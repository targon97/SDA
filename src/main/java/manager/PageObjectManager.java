package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CustomerPage;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class PageObjectManager {
    HomePage homePage;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;
    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }

    public HomePage getHomePage(){
        return (homePage==null)? homePage=new HomePage(driver): homePage;
    }
    public LoginPage getLoginPage(){
        return (loginPage==null)? loginPage=new LoginPage(driver): loginPage;
    }

    public CustomerPage getCustomerPage() {return (customerPage==null)? customerPage=new CustomerPage(driver): customerPage;}
    }

