package base_14_map;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * LinkedHashMap
 * ��ô����ô����������LinkedList
 */

public class Map_03_LinkedHashMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("����", 90);
		map.put("��ѧ", 100);
		map.put("Ӣ��", 96);
		map.put("����", 90);
		System.out.println(map);
	}
}
