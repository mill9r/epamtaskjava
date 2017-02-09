package task2.entity;

public enum OperationType {
    SUM("+"), MINUS("-"), MULTIPLY("*"), DIVISION("/");
    private String string;

    OperationType(String string) {
        this.string = string;
    }

    public static OperationType getOperationType(String s) {
        switch (s) {
            case "+":
                return SUM;
            case "-":
                return MINUS;
            case "/":
                return DIVISION;
            default:
                return MULTIPLY;
        }
    }
}
