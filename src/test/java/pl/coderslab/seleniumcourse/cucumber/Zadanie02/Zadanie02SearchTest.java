package pl.coderslab.seleniumcourse.cucumber.Zadanie02;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/cucumber/features/Zadanie02.feature",
            plugin = {"pretty", "html:out"})
    public class Zadanie02SearchTest {

    }

