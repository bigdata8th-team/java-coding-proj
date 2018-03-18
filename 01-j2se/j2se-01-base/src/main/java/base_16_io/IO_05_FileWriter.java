package base_16_io;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter同OutputStream类似，属于低级流
 * 1.write()
 * 2.write(char[])
 * 3.write(char[], off, length)
 */

public class IO_05_FileWriter {
	public static void main(String[] args) {
		String outputFilePath = "./src/cn/com/gsl/_16_io/output.txt";
		try (
				// 第二个参数为true，意思为追加
				FileWriter fw = new FileWriter(outputFilePath);
				) {
			fw.write("你好，高嵩凌");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
