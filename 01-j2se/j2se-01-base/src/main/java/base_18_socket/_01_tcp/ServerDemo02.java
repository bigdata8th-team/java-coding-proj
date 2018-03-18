package base_18_socket._01_tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
	public static void main(String[] args) {
		try(
				ServerSocket server = new ServerSocket(10000);
				Socket socket = server.accept();
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				) {
			System.out.println("监听成功...");
			OutputStream os = socket.getOutputStream();
//			InputStream is = socket.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is);
//			byte buf[] = new byte[20];
//			is.read(buf);
			System.out.println("服务器端接受：" + br.readLine());
//			pw.println("hello client");
//			pw.flush();
			
			Thread.sleep(10000);
			
			
			os.write("hello client".getBytes());
			os.flush();
			
		} catch (IOException e) {
			// TODO Auto-generatesd catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
