import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store characters and their frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the sjavatring to character array
        char[] charArray = str.toCharArray();

        // Iterate through the character array
        for (char ch : charArray) {
            // If the character is already present in the map, increment its frequency
            if (charFrequencyMap.containsKey(ch)) {
                charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
            } else {
                // If the character is encountered for the first time, add it to the map with frequency 1
                charFrequencyMap.put(ch, 1);
            }
        }

        // Print characters with frequency greater than 1 (indicating duplicates)
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "hello world";
        findDuplicateCharacters(str);
    }
}
