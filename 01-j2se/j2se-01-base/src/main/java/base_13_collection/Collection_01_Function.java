package base_13_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * Collection常用方法：
 * add();     增加元素，元素可重复
 * remove();    删除元素
 * addAll();    增加另一个集合中所有元素
 * contains();  是否包含元素
 * clear();  清除队列  
 * iterator();  遍历
 * size();    集合大小
 * isEmpty(); 是否为空
 */
public class Collection_01_Function {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
	
		// 添加元素
		coll.add("hank");
		coll.add("hank");
		coll.add("bob");
		coll.add("james");
		
		System.out.println(coll);
		System.out.println(coll.contains("hank"));
		
		// 删除元素
		coll.remove("bob");
		System.out.println(coll);
		
		// 将集合转化为对应的数组
		String str[] = coll.toArray(new String[]{});
		System.out.println(Arrays.toString(str));
		
		// 添加集合
		Collection<String> collMore = new ArrayList<>();
		collMore.add("vencent");
		collMore.addAll(coll);
		System.out.println(collMore);
	}
}
