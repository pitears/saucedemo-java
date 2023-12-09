package app.binar.steps;

import app.binar.keyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class commonStep {

    @Given("user should be open {string} in web browser")
    public void navigateToUrl(String url) {
        keyword.navigateToUrl(url);
    }
    @And("user take screenshot {string}")
    public void userTakeScreenshot(String namaFile) {
        keyword.take_screenshot(namaFile);
    }
}