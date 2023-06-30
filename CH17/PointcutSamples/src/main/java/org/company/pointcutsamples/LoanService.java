package org.company.pointcutsamples;

public class LoanService {
    public LoanService() {}

    public Boolean issueLoan(String customerId) {
        if (customerId.isBlank()) {
            System.out.println(this.getClass().getSimpleName() + " :  Loan CANNOT to be issued to customer[" + customerId + "]!");
            throw new NullPointerException("Customer ID is blank!");
        } else {
            System.out.println(this.getClass().getSimpleName() + " :  Loan has been issued to customer[" + customerId + "]!");
            return true;
        }
    }

    public Boolean clearDue(String customerId) {
        if (customerId.isBlank()) {
            System.out.println(this.getClass().getSimpleName() + " :  Cannot clear the customer[" + customerId + "]'s pending due!");
            throw new NullPointerException("Customer ID can not be blank!");
        } else {
            System.out.println(this.getClass().getSimpleName() + " : the customer[" + customerId + "]'s pending due has been cleared!!");
            return true;
        }
    }
}
