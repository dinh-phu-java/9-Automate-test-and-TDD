import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import static org.junit.jupiter.api.Assertions.*;
public class ClarifyTriangleTest {
    @Test
    @DisplayName("2 ,2,2")
    public void test1(){
        String myString= ClarifyTriangle.checkTriangle(2,2,2);
        String expectedString= "tam giac deu";
        assertEquals(expectedString,myString);

    }
    @Test
    @DisplayName("2,2,3")
    public void test2(){
        String myString= ClarifyTriangle.checkTriangle(2,2,3);
        String expectedString= "tam giac can";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("3,4,5")
    public void test3(){
        String myString= ClarifyTriangle.checkTriangle(3,4,5);
        String expectedString= "tam giac thuong";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("8,2,3")
    public void test4(){
        String myString= ClarifyTriangle.checkTriangle(8,2,3);
        String expectedString= "khong phai la tam giac";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("-1,2,1")
    public void test5(){
        String myString= ClarifyTriangle.checkTriangle(-1,2,1);
        String expectedString= "khong phai la tam giac";
        assertEquals(expectedString,myString);
    }
    @Test
    @DisplayName("0,1,1")
    public void test6(){
        String myString= ClarifyTriangle.checkTriangle(0,2,1);
        String expectedString= "khong phai la tam giac";
        assertEquals(expectedString,myString);
    }
}
