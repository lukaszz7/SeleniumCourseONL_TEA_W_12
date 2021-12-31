package pl.coderslab.PageObjectPatern;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Zadanie 1
//Page Object Pattern 1
//Przygotuj skrypt testowy, który będzie testował funkcjonalność rejestracji użytkownika na
// stronie: https://hotel-testlab.coderslab.pl/en/. Użyj do tego wzorca projektowego Page Object Pattern.
//
//Wykonana powinna być następująca sekwencja kroków:
//
//strona główna
//przycisk 'Sign in'
//przycisk Create an account
//wypełnienie formularza
//przycisk Register


public class zadanie01 {
    WebDriver driver;
    @FindBy(id = "#id_gender1")
    private WebElement radioMr;
    @FindBy(css = "input#id_gender2")
    private WebElement radioMrs;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;
    @FindBy(id = "email")
    private WebElement emailInput;
    @FindBy(id = "passwd")
    private WebElement passwordInput;
    @FindBy(id = "days")
    private WebElement days;
    @FindBy(id = "months")
    private WebElement months;
    @FindBy(id = "years")
    private WebElement years;
    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;
    @FindBy(id = "optin")
    private WebElement specialOffersCheckbox;
    @FindBy(id = "submitAccount")
    private WebElement registerButton;
    private Object UserData;


//    @Test
//    public void createNewAccount(JPasswordField userData) {
//        driver.get("https://hotel-testlab.coderslab.pl/en/");
//        PageFactory.initElements(driver, this);
//
//        WebElement signInclick = driver.findElement(By.className("hide_xs"));
//        signInclick.click();
//
//        WebElement signInBtn = driver.findElement(By.id("email_create"));
//        signInBtn.sendKeys("adres@email.com");
//
//        WebElement CreateAnAccount = driver.findElement(new By.ByName("SubmitCreate"));
//        CreateAnAccount.click();
//
//
//        if (userData()) {
//                radioMr.click();
//            } else {
//                radioMrs.click();
//            }
//            firstNameInput.sendKeys(userData.getName("imie"));
//            lastNameInput.sendKeys(userData.getName("nazwisko"));
//            if (!userData.get().equals("")) {
//                emailInput.clear();
//                emailInput.sendKeys(userData.getEmail());
//            }
//            passwordInput.sendKeys(userData.getPassword());
//            days.sendKeys(String.valueOf(userData.getDays()));
//            months.sendKeys(userData.getMonth().name());
//            years.sendKeys(String.valueOf(userData.getYears()));
//            setCheckbox(newsletterCheckbox, userData.isNewsletter());
//            setCheckbox(specialOffersCheckbox, userData.isGetSpecialOffers());
//        }
//
//
//    private void setCheckbox(WebElement checkbox, boolean desiredCheckedState) {
//        if (checkbox.isSelected() != desiredCheckedState) {
//            checkbox.click();
//        }
//    }
//
//    public void clickRegister() {
//        registerButton.click();
//    }
//
//    public boolean areMandatoryInputsAccessible() {
//        boolean isFirstNameInputInteractable = firstNameInput.isDisplayed() && firstNameInput.isEnabled();
//        boolean isLastNameInputInteractable = lastNameInput.isDisplayed() && lastNameInput.isEnabled();
//        boolean isPasswordInputInteractable = passwordInput.isDisplayed() && passwordInput.isEnabled();
//
//        return isFirstNameInputInteractable
//                && isLastNameInputInteractable
//                && isPasswordInputInteractable;
//    }
//
//    public String getEmail() {
//        return emailInput.getAttribute("value");
//    }
//
//    @BeforeEach
//    public void beforeEach() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        this.driver = new ChromeDriver();
//    }
}