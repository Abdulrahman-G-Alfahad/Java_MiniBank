package Bank;

public class Employee {
    private String id;
    private String name;
    private String position;
    private double salary;
    private EmployeeAccount account;

    public Employee(String id, String name, String position, double salary, EmployeeAccount account) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.account = account;
    }

    public double calculateWeeklySalary(int hoursPerWeek, int overtime, double bonus, double deductions){
        double weeklySalary = (getSalary() * hoursPerWeek) + (overtime * (salary * 1.5)) + bonus - deductions;
        return weeklySalary;
    }

    public String getId() {
        return id;
    }

    public void depositPay(double amount, String paymentMethod){
        account.depositPay(amount, paymentMethod);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(EmployeeAccount account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee " +
                " ID: " + id + '\'' +
                " Name: " + name + '\'' +
                " Position: " + position + '\'' +
                " Salary: " + salary + '\'' +
                " Account: " + account;
    }
}
