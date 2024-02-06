package pattern;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapSortingByValue {public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	map.put("Z", 10);
	map.put("K", 50);
	map.put("D", 10);
	map.put("A", 20);
	List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
	entryList.sort(Comparator.comparing(Map.Entry::getKey));
	 //entryList.sort((a,b)-> a.getValue().compareTo(b.getValue()));
	 Map<String, Integer> sortedHashMap = new LinkedHashMap<>();
	 for (Map.Entry<String, Integer> entry : entryList) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
	 System.out.println(sortedHashMap);
	
}
}
