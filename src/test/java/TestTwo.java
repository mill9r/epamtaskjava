import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import task2.entity.Expression;
import task2.entity.OperationType;
import task2.exception.IllegalValueException;
import task2.logic.ArrayToString;
import task2.logic.Checker;
import task2.exception.WrongExpressionException;
import task2.logic.ExpressionInitializer;
import task2.logic.Operation;

public class TestTwo {
    private Expression expression;

    @Test
    public void testCastArrayToString() {
        String[] array = {"100", "+", "1234.43"};
        String result = "100 + 1234.43";
        assertEquals(result, ArrayToString.castArrayToString(array));
    }

    @Before
    public void init() {
        expression = new Expression(100, OperationType.SUM, 1234.43);
    }

    @After
    public void destroy() {
        expression = null;
    }

    @Test
    public void testExpressionInitializer() {
        String[] array = {"100", "+", "1234.43"};
        String expr = ArrayToString.castArrayToString(array);
        assertEquals(expression, ExpressionInitializer.initExpression(expr));
    }


    @Rule
    public final ExpectedException e = ExpectedException.none();

    @Test
    public void throwsWrongExpressionException() throws WrongExpressionException {
        e.expect(WrongExpressionException.class);
        String s = "10.a + 10";
        Checker.checkExpression(s);
    }

    @Test
    public void testCheckInfinityNegative() throws IllegalValueException {
        double a = 100.0;
        double c = 0;
        e.expect(IllegalValueException.class);
        Checker.checkInfinity(a / c);
    }

    @Test
    public void testCheckInfinityPositive() throws IllegalValueException {
        double a = 100.0;
        double c = 0.23;
        assertEquals(true, Checker.checkInfinity(a / c));

    }

    @Test
    public void testCountExpressionMultiply() throws IllegalValueException {
        double a = 121.0;
        Expression expr = new Expression(11, OperationType.MULTIPLY, 11);
        assertEquals(a, Operation.countExpression(expr),0.1);

    }
    @Test
    public void testCountExpressionMinus() throws IllegalValueException {
        double a = 100.9;
        Expression expr = new Expression(102, OperationType.MINUS, 1.01);
        assertEquals(a, Operation.countExpression(expr),0.1);

    }
    @Test
    public void testCountExpressionDivision() throws IllegalValueException {
        double a = 1.0;
        Expression expr = new Expression(11.0, OperationType.DIVISION, 11.0);
        assertEquals(a, Operation.countExpression(expr),0.1);

    }

    @Test
    public void testCheckExpressionPositiveOne() throws WrongExpressionException {
        String s = "100 + 100.3";
        Checker.checkExpression(s);
    }

    @Test
    public void testCheckExpressionPositiveTwo() throws WrongExpressionException {
        String s = "-999.456 + 100.323";
        Checker.checkExpression(s);
    }

    @Test
    public void testCheckExpressionPositiveThree() throws WrongExpressionException {
        String s = "-99999999999999999.456 + -200";
        Checker.checkExpression(s);
    }

    @Test
    public void testCheckExpressionNegative() throws WrongExpressionException {
        String s = "000.001234 + 123.FF";
        e.expect(WrongExpressionException.class);
        Checker.checkExpression(s);
    }


}
