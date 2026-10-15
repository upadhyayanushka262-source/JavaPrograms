class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        displayName();
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q8Manager {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Ravi";
        m.employeeId = 101;
        m.department = "Sales";

        m.displayManager();
    }
}