package task2.logic;

import task2.entity.OperationType;
import task2.entity.Expression;

/**
 * Created by Administrator on 2/9/2017.
 */
public class ExpressionInitializer {
    public static Expression initExpression(String s){
        String [] value = s.split(" ");
        return new Expression(Double.parseDouble(value[0]), OperationType.getOperationType(value[1]) , Double.parseDouble(value[2]));
    }
}
