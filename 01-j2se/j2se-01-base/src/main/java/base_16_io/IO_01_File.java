package base_16_io;

import java.io.File;
import java.io.IOException;

/*
 * File
 * 1.�ļ�����
 * 2.Ŀ¼����
 */

public class IO_01_File {
	public static void main(String[] args) {
		// 1.�ļ�����
		System.out.println("====1.�ļ�����====");
		File file = new File("./src/cn/com/gsl/_16_io/test.txt"); // ��ǰ·��Ϊ����·��
		
		System.out.println("�ļ��ָ�����" + File.separator);
		try {
			// �������򴴽��ļ�
			System.out.println("�����ļ��Ƿ�ɹ���" + file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ļ��Ƿ���ڣ�" + file.exists());
		System.out.println("�ļ�����" + file.getName());
		System.out.println("�Ƿ�Ϊ�ļ���" + file.isFile());
		System.out.println("�Ƿ�ΪĿ¼��" + file.isDirectory());
		System.out.println("�ļ����ȣ�" + file.length());
		System.out.println("�ļ�·����" + file.getPath());
		
		file.delete(); // ɾ���ļ�
	
		// 2.����Ŀ¼
		System.out.println("====2.����Ŀ¼====");
		File direcotry = new File("./src/cn/com/gsl/");
		
		File[] fileList = direcotry.listFiles();
		System.out.println(fileList.length);
		
		for (File f : fileList) {
			System.out.println(f.getName() + "----" + f.length());
		}		
	}
}
