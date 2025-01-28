package assignments;

import java.util.HashMap;
public class DuplicateElements {


	public static void main(String[] args) {
		int[] array = {4, 5, 6, 7, 4, 6, 8, 9, 5};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        HashMap<Integer, Integer> elementCount = new HashMap<>();

        // Count the frequency of each element
        for (int num : array) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        // Display duplicates
        boolean hasDuplicates = false;
        System.out.println("Duplicate elements in the array:");
        for (var entry : elementCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }

	}

}

