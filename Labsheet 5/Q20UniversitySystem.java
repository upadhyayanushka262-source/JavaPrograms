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
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    double calculateSalary() {
        return salary;
    }
}

interface Researcher {
    void conductResearch();
}

interface Mentor {
    void guideStudents();
}

class Teacher extends Employee implements Researcher, Mentor {
    String subject;

    void teach() {
        System.out.println("Teaching: " + subject);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 5000;
    }

    public void conductResearch() {
        System.out.println("Teacher conducts research.");
    }

    public void guideStudents() {
        System.out.println("Teacher guides students.");
    }
}

class VisitingTeacher extends Teacher {
    int hoursWorked;

    @Override
    double calculateSalary() {
        return hoursWorked * 500;
    }
}

class Admin extends Employee {
    String department;

    void manageDepartment() {
        System.out.println("Managing: " + department);
    }
}

public class Q20UniversitySystem {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.setEmployeeId(101);
        t.setEmployeeName("Ravi");
        t.setSalary(40000);
        t.subject = "Java";

        System.out.println("--- Teacher Details ---");
        t.displayDetails();
        t.teach();
        t.conductResearch();
        t.guideStudents();
        System.out.println("Teacher Salary: " + t.calculateSalary());

        VisitingTeacher v = new VisitingTeacher();

        v.setEmployeeId(102);
        v.setEmployeeName("Neha");
        v.setSalary(20000);
        v.subject = "Python";
        v.hoursWorked = 20;

        System.out.println("\n--- Visiting Teacher ---");
        v.displayDetails();
        v.teach();
        System.out.println("Visiting Teacher Salary: "
                + v.calculateSalary());

        Admin a = new Admin();

        a.setEmployeeId(103);
        a.setEmployeeName("Amit");
        a.setSalary(35000);
        a.department = "Administration";

        System.out.println("\n--- Admin Details ---");
        a.displayDetails();
        a.manageDepartment();
        System.out.println("Admin Salary: " + a.calculateSalary());
    }
}