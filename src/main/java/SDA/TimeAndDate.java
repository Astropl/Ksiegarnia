package SDA;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAndDate {
    Date date = new Date();
    Time time;
    Date dNow = new Date();


    public SimpleDateFormat date ()
    {
        SimpleDateFormat varDate = new SimpleDateFormat("yyyy.MM.dd");
        return varDate;
    }

    @Override
    public String toString() {
        return "TimeAndDate{" +
                "date=" + date +
                ", time=" + time +
                ", dNow=" + dNow +
                '}';
    }

    public SimpleDateFormat time() {
        SimpleDateFormat varTime = new SimpleDateFormat("hh:mm:ss a");
        return varTime;
    }

    public TimeAndDate() {
        this.date = date;
        this.time = time;
    }


}
