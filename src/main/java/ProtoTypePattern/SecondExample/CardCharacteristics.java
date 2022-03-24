package ProtoTypePattern.SecondExample;

public class CardCharacteristics {
    private double cardWidth;
    private double cardLenght;
    private double size;

    public double getCardWidth() {
        return cardWidth;
    }

    public void setCardWidth(double cardWidth) {
        this.cardWidth = cardWidth;
    }

    public double getCardLenght() {
        return cardLenght;
    }

    public void setCardLenght(double cardLenght) {
        this.cardLenght = cardLenght;
    }

    public double getSize() {
        return size = cardLenght * cardWidth;
    }
    public CardCharacteristics(double cardWidth, double cardLenght) {
        this.cardWidth = cardWidth;
        this.cardLenght = cardLenght;
    }
}
