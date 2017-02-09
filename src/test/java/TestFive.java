import org.junit.Test;
import task5.Succession;

import static org.junit.Assert.*;
public class TestFive {
    @Test
    public void testIsSuccessionNegativeOne(){
        int a = 4321;
        assertEquals(false, Succession.isSuccession(a));
    }
    @Test
    public void testIsSuccessionNegativeTwo(){
        int a = 8;
        assertEquals(false, Succession.isSuccession(a));
    }
    @Test
    public void testIsSuccessionNegativeThree(){
        int a = 123451;
        assertEquals(false, Succession.isSuccession(a));
    }
    @Test
    public void testIsSuccessionPositive(){
        int a = 123456789;
        assertEquals(true, Succession.isSuccession(a));
    }
}
