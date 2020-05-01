import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    public void testCal(){
        Calculator myCal=new Calculator();
        int x=1;
        int y=2;
        int exResult=3;
        int result= myCal.add(x,y);

    }

    @Test
    public void testAdd2(){
        int x= Integer.MAX_VALUE;
        int y=1;
        Calculator instance = new Calculator();
        try{
            int result  = instance.add(x,y);
            System.out.println(result);
        }catch(Exception e){
             throw new AssertionError("phu error");
        }
    }

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int a = max +Integer.MAX_VALUE+2;
        System.out.println(a);
    }

}
