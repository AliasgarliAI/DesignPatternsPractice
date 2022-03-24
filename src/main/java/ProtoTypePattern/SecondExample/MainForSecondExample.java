package ProtoTypePattern.SecondExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MainForSecondExample {
    public static void main(String[] args) throws Exception {
        Date date = (new SimpleDateFormat("dd/MM/yyyy").parse("24/4/2024"));

        Card card = new Card("Alakbar Aliasgarli","4169737712349876",
                "506", date,new CardCharacteristics(5,2));

        Card card2 = card.clone();

        card2.cardholderFullName = "Rashad Mahammadzade";
        card2.cardNumber = "4169737745658595";

        System.out.println(card);
        System.out.println("\r\n");
        System.out.println(card2);


    }
}
