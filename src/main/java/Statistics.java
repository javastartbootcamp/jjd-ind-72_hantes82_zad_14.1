import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Statistics {
    static Map<Integer, Integer> countNumbers(String fileName) {
        List<Integer> numbers = FileOperations.readFile(fileName);
        Map<Integer, Integer> numbersStats = new TreeMap<>();
        for (Integer number : numbers) {
            numbersStats.put(number, numbersStats.getOrDefault(number, 0) + 1);
        }
        return numbersStats;
    }

    public static void printStats(String fileName) {
        Map<Integer, Integer> numbers = countNumbers(fileName);
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " - liczba wystąpień " + entry.getValue());
        }
    }
}
