package base_14_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_08_ToSet {
	Map<String, Integer> mapAl = new HashMap<>();
	Map<Integer, Integer> mapCp = new HashMap<>();
	
	public Map_08_ToSet() {
		mapAl.put("ID", 1);
		mapAl.put("name", 0);
		mapAl.put("CP", 1);
		
		mapCp.put(1, 1);
		mapCp.put(2, 0);
		mapCp.put(3, 1);
	}
	
	public <T> void castToSet(Set<T> setTo, Map<T, Integer> mapFrom) {
		Set<T> keySet = mapFrom.keySet();
		
		for (T field : keySet) {
			if (mapFrom.get(field) != 0) {
				setTo.add(field);
			}
		}
	}
	
	public static void main(String[] args) {
		Set<String> setAl = new HashSet<>();
		Set<Integer> setCp = new HashSet<>();
		
		Map_08_ToSet castDemo = new Map_08_ToSet();
		castDemo.castToSet(setAl, castDemo.mapAl);
		castDemo.castToSet(setCp, castDemo.mapCp);
		
		System.out.println(setAl);
		System.out.println(setCp);
		
		for (Integer id : setCp) {
			System.out.println(id);
		}
		
		for (String str : setAl) {
			System.out.println(str);
		}
	}
}
