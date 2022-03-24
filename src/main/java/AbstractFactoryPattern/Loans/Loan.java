package AbstractFactoryPattern.Loans;

public abstract class Loan {
    protected double rate;
    public abstract void getInterestRate(double rate);

    public void calculateLoadPayment(double loanAmount,int years){

        double EMI;
        int creditMonth;

        creditMonth = years * 12;

        rate = rate /1200;

        EMI = (rate * Math.pow((1+rate),creditMonth)) / (Math.pow((1+rate),creditMonth)) *loanAmount;

        System.out.println("your monthly EMI "+ EMI +" for the amount "+ loanAmount);
    }
}
