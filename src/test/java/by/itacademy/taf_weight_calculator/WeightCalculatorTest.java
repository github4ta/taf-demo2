package by.itacademy.taf_weight_calculator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WeightCalculatorTest extends BaseTest{
   @Test
   public void testWeightWithLessValue(){
       WeightCalculatorPage page = new WeightCalculatorPage(driver);
       page.openCalculatorPage();
       page.typeInputName("Maria");
       page.typeInputHeight("150");
       page.typeInputWeight("42");
       page.typeInputGender(Gender.FEMALE);
       page.clickSubmitButton();

      Assertions.assertEquals(page.TOO_LITTLE_MASS, page.getResultMessage());
   }
    @Test
    public void testWithEmptyValues() {
        WeightCalculatorPage page = new WeightCalculatorPage(driver);
        page.openCalculatorPage();
        page.typeInputHeight("180");
        page.typeInputWeight("75");
        page.typeInputGender(Gender.MALE);
        page.clickSubmitButton();

        Assertions.assertEquals(page.ERROR_MESSAGE_NO_NAME, page.getResultMessage());
    }
}
