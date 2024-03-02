package app.binar.steps;

import app.binar.driverManager;
import app.binar.pages.homePage;
import app.binar.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static app.binar.pages.homePage.TapAddToCart;

public class checkoutStep {
    @And("user click Add To Cart button on product")
    public void userClickAddToCartButton() {
        new homePage(driverManager.getInstance().getDriver());
        TapAddToCart();
    }

    @And("user do checkout")
    public void userDoCheckout() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.doCheckout("budi", "samsul", "37332");
    }

    @And("verify checkout successfully")
    public void verifyCheckoutSuccessfully() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.verifySuccessCheckout();
    }
}

