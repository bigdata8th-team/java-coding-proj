package base_16_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * OutputStream属于低级流
 * 1.write()
 * 2.write(byte[])
 * 3.write(byte[], off, length)
 */

public class IO_03_OutputStream {
	public static void main(String[] args) throws IOException {
		String inputFilePath = "./src/cn/com/gsl/_16_io/test.txt";
		String outputFilePath = "./src/cn/com/gsl/_16_io/output.txt";
		FileInputStream fis = new FileInputStream(inputFilePath);
		// 第二个参数为true，意思为追加
		FileOutputStream fos = new FileOutputStream(outputFilePath);

		// 1.write()
		System.out.println("====1.write====");
		int len = -1;
		while ((len = fis.read()) != -1) {
			fos.write((byte) len);
		}
		fos.write("\r\n".getBytes());
		fis.close();

		// 2.write(byte[])
		System.out.println("====2.write(byte[])====");
		fis = new FileInputStream(inputFilePath);
		len = -1;
		byte buf[] = new byte[128];

		while ((len = fis.read(buf)) != -1) {
			fos.write(buf);
		}
		fos.write("\r\n".getBytes());
		fis.close();
		
		// 3.write(byte[], off, length)
		// off从0开始
		System.out.println("====3.write(byte[],off,length)====");
		fis = new FileInputStream(inputFilePath);
		len = -1;
		len = fis.read(buf);
		fos.write(buf, 3, 3);
		fis.close();
		fos.close();
	}
}
