import java.util.Comparator;

abstract class Card implements Comparable<Card>, Cloneable{
    private String navn;
    private int pin;
    private boolean sperret;
    private static int kortnummer;

    public Card(){}

    public Card(String navn, int pin){
        this.navn = navn;
        this.pin = pin;
        kortnummer = kortnummer;
        increaseKortnummer();
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

    public void setName(String name){
        navn = name;
    }

    public String toString(){
        return "Name: " + getName() + " Pin: " + getPin() + " Kortnummer: " + getKortnummer()
                + " Sperret: " + isSuspended();
    }

    public abstract boolean checkPIN(int pin);

    public int getPin() {
        return pin;
    }

    public void setPIN(int pin2){
        pin = pin2;
    }

    public void increaseKortnummer(){
        kortnummer++;
    }

    public int compareTo(Card card){
        if (getLastName().compareTo(card.getLastName()) == 0){
            return getFirstName().compareTo(card.getFirstName());
        } else {
            return getLastName().compareTo(card.getLastName());
        }
    }

    public abstract String getLastName();
    public abstract String getFirstName();

    public static Card cloneCard(Card card) throws CloneNotSupportedException {
        Card newCard = (Card) card.clone();
        return newCard;
    }


}

