package AbstractFactoryPattern.Banks;

public class PashaBank implements Bank{
    private final String bankName;

    public PashaBank(){
        bankName = "Pasha Bank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
