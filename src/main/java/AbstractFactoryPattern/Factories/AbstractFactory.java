package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Banks.*;
import AbstractFactoryPattern.Loans.*;

public abstract class AbstractFactory {
    public abstract Bank getBank(int bankId);
    public abstract Loan getLoan(int loanId);


}
