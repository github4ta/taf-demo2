package by.itacademy.taf_weight_calculator;

public enum Gender {
    FEMALE("Female"),
    MALE("Male");
    private final String value;

    Gender(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

