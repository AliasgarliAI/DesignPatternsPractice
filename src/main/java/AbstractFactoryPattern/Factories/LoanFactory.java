package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Banks.Bank;
import AbstractFactoryPattern.Loans.Loan;
import AbstractFactoryPattern.Loans.LoanTypes;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(int bankId) {return null;}

    @Override
    public Loan getLoan(int loanId) {
        return LoanTypes.loanChecker(loanId);
    }
}
