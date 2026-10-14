class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    void display() {
        int id = empId;
        double pay = salary;

        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + pay);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.empId = 101;
        e.salary = 25000;
        e.display();
    }
}