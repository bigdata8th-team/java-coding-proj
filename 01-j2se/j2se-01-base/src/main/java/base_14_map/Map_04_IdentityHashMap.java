package base_14_map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/*
 * IdentityHashMap
 * 当key值恒等时，才认为两个entry相同
 * HashMap比较key值，如果equals相同，那么覆盖原key的entry
 */

public class Map_04_IdentityHashMap {
	public static void main(String[] args) {	
		// 1.equals
		System.out.println("====1.equals====");
		Map<Integer, Integer> identityHashMap = new IdentityHashMap<>();
		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < 100; i++) {
			Integer val = new Integer(10);
			identityHashMap.put(val, 100);
			hashMap.put(val, 100);
		}	
		System.out.println(identityHashMap.size());
		System.out.println(identityHashMap.get(new Integer(10)));
		System.out.println(hashMap.size());
	
		// 2.key恒等
		System.out.println("====2.identical====");
		Map<Integer, Integer> map = new IdentityHashMap<>();
		for (int i = 0; i < 100; i++) {
			map.put(10, 100);
		}		
		System.out.println(map.size());
	
		// TODO 为什么这里的不同
		Map<Map_04_IdentityHashMap, Integer> maptest = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			Map_04_IdentityHashMap md = new Map_04_IdentityHashMap();
			maptest.put(md, 10);
		}
		
		System.out.println(maptest.size());
	}
}
