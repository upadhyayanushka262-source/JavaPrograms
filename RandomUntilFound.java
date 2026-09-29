import java.util.Random;

public class RandomUntilFound {
    public static void main(String[] args) {

        Random random = new Random();

        while (true) {

            int number = random.nextInt(100) + 1;

            System.out.println("Generated number: " + number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Number divisible by both 7 and 13 found: " + number);
                break;
            }
        }
    }
}