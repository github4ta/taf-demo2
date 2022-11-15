package by.itacademy.taf_weight_calculator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WeightCalculatorTest extends BaseTest{
   @Test
    void testWeightWithLessValue(){
       WeightCalculatorPage page = new WeightCalculatorPage(driver);
       page.openCalculatorPage();
       page.typeInputName("Maria");
       page.typeInputHeight("150");
       page.typeInputWeight("42");
       page.typeInputGender(Gender.FEMALE);
       page.clickSubmitButton();

      Assertions.assertEquals(page.TOO_LITTLE_MASS, page.getResultMessage());
   }
}
