import java.util.*;
import java.text.*;

public class WeekDay{

    public static void main(String []args){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.print("First Date of the Week:\t");
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.print("Last Date of the Week:\t");
        System.out.println(df.format(c.getTime()));
        System.out.println();
    }
}
