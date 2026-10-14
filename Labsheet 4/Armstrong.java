class Armstrong {
    static int totalChecks = 0;

    void check(int number) {
        int original = number;
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        System.out.println("Total Checks: " + totalChecks);
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.check(153);
    }
}
