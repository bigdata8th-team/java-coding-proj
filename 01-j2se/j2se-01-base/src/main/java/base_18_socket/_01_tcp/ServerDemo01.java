package base_18_socket._01_tcp;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerDemo01 {
	public static void main(String[] args) {
		try (
				ServerSocket server = new ServerSocket(10000);
				) {	
			System.out.println("开始监听...");
			server.accept();
			System.out.println("监听成功...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
