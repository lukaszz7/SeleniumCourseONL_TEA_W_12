package pl.coderslab.ZadaniaZaliczeniowe;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie01ZaliczenioweSteps {
    private WebDriver driver;


    @Given("^Web (.*) opened in browser$")
    public void openBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(url);
    }

    @When("^on the main page click on sign in$")
    public void enterSignIn() {
        WebElement signInClick = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        signInClick.click();
    }

    @And("^log in$")
    public void log_in() {
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("uafpvhzretikfiuwzp@bvhrs.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123qwe");

        WebElement clickSignIn = driver.findElement(By.id("submit-login"));
        clickSignIn.click();
    }

    @And("on the account site click on the + Create new address")
    public void onTheAccountSiteClickOnTheCreateNewAddress() {
        WebElement gotoaddress = driver.findElement(By.id("address-link"));
        gotoaddress.click();
    }

    @When("refill address to the account with the following data: (.*), (.*), (.*), (.*), (.*), (.*)")
    public void refillAddress() {

        WebElement fillAlias = driver.findElement(By.name("alias "));
        fillAlias.sendKeys("User");

        WebElement fillAddress = driver.findElement(new By.ByName("address1"));
        fillAddress.sendKeys("Ulica 1");

        WebElement fillCity = driver.findElement(new By.ByName("city"));
        fillCity.sendKeys("Miasto");

        WebElement fillPostalCode = driver.findElement(new By.ByName("postcode"));
        fillPostalCode.sendKeys("12-345");

        WebElement selectCountry = driver.findElement(new By.ByClassName("form-control form-control-select js-country"));
        selectCountry.getCssValue("United Kingdom");

        WebElement fillPhone = driver.findElement(new By.ByName("phone"));
        fillPhone.sendKeys("963852741");
    }

    @And("^click Save$")
    public void finishfill() {
        WebElement finishfill = driver.findElement(new By.ByClassName("btn btn-primary float-xs-right"));
        finishfill.click();
    }

    @Then("^address on the account has been fill$")
    public void addressFillConfirmed() {
    }

}


