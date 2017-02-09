package task2.entity;


public enum CheckerType {
    MATH_EXPRESSION("[-]?\\d+(\\.\\d+)?\\s[+-/*]{1}\\s[-]?\\d+(\\.\\d+)?");

    private String string;

    CheckerType(String s) {
        string = s;
    }

    public String getString() {
        return string;
    }
}
