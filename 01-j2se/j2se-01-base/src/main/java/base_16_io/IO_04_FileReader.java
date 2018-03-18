package base_16_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader同InputStream相似，属于低级流
 * 1.read
 * 2.read(char[])
 * 3.read(char[], off, length)
 */

public class IO_04_FileReader {
	public static void main(String[] args) {
		String filePath = "./src/cn/com/gsl/_16_io/test.txt";
		
		try (
				FileReader fr = new FileReader(filePath);
				) {
		
			int charactor = -1;
			while ((charactor = fr.read()) != -1) {
				System.out.print((char)charactor);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
