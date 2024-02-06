package pattern;

import java.util.HashMap;

public class NumberOfChar {
	
	public static void main(String[] args) {
		String str = "AAA BBB";
		char chArr[] = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : chArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
