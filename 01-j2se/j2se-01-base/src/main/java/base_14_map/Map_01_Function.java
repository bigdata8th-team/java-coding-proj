package base_14_map;

import java.util.*;
import java.util.Map.Entry;

/*
 * Map：无序，不重复（key值不能重复），没有Stream流操作
 * 1.put    返回value值
 * 2.get
 * 3.containsKey
 * 4.containsValue
 * 5.遍历    得到key或者entry
 * 6.remove 删除对应的元素，返回value值
 * 7.clear
 */

public class Map_01_Function {
	public static void main(String[] args) {
		Map<String, String[]> map = new HashMap<String, String[]>();
	
		// 1.put
		// 2.get
		System.out.println("====1.put/2.get====");
		map.put("红队", new String[]{"赵一，钱二，孙三"});
		map.put("黄队", new String[]{"李四，周五，吴六"});
		map.put("蓝队", new String[]{"郑七，王八，刘十"});
		map.put("绿队", new String[]{"郑七，王八，刘十"}); // value重复
		map.put("黄队", new String[]{"老赵，老李，老王"}); // key重复

		// 通过key来遍历
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + Arrays.toString(map.get(key)));
		}
		
		// 3.containsKey
		System.out.println("====3.containsKey====");
		System.out.println("蓝队存在：" + map.containsKey("蓝队"));
		
		// 4.containsValue
		// TODO这里如何修改
		System.out.println("====4.containsValue====");
		System.out.println("[赵一，钱二，孙三]是否是一队：" + map.containsValue(map.get("红队")));
		System.out.println("[赵一，钱二，孙三]是否是一队：" + map.containsValue(new String[]{"赵一，钱二，孙三"}));
		
		// 5.遍历
		System.out.println("====5.iterator====");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.print(Arrays.toString(map.get(it.next())) + " ");
		}
		
		// 通过Entry来遍历
		System.out.println("");
		Set<Entry<String, String[]>> entrySet = map.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
			System.out.print("[key=" + entry.getKey() + ",value=" + Arrays.toString(entry.getValue()) + "];");
		}
	
		System.out.println("");
		Iterator<Entry<String, String[]>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, String[]> entry = entryIterator.next();
			System.out.print("[key=" + entry.getKey() + ",value=" + Arrays.toString(entry.getValue()) + "];");
		}
	
		System.out.println("");
		// 6.remove
		System.out.println("====6.remove====");
		map.remove("红队");
		System.out.println(map);
	
		// 7.clear
		System.out.println("====7.clear====");
		map.clear();
		System.out.println(map.size());
	}
}
