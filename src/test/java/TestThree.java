import org.junit.Test;
import task3.QuadraticEquation;

import static org.junit.Assert.*;

public class TestThree {
    @Test
    public void testSolveQuadraticEquitationOne() {
        int a = 1;
        int b = 6;
        int c = 9;
        double[] array = {-3.0, 0};
        assertArrayEquals(array, QuadraticEquation.solve(a, b, c), 0.1);
    }

    @Test
    public void testSolveQuadraticEquitationTwo() {
        int a = 5;
        int b = 3;
        int c = 7;
        double[] array = {0, 0};
        assertArrayEquals(array, QuadraticEquation.solve(a, b, c), 0.1);
    }

    @Test
    public void testSolveQuadraticEquitationThree() {
        int a = 2;
        int b = 4;
        int c = -7;
        double[] array = {1.12, -3.121};
        assertArrayEquals(array, QuadraticEquation.solve(a, b, c), 0.1);
    }

}
