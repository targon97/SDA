package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class PageObjectManager {
    HomePage homePage;
    LoginPage loginPage;
    DashboardPage dashboardPage;
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
    public DashboardPage getDashboardPage(){
        return (dashboardPage==null)? dashboardPage=new DashboardPage(driver): dashboardPage;
    }

}
