package base_13_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���ϱ�����ʽ��
 * 1.forEach
 * 2.forѭ��
 * 3.iterator
 */

public class Collection_02_Iterator {
	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
		
		coll.add(1);
		coll.add(5);
		coll.add(4);
	
		// 1.forEach����
		coll.forEach(t -> System.out.println("word is " + t));

		System.out.println("==========");
		// 2.forѭ��
		for (int var : coll) {
			System.out.println(var);
		}
		
		System.out.println("==========");
		// 3.iterator
		Iterator<Integer> it = coll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
