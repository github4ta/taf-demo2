package by.itacademy.taf_weight_calculator;

public class WeightCalculatorPage{
    public final String IDEAL_MASS = "Идеальная масса тела";
    public final String A_LITTLE_MORE_MASS = "Умеренный избыток массы тела";
    public final String TOO_MUCH_MASS = "Значительный избыток массы тела, тучность";
    public final String TOO_LITTLE_MASS = "Слишком малая масса тела";
    public final String ERROR_MESSAGE_INCORRECT_HEIGHT = "Рост должен быть в диапазоне 50-300 см.";
    public final String ERROR_MESSAGE_NO_NAME = "Не указано имя.";
    public final String ERROR_MESSAGE_INCORRECT_MASS = "Вес должен быть в диапазоне 3-500 кг.";
    public final String ERROR_MESSAGE_NO_GENDER = "Не указан пол.";
    private String xPathName = "//table[@border='0']/tbody/tr[2]/td[1]";
    private String xPathHeight = "//table[@border='0']/tbody/tr[3]/td[1]";
    private String xPathWeight = "//table[@border='0']/tbody/tr[4]/td[1]";
    private String xPathGender = "//table[@border='0']/tbody/tr[5]/td[1]";
    private String xPathMan = "//tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]";
    private String xPathFemale = "//tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]";
    private String xPathNameBottomTable = "//tr[@height='50']/td";
    private String xPathResultMessage = "//tbody/tr[2]/td[2]";
    private String xPathErrorMessageIncorrectHeight = "//b[contains(text(),'Рост должен быть в диапазоне 50-300 см.')]";
    private String xPathErrorMessageNoName = "//b[contains(text(),'Не указано имя.')]";
    private String xPathErrorWeight = "//b[contains(text(),'Вес должен быть в диапазоне 3-500 кг.')]";
    private String xPathErrorMessageNoGender = "//b[contains(text(),'Не указан пол.')]";

}
