package base_18_socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Socket_01_Attribute {
	public static void main(String[] args) {
		try (
				Socket s = new Socket("127.1", 2425);
				Socket s1 = new Socket("192.168.1.101", 2425);
				) {
			
			InetAddress ia = s.getLocalAddress();
			
			System.out.println(ia.getHostName());
			System.out.println(ia.getHostAddress());
			System.out.println(InetAddress.getLocalHost());
			System.out.println(s.getPort());
			System.out.println(s.getLocalPort());
			System.out.println(s.getInetAddress());
			System.out.println(s.getLocalAddress());
			
			
			InetAddress ia1 = s1.getInetAddress();
			System.out.println(ia1.getHostAddress());
			System.out.println(ia1.getHostName());
			System.out.println(s1.getLocalPort());
			System.out.println(s1.getPort());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
