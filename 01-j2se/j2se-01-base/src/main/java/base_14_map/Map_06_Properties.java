package base_14_map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties
 * ���԰�Map�����е�key-value��д�������ļ��У�
 * Ҳ���԰������ļ��еġ�������=����ֵ�����ص�Map�����С�
 */
public class Map_06_Properties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();

		// load�ļ�
		// ����·�������·��
		prop.load(new FileInputStream("../jdbc.properties"));
		// ���·������src��ʼ
		prop.load(Map_06_Properties.class.getClassLoader().getResourceAsStream("cn/com/gsl/_14_map/jdbc.properties"));
	
		prop.setProperty("password", "1234");  // �޸�

		System.out.println(prop.get("driver"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("user"));
		System.out.println(prop.get("password"));
		System.out.println(prop.getProperty("password"));
				
		prop.store(new FileOutputStream("D:/5_workstation/1_workstation_eclipse/test.prop"), "hank");
	}
}
