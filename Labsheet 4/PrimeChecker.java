class PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;

        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        System.out.println("Total Checks: " + totalPrimeChecks);
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();
        p.checkPrime(7);
    }
}
