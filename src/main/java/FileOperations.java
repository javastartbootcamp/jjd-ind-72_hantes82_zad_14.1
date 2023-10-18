import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileOperations {
    static List<Integer> readFile(String fileName) {
        List<Integer> numbersList = new ArrayList<>();
        File file = new File(fileName);
        try (
                Scanner scan = new Scanner(file);
                ) {
            while (scan.hasNextLine()) {
                numbersList.add(scan.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");;
        }

        return numbersList;
    }

}
