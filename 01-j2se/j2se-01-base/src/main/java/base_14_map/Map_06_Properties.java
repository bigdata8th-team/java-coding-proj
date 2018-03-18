package base_14_map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties
 * 可以把Map对象中的key-value对写入属性文件中，
 * 也可以把属性文件中的”属性名=属性值”加载到Map对象中。
 */
public class Map_06_Properties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();

		// load文件
		// 绝对路径或相对路径
		prop.load(new FileInputStream("../jdbc.properties"));
		// 相对路径，从src开始
		prop.load(Map_06_Properties.class.getClassLoader().getResourceAsStream("cn/com/gsl/_14_map/jdbc.properties"));
	
		prop.setProperty("password", "1234");  // 修改

		System.out.println(prop.get("driver"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("user"));
		System.out.println(prop.get("password"));
		System.out.println(prop.getProperty("password"));
				
		prop.store(new FileOutputStream("D:/5_workstation/1_workstation_eclipse/test.prop"), "hank");
	}
}
