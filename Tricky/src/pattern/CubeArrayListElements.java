package pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CubeArrayListElements {

    public static void main(String[] args) {
        // Sample ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Finding the cube of all elements in the ArrayList
        cubeElements(numbers);

        // Displaying the updated ArrayList with cubed elements
        System.out.println("ArrayList with Cubed Elements: " + numbers);
        
     // Finding the cube of all elements using Java 8 streams
        List<Integer> cubedNumbers = numbers.stream()
                .map(number -> number * number * number)
                .collect(Collectors.toList());
        
        
        
    }

    private static void cubeElements(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            int cube = element * element * element;
            list.set(i, cube);
        }
    }
}
