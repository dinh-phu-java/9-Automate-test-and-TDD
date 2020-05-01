import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class NexDayCalculator {

    public static String getNextDay(int myYear,int myMonth,int myDay){

        LocalDateTime myLocalTime= LocalDateTime.of(myYear,myMonth,myDay,0,0,0);
        LocalDateTime nextLocalTime= myLocalTime.plusDays(1);
        Calendar myCld= Calendar.getInstance();
        System.out.println(nextLocalTime.getYear() +" "+nextLocalTime.getMonthValue() + " "+nextLocalTime.getDayOfMonth());
        myCld.set(nextLocalTime.getYear(),nextLocalTime.getMonthValue()-1,nextLocalTime.getDayOfMonth());
        Date trueDate = myCld.getTime();
        SimpleDateFormat simpleFormat= new SimpleDateFormat("YYYY-MM-dd");
        String myDateString= simpleFormat.format(trueDate);
        return myDateString;
    }

    public static void main(String[] args) {

    }
}
