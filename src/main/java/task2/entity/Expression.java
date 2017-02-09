package task2.entity;

public class Expression {
    private double firstValue;
    private double secondValue;
    private OperationType type;

    public Expression(double firstValue, OperationType type, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.type = type;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public OperationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expression)) return false;

        Expression that = (Expression) o;

        if (Double.compare(that.firstValue, firstValue) != 0) return false;
        if (Double.compare(that.secondValue, secondValue) != 0) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(firstValue);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                ", type=" + type +
                '}';
    }
}
