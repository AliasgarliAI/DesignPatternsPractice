package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Banks.Bank;
import AbstractFactoryPattern.Banks.Banks;
import AbstractFactoryPattern.Loans.Loan;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(int bankId) {
        return Banks.bankChecker(bankId);}
    @Override
    public Loan getLoan(int loanId) {return null;}
}
