package base_18_socket._02_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo01 {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			DatagramSocket socket = new DatagramSocket(10000);
			byte buf[] = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			String str = new String(buf, 0, buf.length);
			System.out.println(str);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
