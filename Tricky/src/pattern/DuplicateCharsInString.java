package pattern;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInString {

    public static void main(String[] args) {
        String testString = "programming";

        System.out.println("Duplicate characters in '" + testString + "': " + findDuplicates(testString));
    }

    private static String findDuplicates(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedString = str.replaceAll("\\s", "").toLowerCase();

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through each character in the cleaned string
        for (char c : cleanedString.toCharArray()) {
            // Update the frequency in the map
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder duplicates = new StringBuilder();

        // Iterate through the map to find characters with frequency > 1
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.append(entry.getKey()).append(" ");
            }
        }

        return duplicates.toString().trim();
    }
    
    
    private static String findDuplicatesManual(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedString = str.replaceAll("\\s", "").toLowerCase();

        StringBuilder duplicates = new StringBuilder();

        // Iterate through each character in the cleaned string
        for (int i = 0; i < cleanedString.length(); i++) {
            char currentChar = cleanedString.charAt(i);
            boolean isDuplicate = false;

            // Check for duplicates by comparing with other characters in the string
            for (int j = i + 1; j < cleanedString.length(); j++) {
                if (currentChar == cleanedString.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // Append to the result if the character is a duplicate
            if (isDuplicate && duplicates.indexOf(String.valueOf(currentChar)) == -1) {
                duplicates.append(currentChar).append(" ");
            }
        }

        return duplicates.toString().trim();
    }
}
