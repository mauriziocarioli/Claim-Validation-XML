package citrite;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Helper implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public Helper() {
    }

    public long daysBetweenDates(XMLGregorianCalendar firstDate, XMLGregorianCalendar secondDate) {
        return ChronoUnit.DAYS.between(firstDate.toGregorianCalendar().toZonedDateTime().toLocalDate(), secondDate.toGregorianCalendar().toZonedDateTime().toLocalDate());
    }
    
    public void registerValidation(BREObjectSFDC breObjectSFDC, String orderID, String checkName, String checkType, String checkResult, Boolean header) {
        //TODO
    }

}