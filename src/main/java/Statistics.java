import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Statistics {
    static Map<Integer, String> countNumbers(String fileName) {
        List<Integer> numbers = FileOperations.readFile(fileName);
        Map<Integer, String> numbersStats = new TreeMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int tempValue = numbers.get(i);
            int counter = 0;
            for (Integer number : numbers) {
                if (tempValue == number) {
                    counter++;
                }
            }
            numbersStats.put(tempValue, " - liczba wystąpień " + counter);
        }
        return numbersStats;
    }

    public static void printStats(String fileName) {
        Map<Integer, String> numbers = countNumbers(fileName);
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
