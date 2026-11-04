import java.util.ArrayList;
import java.util.HashSet;

public class HospitalPatientList {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        HashSet<String> patientIDs = new HashSet<>();

        patients.add("Rahul");
        patients.add("Priya");
        patients.add("Aman");

        patientIDs.add("P101");
        patientIDs.add("P102");
        patientIDs.add("P103");

        System.out.println("Patient Names: " + patients);
        System.out.println("Patient IDs: " + patientIDs);

        patients.remove("Priya");
        patientIDs.remove("P102");

        System.out.println("After Removal:");
        System.out.println("Patient Names: " + patients);
        System.out.println("Patient IDs: " + patientIDs);

        System.out.println("Search Rahul: " +
                           patients.contains("Rahul"));

        System.out.println("Search P101: " +
                           patientIDs.contains("P101"));
    }
}
