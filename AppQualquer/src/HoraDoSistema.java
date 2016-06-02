
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class HoraDoSistema {
    public static void main (String[] args) {
        Calendar c = new GregorianCalendar();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minuto = c.get(Calendar.MINUTE);
        
        if((hora >= 0) && ((hora <=5)&& minuto <= 59))
            System.out.println("Boa madrugada! São: "+ hora +":"+minuto);
        if((hora >= 6) && ( (hora <=11) && (minuto <= 59) ) )
            System.out.println("Bom dia! São: "+ hora +":"+minuto);
        if((hora >= 12) && ( (hora <=17) && (minuto <= 59) ) )
            System.out.println("Boa tarde! São: "+ hora +":"+minuto);
        if((hora >= 18) && ( (hora <=23) && (minuto <= 59) ) )
            System.out.println("Boa noite! São: "+ hora +":"+minuto);
    }
}
