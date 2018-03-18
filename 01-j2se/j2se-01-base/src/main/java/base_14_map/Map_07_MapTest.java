package base_14_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_07_MapTest {
	public static void main(String[] args) {
		String pm25 = "ũչ��=423,����=378,��̨��԰=406,��̳=322,����������=398,"
				+ "��԰=406,ͨ��=366,��ƽ��=248,������=306,����=231,ǰ��=422,"
                + "���ֵ�=368,�ų�=268,��ƽ��=423,������=267,����=377,ǰ��=299,"
                + "���ֵ�=285,��ˮ��=277,ũչ��=348,����=356,��̨��԰=179,��̳=277,"
                + "����������=270,��԰=268,ͨ��=400";
		
		
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
