package base_14_map;

import java.util.*;
import java.util.Map.Entry;

/*
 * Map�����򣬲��ظ���keyֵ�����ظ�����û��Stream������
 * 1.put    ����valueֵ
 * 2.get
 * 3.containsKey
 * 4.containsValue
 * 5.����    �õ�key����entry
 * 6.remove ɾ����Ӧ��Ԫ�أ�����valueֵ
 * 7.clear
 */

public class Map_01_Function {
	public static void main(String[] args) {
		Map<String, String[]> map = new HashMap<String, String[]>();
	
		// 1.put
		// 2.get
		System.out.println("====1.put/2.get====");
		map.put("���", new String[]{"��һ��Ǯ��������"});
		map.put("�ƶ�", new String[]{"���ģ����壬����"});
		map.put("����", new String[]{"֣�ߣ����ˣ���ʮ"});
		map.put("�̶�", new String[]{"֣�ߣ����ˣ���ʮ"}); // value�ظ�
		map.put("�ƶ�", new String[]{"���ԣ��������"}); // key�ظ�

		// ͨ��key������
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + Arrays.toString(map.get(key)));
		}
		
		// 3.containsKey
		System.out.println("====3.containsKey====");
		System.out.println("���Ӵ��ڣ�" + map.containsKey("����"));
		
		// 4.containsValue
		// TODO��������޸�
		System.out.println("====4.containsValue====");
		System.out.println("[��һ��Ǯ��������]�Ƿ���һ�ӣ�" + map.containsValue(map.get("���")));
		System.out.println("[��һ��Ǯ��������]�Ƿ���һ�ӣ�" + map.containsValue(new String[]{"��һ��Ǯ��������"}));
		
		// 5.����
		System.out.println("====5.iterator====");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.print(Arrays.toString(map.get(it.next())) + " ");
		}
		
		// ͨ��Entry������
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
		map.remove("���");
		System.out.println(map);
	
		// 7.clear
		System.out.println("====7.clear====");
		map.clear();
		System.out.println(map.size());
	}
}
