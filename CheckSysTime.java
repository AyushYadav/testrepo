import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ayushyadav on 9/23/15.
 */
public class CheckSysTime implements Runnable{
    public void run(){
        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormatter;
        String timeOut;
        rightNow=new Date();
        currentLocale=new Locale("en");
        timeFormatter=DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
        timeOut=timeFormatter.format(rightNow);
        System.out.println("Time : "+timeOut);

    }
}
