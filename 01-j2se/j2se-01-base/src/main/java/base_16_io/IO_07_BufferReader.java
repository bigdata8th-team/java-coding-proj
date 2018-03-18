package base_16_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader�����ַ����롢���������߼���
 * readLine    ���ж�ȡ����
 */

public class IO_07_BufferReader {
	public static void main(String[] args) {	
		String str = "";	
		try (
				// InputStreamReaderת�����������ֽں��ַ���ת��
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				) {
			
			while ((str = br.readLine()) != null) { // ��ȡһ��
				if (str.equals("quit")) {
					System.out.println("�˳�");
					break;
				}
				System.out.println("���룺" + str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
