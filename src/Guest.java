import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Guest extends Card{
    private String navn;
    private int pin;
    private GregorianCalendar dateCreated;
    private GregorianCalendar dateExpired;
    private String name;
    private String firstName;
    private String lastName;

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

    @Override
    public String getLastName() {
        name = getName();
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                lastName = name.substring(i+1, name.length());
            }
        }
        return lastName;
    }

    @Override
    public String getFirstName() {
        name = getName();
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                firstName = name.substring(0, i);
            }
        }
        return firstName;
    }
}
