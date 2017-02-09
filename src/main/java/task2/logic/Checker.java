package task2.logic;

import task2.entity.CheckerType;
import task2.exception.IllegalValueException;
import task2.exception.WrongExpressionException;

public class Checker {
    public static boolean checkExpression(String s) throws WrongExpressionException {
        if (s.matches(CheckerType.MATH_EXPRESSION.getString())) {
            return true;
        } else {
            throw new WrongExpressionException();
        }
    }

    public static boolean checkInfinity(double s) throws IllegalValueException {
        if (Double.isInfinite(s)) {
            Printer.printString("You get an Infinity");
            throw new IllegalValueException();
        } else {
            return true;
        }
    }

    public static boolean checkNaN(double s) throws IllegalValueException {
        if (Double.isNaN(s)) {
            Printer.printString("You get a NaN");
            throw new IllegalValueException();
        } else {
            return true;
        }
    }
}
