package pattern;

import java.util.ArrayList;

public class Collection {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(1);
		list2.add(4);
		
		System.out.println(list1.containsAll(list2));
		System.out.println(list1);
		System.out.println(list1.retainAll(list2));
		System.out.println(list1);	
	}
}