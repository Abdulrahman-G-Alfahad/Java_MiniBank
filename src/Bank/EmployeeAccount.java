package Bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeAccount extends BankAccount{

    private List<EmployeePay> paymentHistory = new ArrayList<EmployeePay>();

    public EmployeeAccount(String accountNumber) {
        super(accountNumber);
    }

    public void depositPay(double amount, String paymentMethod) {
        paymentHistory.add(new EmployeePay(new Date(), "deposit", amount, paymentMethod));
        super.deposit(amount);
    }

    @Override
    public String toString() {
        return super.toString() +" Payment History: " + paymentHistory ;
    }
}
