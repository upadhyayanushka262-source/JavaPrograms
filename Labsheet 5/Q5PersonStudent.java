class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Q5PersonStudent {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Anu";
        s.age = 19;
        s.rollNo = 101;
        s.course = "BCA";

        s.displayStudent();
    }
}