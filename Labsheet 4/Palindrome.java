class Palindrome {
    static int countChecks = 0;

    void check(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        countChecks++;

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome");
        }

        System.out.println("Total Checks: " + countChecks);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.check(121);
    }
}
