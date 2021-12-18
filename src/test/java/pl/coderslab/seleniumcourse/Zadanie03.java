package pl.coderslab.seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();
    }
}