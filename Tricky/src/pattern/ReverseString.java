package pattern;

public class ReverseString {

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        // Manually reverse the string
        String reversedString = reverseManually(originalString);
        
        // Display the result
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseManually(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
