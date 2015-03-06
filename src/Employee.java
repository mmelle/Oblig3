import java.util.GregorianCalendar;
import java.util.Scanner;

public class Employee extends Card implements Permanent {
    private String name;
    private String firstName;
    private String lastName;
    private double timeLonn;
    private double antallAarsAns;
    private final double FACTOR1 = 1;
    private final double FACTOR2 = 1;

    private int pin;
    Scanner input = new Scanner(System.in);

    public Employee(String name, int pin){
        setName(name);
        setPIN(pin);
        setKortnummer(getKortnummer());
        increaseKortnummer();
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
        if (getPin() == pin){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setFirstName(String fName) {
        firstName = fName;
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

    @Override
    public void setLastName(String lName) {
        lastName = lName;
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
    public void setFullName(String fName, String lName) {
        name = fName + " " + lName;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public double calculateCredit() {
        return FACTOR1 * timeLonn;
    }

    @Override
    public double calculateBonus() {
        return FACTOR2 * antallAarsAns;
    }
}
