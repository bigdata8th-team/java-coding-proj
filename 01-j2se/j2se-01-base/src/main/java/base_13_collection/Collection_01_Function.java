package base_13_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * Collection���÷�����
 * add();     ����Ԫ�أ�Ԫ�ؿ��ظ�
 * remove();    ɾ��Ԫ��
 * addAll();    ������һ������������Ԫ��
 * contains();  �Ƿ����Ԫ��
 * clear();  �������  
 * iterator();  ����
 * size();    ���ϴ�С
 * isEmpty(); �Ƿ�Ϊ��
 */
public class Collection_01_Function {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
	
		// ���Ԫ��
		coll.add("hank");
		coll.add("hank");
		coll.add("bob");
		coll.add("james");
		
		System.out.println(coll);
		System.out.println(coll.contains("hank"));
		
		// ɾ��Ԫ��
		coll.remove("bob");
		System.out.println(coll);
		
		// ������ת��Ϊ��Ӧ������
		String str[] = coll.toArray(new String[]{});
		System.out.println(Arrays.toString(str));
		
		// ��Ӽ���
		Collection<String> collMore = new ArrayList<>();
		collMore.add("vencent");
		collMore.addAll(coll);
		System.out.println(collMore);
	}
}
