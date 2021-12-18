package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Zadanie02 {
    WebDriver driver;

    @Test
    public void shouldSearchInQwant() {
        driver.get("https://coderslab.pl/pl");
        WebElement searchInput = driver.findElement(By.name("q"));

    }

    @Test
    public void shouldSearchInQwant1() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement searchInput = driver.findElement(By.name("q"));
    }

    @Test
    public void shouldSearchInQwant2() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement searchInput = driver.findElement(By.name("q"));
    }

        @BeforeEach
        public void beforeEach () {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            this.driver = new ChromeDriver();
        }

}
