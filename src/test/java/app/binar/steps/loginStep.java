package app.binar.steps;

import app.binar.driverManager;
import app.binar.pages.homePage;
import app.binar.pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;


public class loginStep {
    @When("user input valid username {string} and valid password {string}")
    public void loginAsValidPassword(String username, String password) {
        loginPage loginPage = new loginPage(driverManager.getInstance().getDriver());
        loginPage.userLogin(username, password);
    }

    @When("user input valid username {string} and invalid password {string}")
    public void loginAsInvalidPassword(String username, String password) {
        loginPage loginPage = new loginPage(driverManager.getInstance().getDriver());
        loginPage.userLogin(username, password);
    }

    @Then("user direct to home page")
    public void userDirectToHomePage() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.verifyCartIconExist();

    }

    @Then("error alert exist with value {string}")
    public void errorAlertExist(String message) {
        new loginPage(driverManager.getInstance().getDriver());
        loginPage.verifyErrorAlertExist(message);
    }

    @And("user see the product list")
    public void userSeeTheProductList(){
        WebDriver driver = driverManager.getInstance().getDriver();
        new homePage(driver);
        homePage.verifyProductListIsExist(driver);
    }
}
