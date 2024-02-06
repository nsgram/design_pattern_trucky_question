package pattern;

import java.util.ArrayList;

public class ArrayListSort {

    public static void main(String[] args) {
        // Sample ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Sorting the ArrayList without using API functions
        selectionSort(numbers);

        // Displaying the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
    }

    private static void selectionSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the list
            for (int j = i + 1; j < n; j++) {
            	//change operator here
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
