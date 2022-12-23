import java.util.Date;
import java.text.ParseException;
import java.util.Locale;
import java.text.SimpleDateFormat;
public class setB1{
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new
        SimpleDateFormat ("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Current date is: "+strDate);

        formatter=new SimpleDateFormat ("dd-MM-yyyy");
        String strrDate = formatter.format(date);
        System.out.println("Current date is: "+strrDate);

        formatter=new SimpleDateFormat ("EEEEEE MMMM dd yyyy");
        String strDatee = formatter.format(date);
        System.out.println("Current date is: "+strDatee);

        formatter=new SimpleDateFormat ("E MMMM dd HH:mm:ss z yyyy");
        String strDatte = formatter.format(date);
        System.out.println("Current date and time is: "+strDatte);

        formatter=new SimpleDateFormat ("dd/MM/yy HH:mm:ss a Z");
        String sstrDatte = formatter.format(date);
        System.out.println("Current date and time is: "+sstrDatte);

        formatter=new SimpleDateFormat ("hh:mm:ss");
        String strDatte2 = formatter.format(date);
        System.out.println("Current time is: "+strDatte2);

        formatter=new SimpleDateFormat ("w");
        String strDatte3 = formatter.format(date);
        System.out.println("Current weeks in a year is: "+strDatte3);

        formatter=new SimpleDateFormat ("W");
        String strDatte4 = formatter.format(date);
        System.out.println("Current weeks in month is: "+strDatte4);

        formatter=new SimpleDateFormat ("D");
        String strDatte5 = formatter.format(date);
        System.out.println("Current day of the year is: "+strDatte5);
    }
}