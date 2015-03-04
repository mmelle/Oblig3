import java.util.GregorianCalendar;
import java.util.Scanner;

public class Employee extends Card {
    private int pin;
    Scanner input = new Scanner(System.in);

    public Employee(int pin){
        this.pin = pin;
        this.kortnummer = getKortnummer();
        setKortnummer(getKortnummer() + 1);
    }

    public void useCard(){
        GregorianCalendar now = new GregorianCalendar();
        if(now.HOUR_OF_DAY < 7 || now.HOUR_OF_DAY > 17){
            System.out.println("Enter PIN: ");
            int pinput = input.nextInt();
            checkPIN(pinput);
        }
    }

    @Override
    public boolean checkPIN(int pin) {
        if (this.pin == pin){
            return true;
        } else {
            return false;
        }
    }
}
