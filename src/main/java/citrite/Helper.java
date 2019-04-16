package citrite;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Helper implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private Helper() {
    }

    public static long daysBetweenDates(Date firstDate, Date secondDate) {
        return ChronoUnit.DAYS.between(firstDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), secondDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }
    
    public static void registerValidation(BREObjectSFDC breObjectSFDC, String orderID, String checkName, String checkType, String checkResult, Boolean header) {
        //TODO
    }

}