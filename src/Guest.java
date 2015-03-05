import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Guest extends Card{
    private String navn;
    private int pin;
    private GregorianCalendar dateCreated;
    private GregorianCalendar dateExpired;

    public Guest(String navn, int pin){
        setName(navn);
        setPIN(pin);
        setKortnummer(getKortnummer());
        increaseKortnummer();
        this.dateCreated = new GregorianCalendar();
        this.dateExpired = new GregorianCalendar(dateCreated.get(Calendar.YEAR),
                                dateCreated.get(Calendar.MONTH), dateCreated.get(Calendar.DATE) + 7,
                                dateCreated.get(Calendar.HOUR), dateCreated.get(Calendar.MINUTE),
                                dateCreated.get(Calendar.SECOND));
    }

    @Override
    public boolean checkPIN(int pin) {
        GregorianCalendar now = new GregorianCalendar();
        if (dateExpired.compareTo(now) > 0){
            if (getPin() == pin){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
