package pl.coderslab.ZadaniaZaliczeniowe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalDateTime;

public class Zadanie02ZaliczenioweSteps {
    WebDriver driver;


    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @Test
    public void Login() {
//Sing In
        WebElement signInClick = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        signInClick.click();
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("uafpvhzretikfiuwzp@bvhrs.com");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("123qwe");
        WebElement clickSignIn = driver.findElement(By.id("submit-login"));
        clickSignIn.click();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//take order
        WebElement clickclothes = driver.findElement(By.id("category-3"));
        clickclothes.click();
        WebElement clicksweater = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]"));
        clicksweater.click();
        WebElement selectsize = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]"));
        selectsize.click();
        WebElement selectquantity = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]"));
        selectquantity.click();
        WebElement selectquantity1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]"));
        selectquantity1.click();
        WebElement selectquantity2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]"));
        selectquantity2.click();
        WebElement selectquantity3 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]"));
        selectquantity3.click();
        WebElement addcart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        addcart.click();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//confirm order
        WebElement proccedCheckout = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        proccedCheckout.click();
        WebElement proccedCheckout1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        proccedCheckout1.click();
        WebElement continueConfirm = driver.findElement(By.name("confirm-addresses"));
        continueConfirm.click();
        WebElement shippingmethod = driver.findElement(By.id("delivery_option_1"));
        if (!shippingmethod.isSelected()) {
            shippingmethod.click();}
        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        confirm.click();
        WebElement paymentOption = driver.findElement(By.id("payment-option-2"));
        paymentOption.click();
        WebElement checkTermsOfService = driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]"));
        checkTermsOfService.click();
        WebElement order = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        order.click();
    }

    @After()
    public void takeScreenshot() throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File tmpScreenshot = screenshot.getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:","PotwierdzenieZadaniaZaliczeniowego", "PotiwerdzenieZadania02" + currentDateTime + ".png"));
    }
    @AfterEach
    public void closeAndQuit() {
        driver.close();
    }
}