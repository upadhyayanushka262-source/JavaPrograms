class Student13<T, U, V> {
    T id;
    U name;
    V marks;

    Student13(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class Q13_ThreeParameters {
    public static void main(String[] args) {

        Student13<Integer, String, Double> s1 =
            new Student13<>(101, "Aman", 85.5);

        Student13<Integer, String, Double> s2 =
            new Student13<>(102, "Riya", 90.0);

        Student13<Integer, String, Double> s3 =
            new Student13<>(103, "Rahul", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}