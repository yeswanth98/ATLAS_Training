import java.util.List;
import java.util.ArrayList;

// Generic payment interface
interface Payment {
    Object status();
    List<Object> getListOfPayment();
}

// Bank-specific interface
interface Bank {
    void initiatePayment();
    void stopPayment();
}

// Loan-specific interface
interface Loan {
    void initiateRepayment();
    void initiateFinalSettlement();
}

// Concrete class implementing Payment and Bank interfaces
class BankPayment implements Payment, Bank {

    @Override
    public Object status() {
        System.out.println("Bank payment status: SUCCESS");
        return "SUCCESS";
    }

    @Override
    public List<Object> getListOfPayment() {
        System.out.println("Fetching list of bank payments...");
        return new ArrayList<>();
    }

    @Override
    public void initiatePayment() {
        System.out.println("Initiating bank payment...");
    }

    @Override
    public void stopPayment() {
        System.out.println("Stopping bank payment...");
    }
}

// Concrete class implementing Payment and Loan interfaces
class LoanPayment implements Payment, Loan {

    @Override
    public Object status() {
        System.out.println("Loan payment status: PENDING");
        return "PENDING";
    }

    @Override
    public List<Object> getListOfPayment() {
        System.out.println("Fetching list of loan payments...");
        return new ArrayList<>();
    }

    @Override
    public void initiateRepayment() {
        System.out.println("Initiating loan repayment...");
    }

    @Override
    public void initiateFinalSettlement() {
        System.out.println("Initiating final settlement of loan...");
    }
}

// Driver class
public class HomeTask_InterfaceSegregationPrinciple_Task04 {
    public static void main(String[] args) {
        Payment bankPayment = new BankPayment();
        bankPayment.status();
        bankPayment.getListOfPayment();
        ((Bank) bankPayment).initiatePayment();
        ((Bank) bankPayment).stopPayment();

        System.out.println("------");

        Payment loanPayment = new LoanPayment();
        loanPayment.status();
        loanPayment.getListOfPayment();
        ((Loan) loanPayment).initiateRepayment();
        ((Loan) loanPayment).initiateFinalSettlement();
    }
}