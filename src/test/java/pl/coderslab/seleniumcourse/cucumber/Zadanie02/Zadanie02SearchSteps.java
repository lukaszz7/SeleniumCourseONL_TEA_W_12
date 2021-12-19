package pl.coderslab.seleniumcourse.cucumber.Zadanie02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie02SearchSteps {
    private WebDriver driver;


    @Given("^Web (.*) opened in browser$")
    public void openBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get(url);
    }
    @When("^click on the icon Sign Ind$")
    public void enterSignIn() {
        WebElement signInclick = driver.findElement(By.className("hide_xs"));
        signInclick.click();
    }


    @And("^complete the registration$")
    public void Register() {
        WebElement writeemail = driver.findElement(By.id("email_create"));
        writeemail.sendKeys("adres@email.com");
        WebElement createAnAccount = driver.findElement(new By.ByName("SubmitCreate"));
        createAnAccount.click();
    }
    @And("^registration in the new page$")
    public void Registernewpage() {
        WebElement FirstName = driver.findElement(new By.ByName("customer_firstname"));
        FirstName.sendKeys("Imie");

        WebElement SecondName = driver.findElement(new By.ByName("customer_lastname"));
        SecondName.sendKeys("Nazwisko");

        WebElement password = driver.findElement(new By.ByName("passwd"));
        password.sendKeys("haslo11");

    }
    @Then("^Account has been created$")
    public void finishregister(){
        WebElement createAnAccount = driver.findElement(new By.ByName("submitAccount"));
        createAnAccount.click();
    }
}




