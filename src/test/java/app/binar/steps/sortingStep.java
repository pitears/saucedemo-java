package app.binar.steps;

import app.binar.driverManager;
import app.binar.pages.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class sortingStep {

    @And("user choose price high to low")
    public void userChoosePriceHighToLow() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.selectFilter("hilo");
    }

    @And("user choose price low to high")
    public void userChoosePriceLowToHigh() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.selectFilter("lohi");
    }

    @Then("first product's price is higher than the second product's")
    public void firstProductsPriceIsHigherThanTheSecondProducts() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.comparePrice(driverManager.getInstance().getDriver(), true);
    }

    @Then("first product's price is lower than the second product's")
    public void firstProductsPriceIsLowerThanTheSecondProducts() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.comparePrice(driverManager.getInstance().getDriver(), false);
    }

}


