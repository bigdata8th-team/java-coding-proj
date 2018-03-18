package base_13_collection._02_set;

import java.util.*;
import java.util.stream.Collectors;

public class Set_01_Function {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		// 1.add
		System.out.println("====1.add====");
		set.add("java");
		set.add("c");
		set.add("c++");
		set.add("c");
		set.add("c");
		set.add(".net");
		System.out.println(set);
		
		// 2.remove
		System.out.println("====2.remove====");
		set.remove("c");
		System.out.println(set);
		
		// 3.toArray
		System.out.println("====3.toArray====");
		String str[] = set.toArray(new String[set.size()]);
		System.out.println(Arrays.toString(str));

		// 4.for
		System.out.println("====4.for====");
		for (String str1:set) {
			System.out.print(str1+"\t");
		}	
		System.out.println();

		// 5.iterator
		System.out.println("====5.iterator====");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
		
		// 6.stream
		System.out.println("====6.stream====");
		// ���ù�����LinkedHashSet::new�൱��(a,b)->new LinkedHashSet(a,b)
		System.out.println(set.stream().sorted((o1, o2) -> o1.compareTo(o2)).
				collect(Collectors.toList()));
//		System.out.println(set.stream().
//				collect(Collectors.toCollection(TreeSet::new)));
	}
}
