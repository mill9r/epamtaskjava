package task3;

import task1.Printer;

/**
 * This class solves quadratic equation : ax^2 + bx + c = 0
 */
public class QuadraticEquation {
    public static double[] solve(int a, int b, int c) {
        double[] result = new double[2];
        String resultMsg;
        if (a == 0) {
            Printer.print("Equation is not quadratic: 'a' - must be nonzero!");
        } else {
            int D = b * b - 4 * a * c;
            if (D > 0) {
                result[0] = (-b + Math.sqrt(D)) / 2.0 / a;
                result[1] = (-b - Math.sqrt(D)) / 2.0 / a;
                Printer.print("There are two roots of equation: x1 = " + result[0] + ", x2 = " + result[1]);
            } else if (D == 0) {
                result[0] = -b / 2.0 / a;
                Printer.print("There is only one root of equation: x = " + result[0]);
            } else {
                Printer.print("There is not real roots of equation!");
                result[0] = 0;
            }
        }
        return result;
    }
}
