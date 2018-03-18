package base_13_collection._02_set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * LinkedHashSet
 * 按照add的顺序组成集合
 * 不重复
 * 可以有null
 */

public class Set_02_LinkedHashSet {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();

		set.add("java");
		set.add("c");
		set.add("c++");
		set.add("c");
		set.add(null);
		set.add("c");
		set.add(".net");
		System.out.println(set);
	}
}
