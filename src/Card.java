
abstract class Card {
    private String fornavn;
    private String etternavn;
    private int pin;
    private boolean sperret;
    public static int kortnummer;

    public Card(String fornavn, String etternavn, int pin){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.pin = pin;
        this.kortnummer = kortnummer++;
        this.sperret = false;
    }

    public String getName(){
        return fornavn + etternavn;
    }

    public boolean isSuspended(){
        return sperret;
    }

    public String toString(){
        return "Name: " + getName() + " Pin: " + pin + " Kortnummer: " + kortnummer
                + " Sperret: " + isSuspended();
    }

    public abstract boolean checkPIN(int pin);
}
