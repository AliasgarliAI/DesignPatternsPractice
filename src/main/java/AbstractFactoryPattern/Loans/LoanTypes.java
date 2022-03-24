package AbstractFactoryPattern.Loans;



import java.util.Arrays;
import java.util.List;

public enum LoanTypes {
    Business_Loan(1, "Education loan", new BusinessLoan()),
    Education_Loan(2, "Business loan", new EducationLoan()),
    Home_Loan(3, "Home loan", new HomeLoan());

    private int loanId;
    private String loanName;
    private Loan loan;

    private static final List<LoanTypes> loansList = Arrays.asList(LoanTypes.values());

    LoanTypes(int id, String name, Loan loan) {
        this.loanId = id;
        this.loanName = name;
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "loanId= " + loanId + ", loanName= " + loanName;
    }

    public static void loanShower() {
        for (LoanTypes b : loansList)
            System.out.println(b);
    }

    public static Loan loanChecker(int id) {
        for (LoanTypes b : loansList)
            if (b.loanId == id)
                return b.loan;

        return null;
    }
}
