import Bank.BankAccount;
import Bank.Employee;
import Bank.EmployeeAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("You can test things here if you want.");
        // MY TESTS
        Employee ahmad = new Employee("00001","Ahmad", "Programmer",35, new EmployeeAccount("00001"));
        System.out.println(ahmad);
        double thisWeekSalary = ahmad.calculateWeeklySalary(40,5,100,50);
        System.out.println("This week's Salary: " + thisWeekSalary);
        ahmad.depositPay(thisWeekSalary, "check");
        ahmad.depositPay(thisWeekSalary, "direct deposit");
        ahmad.depositPay(thisWeekSalary, "cash");
        ahmad.depositPay(thisWeekSalary, "check");
        System.out.println(ahmad);
        ahmad.getAccount().withdrawal(45);
        ahmad.getAccount().withdrawal(45);
        ahmad.getAccount().withdrawal(457);
        ahmad.getAccount().withdrawal(103);
        System.out.println(ahmad);

    }
}