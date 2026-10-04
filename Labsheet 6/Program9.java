public class Program9 {

    static void method3() {
        int a = 10;
        int b = 0;

        int result = a / b;
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {

        try {
            method1();
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}