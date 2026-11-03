class Employee<T, U> {
    T id;
    U name;

    Employee(T id, U name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Q6_GenericEmployee {
    public static void main(String[] args) {
        Employee<Integer, String> e =
            new Employee<>(101, "Amit");

        e.display();
    }
}
