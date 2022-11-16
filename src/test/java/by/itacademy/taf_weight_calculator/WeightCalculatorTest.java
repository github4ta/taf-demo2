package by.itacademy.taf_weight_calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WeightCalculatorTest extends BaseTest{
   @Test
    void testWeightWithLessValue(){
       WeightCalculatorPage page = new WeightCalculatorPage(driver);
       page.openCalculatorPage();
       page.typeInputName("Maria");
       page.typeInputHeight("150");
       page.typeInputWeight("42");
       page.clickInputGender(Gender.FEMALE);
       page.clickSubmitButton();

      Assertions.assertEquals(page.ERROR_MESSAGE_TOO_LITTLE_MASS, page.getResultMessage());
   }
   @Test
   void testWeightWithInvalidData() {
      WeightCalculatorPage page = new WeightCalculatorPage(driver);
      page.openCalculatorPage();
      page.typeInputName("Noname");
      page.typeInputHeight("164");
      page.typeInputWeight("-2");
      page.clickInputGender(Gender.FEMALE);
      page.clickSubmitButton();

      Assertions.assertEquals(page.ERROR_MESSAGE_INCORRECT_MASS, page.getResultMessageWithInvalidWeight());
   }
}
