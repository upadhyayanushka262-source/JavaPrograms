class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Language: " + programmingLanguage);
        System.out.println("Developer writes code.");
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        System.out.println("Department: " + department);
        System.out.println("Manager conducts a meeting.");
    }
}

public class Q12DeveloperManager {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Aman";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.employeeName = "Riya";
        m.employeeId = 102;
        m.department = "IT";

        d.displayEmployee();
        d.writeCode();

        m.displayEmployee();
        m.conductMeeting();
    }
}