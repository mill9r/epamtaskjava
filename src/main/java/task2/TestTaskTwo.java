package task2;

import task2.entity.Expression;
import task2.exception.IllegalValueException;
import task2.exception.WrongExpressionException;
import task2.logic.*;

public class TestTaskTwo {
    public static void main(String[] args) {

        //MySolution
        Expression expression;

        String expr =  ArrayToString.castArrayToString(args);
        try {
            if (Checker.checkExpression(expr)) {
                expression = ExpressionInitializer.initExpression(expr);
                Printer.printDoubleNumber(Operation.countExpression(expression));

            }
        } catch (WrongExpressionException e) {
            System.out.println("You entered a wrong math expression.");
        } catch (IllegalValueException e) {
            e.printStackTrace();
        }


        //Another Solution with-build in JDK 6.0 JavaScript engine

//        ScriptEngineManager mgr = new ScriptEngineManager();
//        ScriptEngine engine = mgr.getEngineByName("JavaScript");
//        String expr = ArrayToString.castArrayToString(args);
//        try {
//            if(Checker.checkExpression(expr)){
//                System.out.println(engine.eval(expr));
//            }
//        } catch (WrongExpressionException e) {
//            System.out.println("You entered a wrong math expression.");
//        } catch (ScriptException e) {
//            e.printStackTrace();
//        }
    }
}

