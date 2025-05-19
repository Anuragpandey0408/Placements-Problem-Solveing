public class LongestWordFinder {
public static String maxLength(String str) {
    // Step 2: Split the string into words using the correct regex
    String[] words = str.split("\\s+");
    
    // Step 3: Identify the longest word
    String longestWord = "";
    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }
    return longestWord;
}

public static void main(String[] args) {
    String str = "Google Docs";
    System.out.println("Longest word in the string is: " + maxLength(str));
  }
}
