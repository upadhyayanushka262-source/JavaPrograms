import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("notes.txt");
            fw.write("Java is easy. Java is powerful. I love Java.");
            fw.close();

            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            BufferedReader br = new BufferedReader(
                new FileReader("notes.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }

            br.close();

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found.");
            }
        }
        catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}
