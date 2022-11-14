package by.itacademy.taf_weight_calculator;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setWebDriver() {
        driver = new ChromeDriver();
    }

    @After
    public void closeWebDiver() {
        driver.quit();
    }
}


