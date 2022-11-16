package by.itacademy.taf_weight_calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static by.itacademy.taf_weight_calculator.Gender.FEMALE;

public class WeightCalculatorPage{
    public final String URL = "https://svyatoslav.biz/testlab/wt/index.php";
    public final String RESULT_MESSAGE_IDEAL_MASS = "Идеальная масса тела";
    public final String RESULT_MESSAGE_A_LITTLE_MORE_MASS = "Умеренный избыток массы тела";
    public final String RESULT_MESSAGE_TOO_MUCH_MASS = "Значительный избыток массы тела, тучность";
    public final String ERROR_MESSAGE_TOO_LITTLE_MASS = "Слишком малая масса тела";
    public final String ERROR_MESSAGE_INCORRECT_HEIGHT = "Рост должен быть в диапазоне 50-300 см.";
    public final String ERROR_MESSAGE_NO_NAME = "Не указано имя.";
    public final String ERROR_MESSAGE_INCORRECT_MASS = "Вес должен быть в диапазоне 3-500 кг.";
    public final String ERROR_MESSAGE_NO_GENDER = "Не указан пол.";


    private String xPathInputName = "//input[@name='name']";
    private String xPathInputHeight = "//input[@name='height']";
    private String xPathInputWeight = "//input[@name='weight']";
    private String maleRadioButton = "//input[@type='radio' and @value='m']";
    private String femaleRadioButton = "//input[@type='radio' and @value='f']";
    private String calculateWeightButton = "//input[@type='submit']";
    private String xPathResultMessageWeightWithHeavyValue = "//body/table/tbody/tr[2]/td[2]";

    private String xPathName = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[1] ";
    private String xPathHeight = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[1]";
    private String xPathWeight = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[1]";
    private String xPathGender = "//tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]";
    private String xPathNameBottomTable = "/html/body/table/tbody/tr[3]/td ";
    private String xPathResultMessage = "//tbody/tr[2]/td[2]";
    private String xPathErrorMessage = "//table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]";
    private String xPathMessageIdealMass = "/html/body/table/tbody/tr[2]/td[2]";
    WebDriver driver;

    public WeightCalculatorPage(WebDriver driver){
        this.driver = driver;
    }

    public void typeInputName(String name){
        By byInputName = By.xpath(xPathInputName);
        WebElement webElementInputName = driver.findElement(byInputName);
        webElementInputName.sendKeys(name);
    }

    public void openWeightCalculatorPage(){
        driver.navigate().to(URL);
    }

    public void clickInputGender(Gender value){
        if(value.equals(FEMALE)){
            By byFemaleRadioButton = By.xpath(femaleRadioButton);
            WebElement webElementFemaleRadioButton = driver.findElement(byFemaleRadioButton);
            webElementFemaleRadioButton.click();
        }else {
            By byMaleRadioButton = By.xpath(maleRadioButton);
            WebElement webElementMaleRadioButton = driver.findElement(byMaleRadioButton);
            webElementMaleRadioButton.click();
        }
    }

    public void typeInputHeight(String height){
        By byInputHeight = By.xpath(xPathInputHeight);
        WebElement webElementInputHeight = driver.findElement(byInputHeight);
        webElementInputHeight.sendKeys(height);
    }

    public void typeInputWeight(String weight){
        By byInputWeight = By.xpath(xPathInputWeight);
        WebElement webElementInputWeight = driver.findElement(byInputWeight);
        webElementInputWeight.sendKeys(weight);
    }

    public void clickSubmitButton(){
        By byCalculateWeight = By.xpath(calculateWeightButton);
        WebElement webElementClickCalculateWeightButton = driver.findElement(byCalculateWeight);
        webElementClickCalculateWeightButton.click();
    }

    public String getResultMessage(){
        By byResultMessage = By.xpath(xPathResultMessage);
        WebElement webElementGetResultMessage = driver.findElement(byResultMessage);
        return webElementGetResultMessage.getText();
    }

    public String getErrorMessage(){
        By byErrorMessage = By.xpath(xPathErrorMessage);
        WebElement webElementGetErrorMessage = driver.findElement(byErrorMessage);
        return webElementGetErrorMessage.getText();
    }

    public String getXPathResultMessageWeightWithHeavyValue(){
        By byResultMessageWeightWithHeavyValue = By.xpath(xPathResultMessageWeightWithHeavyValue);
        WebElement webElementMessageWeightWithHeavyValue = driver.findElement(byResultMessageWeightWithHeavyValue);
        return webElementMessageWeightWithHeavyValue.getText();
    }

    public String getXpathResultTestWithOnlyFemaleGender(){
        By byResultTestWithOnlyFemaleGender = By.xpath(xPathMessageIdealMass);
        WebElement webElementMessageTestWithOnlyFemaleGender = driver.findElement(byResultTestWithOnlyFemaleGender);
        return webElementMessageTestWithOnlyFemaleGender.getText();
    }
}