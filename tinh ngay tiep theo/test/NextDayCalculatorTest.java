import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("test 1-1-2018")
    public void test1(){
        String myString=NexDayCalculator.getNextDay(2018,1,1);
        String expectedString="2018-01-02";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("test 31-01-2018")
    public void test2(){
        String myString=NexDayCalculator.getNextDay(2018,1,31);
        String expectedString="2018-02-01";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("test 30-04=2018")
    public void test3(){
        String myString=NexDayCalculator.getNextDay(2018,4,30);
        String expectedString="2018-05-01";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("test 28-02-2018")
    public void test4(){
        String myString=NexDayCalculator.getNextDay(2018,2,28);
        String expectedString="2018-03-01";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("test 29-02-2020")
    public void test5(){
        String myString=NexDayCalculator.getNextDay(2020,2,29);
        String expectedString="2020-03-01";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("test 31-12-2018")
    public void test6(){
        String myString=NexDayCalculator.getNextDay(2018,12,31);
        String expectedString="2019-01-01";
        assertEquals(expectedString,myString);
    }
}
