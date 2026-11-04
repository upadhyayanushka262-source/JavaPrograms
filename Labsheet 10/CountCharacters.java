import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class CountCharacters {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("input.txt");
            fw.write("Java Programming 123");
            fw.close();

            FileReader fr = new FileReader("input.txt");

            int ch;
            int vowels = 0, consonants = 0;
            int digits = 0, spaces = 0;

            while ((ch = fr.read()) != -1) {
                char c = (char) ch;

                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                }
                else if (Character.isLetter(c)) {
                    consonants++;
                }
                else if (Character.isDigit(c)) {
                    digits++;
                }
                else if (c == ' ') {
                    spaces++;
                }
            }

            fr.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        }
        catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}
