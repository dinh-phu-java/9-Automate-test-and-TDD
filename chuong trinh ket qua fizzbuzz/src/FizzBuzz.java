import java.util.Scanner;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String checkFizzBuzz(int number){

        boolean isFizz = number % 5 == 0;
        boolean isBuzz = number % 3 == 0;
        if( (isBuzz && isFizz) || isNumberFizzBuzz(number) ){
            return FIZZ_BUZZ;
        }else {

            if(isFizz || isNumberFizz(number)){
                return FIZZ;
            }else if(isBuzz || isNumberBuzz((number))){
                return BUZZ;
            }else{
                String numberString= String.valueOf(number);
                return numberString;
            }

        }

    }

    public static String checkConvertToString(int number){
        String myNumber=String.valueOf(number);

        return myNumber;
    }
    public static boolean isFizzBuzz(int number){
        String myString=checkConvertToString(number);


        return false;
    }
    public static String read10(int number){
        if(number==10){
            return "muoi";
        }else{
            return "";
        }
    }
    public static String read0to10(char myChar){
        String numberString="";
        switch(myChar){
            case '0':
                numberString="khong";
                break;
            case '1':
                numberString="mot";
                break;
            case '2':
                numberString="hai";
                break;
            case '3':
                numberString="ba";
                break;
            case '4':
                numberString="bon";
                break;
            case '5':
                numberString="nam";
                break;
            case '6':
                numberString="sau";
                break;
            case '7':
                numberString="bay";
                break;
            case '8':
                numberString="tam";
                break;
            case '9':
                numberString="chin";
                break;

        }
        return numberString;
    }

    public static String read11to99(int number){
        char fristNumberChar= String.valueOf(number).charAt(0);
        char  secondNumberChar= String.valueOf(number).charAt(1);
        System.out.println(secondNumberChar);
        System.out.println(read0to10(secondNumberChar));
        String resultFirstStr="";
        String resultSecondStr="";
        if(secondNumberChar == '0'){
            resultSecondStr="";
        }else{
            resultSecondStr=read0to10(secondNumberChar);
        }
        switch(fristNumberChar){
            case '0':
                return read0to10(secondNumberChar);
            case '1':
                resultFirstStr="muoi ";
                break;
            case '2':
                resultFirstStr="hai muoi ";
                break;
            case '3':
                resultFirstStr="ba muoi ";
                break;
            case '4':
                resultFirstStr="bon muoi ";
                break;
            case '5':
                resultFirstStr="nam muoi ";
                break;
            case '6':
                resultFirstStr="sau muoi ";
                break;
            case '7':
                resultFirstStr="bay muoi ";
                break;
            case '8':
                resultFirstStr="tam muoi ";
                break;
            case '9':
                resultFirstStr= "chin muoi ";
                break;
        }

        return  resultFirstStr + resultSecondStr;
    }
    public static boolean isNumberFizzBuzz(int number){
        if(number > 10){
            char firstNumberChar= String.valueOf(number).charAt(0);
            char  secondNumberChar= String.valueOf(number).charAt(1);
            switch (firstNumberChar){
                case '5':
                    if(secondNumberChar =='3')
                        return true;
                    else return false;
                case '3':
                    if (secondNumberChar=='5')
                        return true;
                    else return false;
            }
        }else{
            return false;
        }
        return false;
    }
    public static boolean isNumberFizz(int number){
        if(number > 10){
            char firstNumberChar= String.valueOf(number).charAt(0);
            char  secondNumberChar= String.valueOf(number).charAt(1);
            if(firstNumberChar == '5' || secondNumberChar == '5'){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }
    public static boolean isNumberBuzz(int number){
        char firstNumberChar= String.valueOf(number).charAt(0);
        char  secondNumberChar= String.valueOf(number).charAt(1);
        if(firstNumberChar == '3' || secondNumberChar =='3'){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int number=0;
        do{

            System.out.print("nhập số cần check (lớn hơn 0 nhỏ hơn 100): ");
            number=in.nextInt();

        }while(number < 0 || number >=100);

        if(number < 10){
            char numchar=String.valueOf(number).charAt(0);
            System.out.println(read0to10(numchar) +" la: "+ checkFizzBuzz(number));
        }else if(number == 10){
            System.out.println(read10(number));
        }else{
            System.out.println(read11to99(number) + " la: "+ checkFizzBuzz(number));
        }
    }
}
