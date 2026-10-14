class Student {
    String name;
    int age;
    static int count = 0;

    void display() {
        count++;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Students: " + count);
    }

    public static void main(String[] args) {
        String n = "Anu";
        int a = 19;

        Student s1 = new Student();
        s1.name = n;
        s1.age = a;
        s1.display();

        Student s2 = new Student();
        s2.name = "Riya";
        s2.age = 20;
        s2.display();
    }
}