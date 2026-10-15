class Employee {
    private String name;
    private int employeeId;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Developer extends Employee implements Programmer, Researcher {
    public void writeCode() {
        System.out.println("Developer writes Java code.");
    }

    public void conductResearch() {
        System.out.println("Developer conducts research.");
    }
}

public class Q19Developer {
    public static void main(String[] args) {
        Developer d = new Developer();

        d.setName("Anu");
        d.setEmployeeId(101);

        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}
