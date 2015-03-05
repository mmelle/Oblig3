
abstract class Card {
    private String navn;
    private int pin;
    private boolean sperret;
    public static int kortnummer;

    public Card(){}

    public Card(String navn, int pin){
        this.navn = navn;
        this.pin = pin;
        this.kortnummer = kortnummer++;
        this.sperret = false;
    }

    public String getName(){
        return navn;
    }

    public boolean isSuspended(){
        return sperret;
    }

    public int getKortnummer(){
        return kortnummer;
    }

    public void setKortnummer(int kortnm){
        kortnummer = kortnm;
    }

    public void setSperret(boolean checkPIN){
        sperret = checkPIN;
    }

    public String toString(){
        return "Name: " + getName() + " Pin: " + getPin() + " Kortnummer: " + getKortnummer()
                + " Sperret: " + isSuspended();
    }

    public abstract boolean checkPIN(int pin);

    public int getPin() {
        return pin;
    }
}
