class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        if (salary < 0 || salary > 1000000) {
            System.out.println("Invalid salary!");
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class Q3EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmployeeId(101);
        e.setEmployeeName("Rahul");

        e.setSalary(50000);
        e.setSalary(-500);

        e.displayDetails();
    }
}