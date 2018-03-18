package base_16_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile
 * �ȿ��Զ�ȡ�ļ����ݣ�Ҳ�������ļ��������
 * ֧�֡�������ʡ��ķ�ʽ���������ֱ����ת���ļ�������ط�����д����
 * RandomAccessFile�������������������������ļ���¼ָ�룺
 * long getFilePointer()�������ļ���¼ָ��ĵ�ǰλ�á�
 * void seek(long pos)�����ļ���¼ָ�붨λ��posλ�� 
 * ���̶߳ϵ���������ʹ��RandomAccessFile��ʵ��
 */

public class IO_08_RandomAccessFile {
	public static void main(String[] args) {
		String filePath = "./src/cn/com/gsl/_16_io/test.txt";
		try(
				RandomAccessFile raf = new RandomAccessFile(filePath,"rw");
				) {
			raf.seek(raf.length());//��λ�ã��ѹ���Ƶ����
			raf.write("abcd".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
