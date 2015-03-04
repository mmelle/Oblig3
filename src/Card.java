
abstract class Card {
    private String fornavn;
    private String etternavn;
    private int pin;
    private boolean sperret;
    public static int kortnummer;

    public Card(){}

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
        return "Name: " + getName() + " Pin: " + pin + " Kortnummer: " + kortnummer
                + " Sperret: " + isSuspended();
    }

    public abstract boolean checkPIN(int pin);
}
