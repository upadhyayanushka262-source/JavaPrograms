class Fibonacci {
    static int seriesCount = 0;

    void display(int n) {
        int first = 0;
        int second = 1;

        seriesCount++;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        System.out.println("Total Series: " + seriesCount);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.display(7);
    }
}