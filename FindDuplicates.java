package ArrayListPracticeProblems;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("grape");

        System.out.println("Original List: " + words);

        // Find and print duplicates
        Set<String> duplicates = findDuplicates(words);
        System.out.println("Duplicate Elements: " + duplicates);
    }

    public static Set<String> findDuplicates(ArrayList<String> list) {
        Set<String> duplicates = new HashSet<>();
        Map<String, Integer> elementCountMap = new HashMap<>();

        // Count occurrences of each element
        for (String element : list) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        // Identify duplicates
        for (Map.Entry<String, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
