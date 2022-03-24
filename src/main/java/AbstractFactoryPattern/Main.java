package AbstractFactoryPattern;

import AbstractFactoryPattern.Banks.Bank;
import AbstractFactoryPattern.Banks.Banks;
import AbstractFactoryPattern.Factories.AbstractFactory;
import AbstractFactoryPattern.Factories.FactoryCreator;
import AbstractFactoryPattern.Loans.Loan;
import AbstractFactoryPattern.Loans.LoanTypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banks.bankShower();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Please select the id of the bank, where you want to take credit");

        AbstractFactory afBank = FactoryCreator.getFactory(1);
        AbstractFactory afLoan = FactoryCreator.getFactory(2);

        Bank b = afBank.getBank(new Scanner(System.in).nextInt());
        if (b == null){System.out.println("you entered wrong number");return;}
        LoanTypes.loanShower();
        System.out.println("------------------------------------------");
        System.out.println("Choose the loan type you want to take");
        Loan l = afLoan.getLoan(new Scanner(System.in).nextInt());

        if (l == null){System.out.println("you entered wrong number");return;}

        System.out.print("Please enter the amount of money, you want to take: ");
        int loanAmount = new Scanner(System.in).nextInt();

        System.out.println();

        System.out.print("Please enter the duration of your loan : ");
        int loanDuration = new Scanner(System.in).nextInt();
        System.out.print("Enter the interest rate for "+ b.getBankName()+": ");
        l.getInterestRate(new Scanner(System.in).nextDouble());
        l.calculateLoadPayment(loanAmount,loanDuration);




    }
}
