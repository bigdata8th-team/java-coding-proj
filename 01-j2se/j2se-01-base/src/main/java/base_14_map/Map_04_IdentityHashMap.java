package base_14_map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/*
 * IdentityHashMap
 * ��keyֵ���ʱ������Ϊ����entry��ͬ
 * HashMap�Ƚ�keyֵ�����equals��ͬ����ô����ԭkey��entry
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
	
		// 2.key���
		System.out.println("====2.identical====");
		Map<Integer, Integer> map = new IdentityHashMap<>();
		for (int i = 0; i < 100; i++) {
			map.put(10, 100);
		}		
		System.out.println(map.size());
	
		// TODO Ϊʲô����Ĳ�ͬ
		Map<Map_04_IdentityHashMap, Integer> maptest = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			Map_04_IdentityHashMap md = new Map_04_IdentityHashMap();
			maptest.put(md, 10);
		}
		
		System.out.println(maptest.size());
	}
}
