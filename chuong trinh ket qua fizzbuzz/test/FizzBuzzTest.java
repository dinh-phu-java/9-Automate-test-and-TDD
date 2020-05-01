import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    @DisplayName("test 23")
    public void test1(){
        String myString= FizzBuzz.checkFizzBuzz(23);
        String expected= "Buzz";
        assertEquals(expected,myString);
    }
    @Test
    @DisplayName("test 91")
    public void test92(){
        String myString= FizzBuzz.checkFizzBuzz(91);
        String expected= "91";
        assertEquals(expected,myString);
    }
}
