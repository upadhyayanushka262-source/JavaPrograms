class Factorial {
    static int totalCalls = 0;

    void calculate(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Factorial: " + factorial);
        System.out.println("Total Calls: " + totalCalls);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.calculate(5);
    }
}