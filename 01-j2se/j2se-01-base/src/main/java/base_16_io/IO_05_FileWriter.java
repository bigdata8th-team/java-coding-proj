package base_16_io;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriterͬOutputStream���ƣ����ڵͼ���
 * 1.write()
 * 2.write(char[])
 * 3.write(char[], off, length)
 */

public class IO_05_FileWriter {
	public static void main(String[] args) {
		String outputFilePath = "./src/cn/com/gsl/_16_io/output.txt";
		try (
				// �ڶ�������Ϊtrue����˼Ϊ׷��
				FileWriter fw = new FileWriter(outputFilePath);
				) {
			fw.write("��ã�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
