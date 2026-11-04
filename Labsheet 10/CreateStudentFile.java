import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateStudentFile {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            file.createNewFile();

            FileWriter writer = new FileWriter(file);

            writer.write("Student Name: Anushka Upadhyay\n");
            writer.write("Roll Number: 101\n");
            writer.write("Course: BCA\n");
            writer.write("Semester: 3");

            writer.close();

            System.out.println("File created and data written successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}