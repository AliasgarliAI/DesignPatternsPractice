package ProtoTypePattern.SecondExample;

import java.util.Date;

public class Card  implements Cloneable{
    protected String cardholderFullName;
    protected String cardNumber;
    protected String cardCvv;
    protected Date cardExpiringDate;
    protected CardCharacteristics cardCharacteristics;

    public Card(){}

    public Card(String cardholderFullName, String cardNumber,
                String cardCvv, Date cardExpiringDate, CardCharacteristics cardCharacteristics) {
        this.cardholderFullName = cardholderFullName;
        this.cardNumber = cardNumber;
        this.cardCvv = cardCvv;
        this.cardExpiringDate = cardExpiringDate;
        this.cardCharacteristics = cardCharacteristics;
    }

    @Override
    public String toString() {
        return "Card Holder :" + cardholderFullName +"\r\n"
                +"Card Pan Number: " + cardNumber +"\r\n"
                +"Card Cvv: " + cardCvv +"\r\n"
                +"Card Expiring Date: " + cardExpiringDate +"\r\n"
                +"Card Size: " + cardCharacteristics.getSize();

    }

    @Override
    public Card clone() throws CloneNotSupportedException {
        return new Card(this.cardholderFullName,this.cardNumber,this.cardCvv,this.cardExpiringDate,this.cardCharacteristics);
    }
}
