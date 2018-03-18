package base_16_io;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream���ڵͼ���
 * 1.read()
 * 2.read(byte[])
 * 3.read(byte[], off, length)
 *     off��ʾ��byte��off���˿�ʼ
 */

public class IO_02_InputStream {
	public static void main(String[] args) throws IOException {
		String filePath = "./src/cn/com/gsl/_16_io/test.txt";
		FileInputStream fis = new FileInputStream(filePath);

		// 1.read()
		System.out.println("====1.read====");
		int var;	
		while ((var = fis.read()) != -1 ) { // ÿ�ζ�ȡһ��
			System.out.print((char)var);
		}		
		System.out.println("");
		fis.close();

		// 2.read(byte[])
		System.out.println("====2.read(byte[])====");
		fis = new FileInputStream(filePath);
		int len = -1;
		byte buf[] = new byte[100];
		
		while ((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		fis.close();
		
		// 3.read(byte[], off, length)
		System.out.println("====3.read(byte[], off, length)====");
		fis = new FileInputStream(filePath);
		len = -1;
		
		len = fis.read(buf, 0, 5); // \r\nռ�������ַ�
		System.out.print(new String(buf, 0, len));		
		fis.close();
	}
}
