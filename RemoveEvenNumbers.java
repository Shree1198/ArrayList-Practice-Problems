package ArrayListPracticeProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // Generate 10 random numbers between 1 and 100
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }

        System.out.println("Original List: " + numbers);

        // Remove even numbers using an iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        // Print the updated list
        System.out.println("Updated List (After Removing Even Numbers): " + numbers);
    }

}
