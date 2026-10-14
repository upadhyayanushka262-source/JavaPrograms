class EmployeeCompare {
    String name;
    double salary;
    static String organization = "ABC Company";

    void compare(EmployeeCompare e1, EmployeeCompare e2) {
        double salary1 = e1.salary;
        double salary2 = e2.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2) {
            System.out.println(e1.name + " has a higher salary");
        } else if (salary2 > salary1) {
            System.out.println(e2.name + " has a higher salary");
        } else {
            System.out.println("Both have equal salaries");
        }
    }

    public static void main(String[] args) {
        EmployeeCompare e1 = new EmployeeCompare();
        e1.name = "Rahul";
        e1.salary = 30000;

        EmployeeCompare e2 = new EmployeeCompare();
        e2.name = "Amit";
        e2.salary = 25000;

        e1.compare(e1, e2);
    }
}