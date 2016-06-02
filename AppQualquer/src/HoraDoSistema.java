import java.util.Calendar;
import java.util.GregorianCalendar;

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
