package pattern;

import java.util.HashSet;
import java.util.Set;

public class InterSetionofTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {1};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        Integer[] resultArray = set1.toArray(new Integer[0]);

        System.out.print("Intersection of arrays: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}