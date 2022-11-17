package by.itacademy.taf_weight_calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WeightCalculatorTest extends BaseTest{
   @Test
   void testWeightWithLessValue(){
      WeightCalculatorPage page = new WeightCalculatorPage(driver);
      page.openWeightCalculatorPage();
      page.typeInputName("Maria");
      page.typeInputHeight("150");
      page.typeInputWeight("42");
      page.clickInputGender(Gender.FEMALE);
      page.clickSubmitButton();

      Assertions.assertEquals(page.ERROR_MESSAGE_TOO_LITTLE_MASS, page.getResultMessage());
   }

   @Test
   void testWeightWithInvalidData(){
      WeightCalculatorPage page = new WeightCalculatorPage(driver);
      page.openWeightCalculatorPage();
      page.typeInputName("Noname");
      page.typeInputHeight("164");
      page.typeInputWeight("-2");
      page.clickInputGender(Gender.FEMALE);
      page.clickSubmitButton();

      Assertions.assertEquals(page.ERROR_MESSAGE_INCORRECT_MASS, page.getErrorMessage());
   }
   @Test
   void testWeightWithHeavyValue(){
      WeightCalculatorPage page = new WeightCalculatorPage(driver);
      page.openWeightCalculatorPage();
      page.typeInputName("Anton");
      page.typeInputHeight("164");
      page.typeInputWeight("120");
      page.clickInputGender(Gender.FEMALE);
      page.clickSubmitButton();

      Assertions.assertEquals(page.RESULT_MESSAGE_TOO_MUCH_MASS, page.getXPathResultMessageWeightWithHeavyValue());
   }

   @Test
   void testWithOnlyFemaleGender(){
      WeightCalculatorPage page = new WeightCalculatorPage(driver);
      page.openWeightCalculatorPage();
      page.typeInputName("Kat");
      page.typeInputHeight("164");
      page.typeInputWeight("58");
      page.clickInputGender(Gender.FEMALE);
      page.clickSubmitButton();
      String actual = page.getXpathResultTestWithOnlyFemaleGender();

      Assertions.assertEquals(page.RESULT_MESSAGE_IDEAL_MASS,actual);
   }
   @Test
   void testWithInvalidHeight(){
      WeightCalculatorPage page = new WeightCalculatorPage(driver);
      page.openWeightCalculatorPage();
      page.typeInputName("Anna");
      page.typeInputWeight("62");
      page.clickInputGender(Gender.FEMALE);
      page.clickSubmitButton();

      Assertions.assertEquals(page.ERROR_MESSAGE_INCORRECT_HEIGHT, page.getErrorMessage());
   }
   @Test
   void testGenderWithoutGender(){
      WeightCalculatorPage page = new WeightCalculatorPage(driver);
      page.openWeightCalculatorPage();
      page.typeInputName("Maria");
      page.typeInputHeight("164");
      page.typeInputWeight("58");
      page.clickSubmitButton();

      Assertions.assertEquals(page.ERROR_MESSAGE_NO_GENDER,page.getXpathResultTestGenderWithoutGender());
   }
}