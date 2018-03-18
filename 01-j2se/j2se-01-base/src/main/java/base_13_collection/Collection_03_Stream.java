package base_13_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * 集合产生stream流对象，可以进行：
 * 1.count    计数
 * 2.collect 
 * 3.map     得到符合条件的新流
 * 4.max     取最大元素
 * 5.sort    排序
 * 6.filter    过滤
 * 7.distinct    去重
 */

public class Collection_03_Stream {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
	
		coll.add("hank");
		coll.add("hank");
		coll.add("bob");
		coll.add("james");
		coll.add("bob");
		coll.add("slina");
		
		// 1.count
		System.out.println("====1.stream count ====");
		System.out.println(coll.stream().count());
		
		// 2.collect
		System.out.println("====2.stream collect====");
		System.out.println("List = " + coll.stream().collect(Collectors.toList()));
		System.out.println("Set = " + coll.stream().collect(Collectors.toSet()));
		System.out.println("TreeSet = " + coll.stream().collect(Collectors.toCollection(TreeSet::new)));
		
		// 3.map
		System.out.println("====3.stream map====");
		System.out.println(coll.stream().map(t -> t + "-man")
				.collect(Collectors.toList()));
		System.out.println(coll.stream().map(Object::toString)
				.collect(Collectors.joining(": ")));
		
		// 4.max
		System.out.println("====4.stream max====");
		System.out.println(coll.stream().max((o1, o2) -> o1.compareTo(o2)).get());
		System.out.println(coll.stream().max((o1, o2) -> o2.compareTo(o1)).get());
		
		// 5.sort
		System.out.println("====5.sort====");
		System.out.println(coll.stream().sorted().collect(Collectors.toList()));
		System.out.println(coll.stream().sorted((o1, o2) -> o1.compareTo(o2))
				.collect(Collectors.toList()));
		
		// 6.filter
		System.out.println("====6.filter====");
		System.out.println(coll.stream().filter(t -> t.matches(".{3,4}"))
				.collect(Collectors.toList()));
		
		// 7.distinct
		System.out.println("====7.distinct====");
		System.out.println(coll.stream().distinct().collect(Collectors.toList()));
	}
}
