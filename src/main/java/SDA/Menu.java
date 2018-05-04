package SDA;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {
    public void menu() {
        TimeAndDate timeAndDate = new TimeAndDate();
        //SimpleDateFormat timeVar = timeAndDate.time();
        //SimpleDateFormat dateVar = timeAndDate.date();
timeAndDate.date();
//        System.out.println("Current Date: " + varDate.format(dNow));
//        System.out.println("Current Time: " + varTime.format(dNow));
//String x = timeVar.toString();
        System.out.println("\n\n");
        System.out.println("********************************************");
        System.out.println("* Data: "+timeAndDate.date()+" * Godzina : "+" "+" *");
        System.out.println("********************************************");
        System.out.println("*                                          *");
        System.out.println("*   1. Wyśiwetl dostępne ksiązki           *");
        System.out.println("*   2.                                     *");
        System.out.println("*   3.                                     *");
        System.out.println("*   4. Dodaj książkę - ogólnie             *");
        System.out.println("*   5.                                     *");
        System.out.println("*   0. Koniec                              *");
        System.out.println("*                                          *");
        System.out.println("********************************************");
        System.out.println("\n\n");
//        TimeAndDate timeAndDate = new TimeAndDate();
//        String localTemp = String.valueOf(timeAndDate.time());
//        System.out.println(localTemp);

    }
}
