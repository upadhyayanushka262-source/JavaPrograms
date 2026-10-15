class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class Q6EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.setName("Amit");
        m.setSalary(60000);
        m.department = "IT";

        m.displayManager();
    }
}
