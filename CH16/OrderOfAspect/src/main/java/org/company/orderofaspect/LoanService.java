package org.company.orderofaspect;

public class LoanService {
    public LoanService() {}

    public void issueLoan(String customerId) {
        System.out.println(this.getClass().getSimpleName() + " :  Loan has been issued to customer[" + customerId + "]!");
        throw new NullPointerException("Sample Exception");
    }

    public void clearDue(String customerId) {
        System.out.println(this.getClass().getSimpleName() + " : The customer[" + customerId + "]'s pending due has been cleared!");
    }
}
