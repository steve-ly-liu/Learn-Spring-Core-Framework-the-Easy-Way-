package org.company.sampleattribute;

public class LoanService {
    public LoanService() {}

    public Boolean issueLoan(String customerId) {
        //Boolean result = false;
        if (customerId.isBlank()) {
            System.out.println(this.getClass().getSimpleName() + " :  Loan has been issued to customer[" + customerId + "]!");
            throw new NullPointerException("Error : Customer Id is illegal!");
        } else {
            System.out.println(this.getClass().getSimpleName() + " :  Loan has been issued to customer[" + customerId + "]!");
            return true;
        }
    }

    public Boolean clearDue(String customerId) {
        if (customerId.isBlank()) {
            System.out.println(this.getClass().getSimpleName() + " : The customer[" + customerId + "]'s pending due CANNOT BE CLEARED !!!");
            throw new NullPointerException("Customer Id is Blank !!!");
        } else {
            System.out.println(this.getClass().getSimpleName() + " : The customer[" + customerId + "]'s pending due has been cleared!");
            return true;
        }
    }
}
