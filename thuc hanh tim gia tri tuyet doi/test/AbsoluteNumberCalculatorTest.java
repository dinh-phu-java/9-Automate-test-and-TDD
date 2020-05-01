import jdk.jfr.StackTrace;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {


    @Test
    @DisplayName("test 1")
    void testFindAbsolute() {
        int number =0;
        int expected=0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    public void testFindAbsolute1(){
        int number=1;
        int expected=1;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    public void testFindAbosuluteNegative(){
        int number=-1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(number,expected);
    }

    public static void main(String[] args) {
        
    }


}