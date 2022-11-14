package by.itacademy.taf_weight_calculator;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setWebDriver() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void closeWebDiver() {
        driver.quit();
    }
}


