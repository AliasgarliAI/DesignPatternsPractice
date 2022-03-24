package AbstractFactoryPattern.Banks;



public class BeynelXalqBank implements Bank{
    private final String bankName;
    public BeynelXalqBank(){
        bankName = "BeynalXalq Bank";
    }
    @Override
    public  String getBankName() {
        return bankName;
    }
}
