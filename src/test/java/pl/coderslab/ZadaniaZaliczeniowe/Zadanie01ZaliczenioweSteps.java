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

    @When("on the account site click on the + Create new address")
    public void onTheAccountSiteClickOnTheCreateNewAddress() {
        WebElement gotoaddress = driver.findElement(By.id("address-link"));
        gotoaddress.click();
    }

    @And("^refill address to the account with the following data: (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void refillAddress(String alias, String address, String city, String postalCode, String country, String phone)  {

        WebElement Alias = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input"));
        Alias.sendKeys(alias);
        WebElement Address = driver.findElement(new By.ByName("address1"));
        Address.sendKeys(address);
        WebElement City = driver.findElement(new By.ByName("city"));
        City.sendKeys(city);
        WebElement PostalCode = driver.findElement(new By.ByName("postcode"));
        PostalCode.sendKeys(postalCode);
        WebElement selectCountry = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select/option[2]"));
        selectCountry.click();
        WebElement Phone = driver.findElement(new By.ByName("phone"));
        Phone.sendKeys(phone);
    }

    @And("^click Save$")
    public void finishfill() {
        WebElement finishfill = driver.findElement(new By.ByClassName("btn btn-primary float-xs-right"));
        finishfill.click();
    }

    @Then("^address on the account has been fill$")
    public boolean addressFillConfirmed() {
        WebElement addressCreationConfirmationPanel = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article"));
        String confirmationText = addressCreationConfirmationPanel.getText();
        return confirmationText.equals("your address has been added.");
    }

}


