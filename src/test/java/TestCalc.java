import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    private Calc calc;

    @BeforeEach
    public void setUp(){
        calc = new Calc();
    }

    @Test
    public void testCalc(){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {7,6,5,4,3,2,1};
        int res = calc.arraysAverageCompare(a, b);
        assertEquals(res, 0);

        a = new int[] {1,2,0,4,5,6,7};
        b = new int[] {7,6,5,4,3,2,1};
        res = calc.arraysAverageCompare(a, b);
        assertEquals(res, 1);

        a = new int[] {1,2,3,4,5,6,7};
        b = new int[] {7,0,5,4,3,2,1};
        res = calc.arraysAverageCompare(a, b);
        assertEquals(res, -1);
    }




}