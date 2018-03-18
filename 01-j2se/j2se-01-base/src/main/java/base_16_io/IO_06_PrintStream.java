package base_16_io;

import java.io.*;

/*
 * PrintStream�����ֽ���������߼��������ض���
 * PrintWriter�����ַ���������߼���
 * 
 */

public class IO_06_PrintStream {
	public static void main(String[] args) {
		String filePath = "./src/cn/com/gsl/_16_io/output.txt";
		try (
				FileOutputStream fos = new FileOutputStream(filePath, true);
				PrintStream ps = new PrintStream(fos);
				PrintWriter pw = new PrintWriter(fos);
				) {
			ps.println("world");
			// �ض��������
			System.setOut(ps);
			System.out.println("С����ã�\n");
			pw.println("hello");
			pw.flush();//ǿ����ջ���
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
