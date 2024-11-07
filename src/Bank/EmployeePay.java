package Bank;

import java.util.Date;

public class EmployeePay extends Transaction{
    private String paymentMethod;
    public EmployeePay(Date date, String type, double amount, String paymentMethod) {
        super(date, type, amount);
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Payment Method: " + paymentMethod;
    }
}
