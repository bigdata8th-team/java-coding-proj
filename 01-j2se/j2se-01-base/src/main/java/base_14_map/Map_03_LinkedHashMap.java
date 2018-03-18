package base_14_map;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * LinkedHashMap
 * 怎么进怎么出，类似于LinkedList
 */

public class Map_03_LinkedHashMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("语文", 90);
		map.put("数学", 100);
		map.put("英文", 96);
		map.put("体育", 90);
		System.out.println(map);
	}
}
