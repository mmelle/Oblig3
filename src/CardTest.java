
import java.util.ArrayList;
import java.util.Collections;

public class CardTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        ArrayList<Card> reg = new ArrayList<Card>();

        Card c1 = new Employee("Ole Olsen", 1234);
        Card c2 = new Guest("Marit Folsen", 9999);
        Card c3 = new Employee("Olsen Olsen", 3456);
        Card c4 = new Employee("Neslo Olsen", 6543);
        Card c5 = new Guest("Dole Dolsen", 9999);
        Card c6 = Card.cloneCard(c4);
        reg.add(c1);
        reg.add(c2);
        reg.add(c3);
        reg.add(c4);
        reg.add(c5);
        reg.add(c6);
        Collections.sort(reg);
        for (int i=0; i<reg.size(); i++) {
            Card card = (Card)reg.get(i);
            System.out.print(card);
            System.out.println("\nTest av kort: med kode 1234 er" + (card.checkPIN(1234) ? " gyldig" : " ugyldig" ) );
                    System.out.println("\nTest av kort: med kode 9999 er" + (card.checkPIN(9999) ? " gyldig" : " ugyldig" ) );
        }



    }

}
