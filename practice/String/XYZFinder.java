
import java.io.*;
import java.util.*;
import java.io.*;
import java.text.*;

class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString1 = scan.nextLine();
        String inputString2 = scan.nextLine();
        scan.close();

        String result = canGenerateDocument(inputString1, inputString2);
        System.out.println(result);
    }

    public static String canGenerateDocument(String availableWords, String document) { 
        Set<String> auxiliaryWords = new HashSet<>(Arrays.asList("is", "are", "was", "were"));
        Map<String, Integer> availableWordCount = getWordFrequency(availableWords, auxiliaryWords) ;     
        Map<String, Integer> documentWordCount = getWordFrequency(document, auxiliaryWords);

        int nonAuxiliaryWordsUsed = 0;
        int unusedWords = 0;

        // Iterate through the document's word count
        for (String word : documentWordCount.keySet()) {
            int requiredCount = documentWordCount.get(word);
            if (auxiliaryWords.contains(word)) {
                continue;  // Ignore auxiliary words for non-auxiliary words count
            }
            int availableCount = availableWordCount.getOrDefault(word, 0);
            if (availableCount < requiredCount) {
                // If we don't have enough of any word, return false
                return "false " + nonAuxiliaryWordsUsed + " " + countUnusedWords(availableWordCount);
            } else {
                nonAuxiliaryWordsUsed += requiredCount;  // Add to the count of non-auxiliary words used
                availableWordCount.put(word, availableCount - requiredCount);  // Reduce the count of used words
            }
        }
        unusedWords = countUnusedWords(availableWordCount);
        return "true " + nonAuxiliaryWordsUsed + " " + unusedWords;
    }
    public static Map<String, Integer> getWordFrequency(String text, Set<String> auxiliaryWords) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().split("\\s+");
       for (String word : words) {
            if (!word.isEmpty() && !auxiliaryWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
    public static int countUnusedWords(Map<String, Integer> availableWordCount) {
        int unusedWords = 0;
        for (int count : availableWordCount.values()) {
            unusedWords += count;
        }
        return unusedWords;
    }
}