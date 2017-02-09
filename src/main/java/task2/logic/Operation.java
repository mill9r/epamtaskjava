package task2.logic;

import task2.entity.Expression;
import task2.exception.IllegalValueException;


public class Operation {
    public static double countExpression(Expression e) throws IllegalValueException {
        switch (e.getType()) {
            case SUM:
                return e.getFirstValue() + e.getSecondValue();
            case MINUS:
                return e.getFirstValue() - e.getSecondValue();
            case MULTIPLY:
                return e.getFirstValue() * e.getSecondValue();
            default:
                if (!Checker.checkInfinity(e.getFirstValue() / e.getSecondValue()) || !Checker.checkNaN(e.getFirstValue() / e.getSecondValue())) {
                    return 0;
                } else {
                    return e.getFirstValue() * 1.0 / e.getSecondValue();
                }
        }


    }
}
