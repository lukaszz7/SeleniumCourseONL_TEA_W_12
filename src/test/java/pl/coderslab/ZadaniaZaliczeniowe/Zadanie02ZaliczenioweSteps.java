package pl.coderslab.ZadaniaZaliczeniowe;

//zaloguje się na tego samego użytkownika z zadania 1,
//wybierze do zakupu Hummingbird Printed Sweater (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%),
//wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
//wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
//dodaj produkt do koszyka,
//przejdzie do opcji - checkout,
//potwierdzi address (możesz go dodać wcześniej ręcznie),
//wybierze metodę odbioru - PrestaShop "pick up in store",
//wybierze opcję płatności - Pay by Check,
//kliknie na "order with an obligation to pay",
//zrobi screenshot z potwierdzeniem zamówienia i kwotą.


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



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
        WebElement signInClick = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        signInClick.click();

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("uafpvhzretikfiuwzp@bvhrs.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("123qwe");

        WebElement clickSignIn = driver.findElement(By.id("submit-login"));
        clickSignIn.click();
    }
    @Test
    public void shoping(){

    }
}