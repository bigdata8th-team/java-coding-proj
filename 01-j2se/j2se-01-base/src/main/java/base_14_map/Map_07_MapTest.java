package base_14_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_07_MapTest {
	public static void main(String[] args) {
		String pm25 = "农展馆=423,东四=378,丰台花园=406,天坛=322,海淀区万柳=398,"
				+ "官园=406,通州=366,昌平镇=248,怀柔镇=306,定陵=231,前门=422,"
                + "永乐店=368,古城=268,昌平镇=423,怀柔镇=267,定陵=377,前门=299,"
                + "永乐店=285,秀水街=277,农展馆=348,东四=356,丰台花园=179,天坛=277,"
                + "海淀区万柳=270,官园=268,通州=400";
		
		
		String pmstr[] = pm25.split(",");
		Map<String, Integer> map = new HashMap<>();
	
		for (int i = 0; i < pmstr.length; i++) {
			String key = pmstr[i].split("=")[0];
			int curval = Integer.valueOf(pmstr[i].split("=")[1]);
			
			if (map.containsKey(key)) {
				int oldval = map.get(key);
			    curval = oldval > curval ? oldval : curval;				
			}
			
			map.put(key, curval);
		}
		
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}
	}
}
