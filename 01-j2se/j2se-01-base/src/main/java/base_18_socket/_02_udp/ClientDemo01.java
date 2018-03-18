package base_18_socket._02_udp;

import java.io.IOException;
import java.net.*;

public class ClientDemo01 {
	public static void main(String[] args) {
		try (
				DatagramSocket socket = new DatagramSocket();
				) {
			byte data[] = "hello server".getBytes();
			DatagramPacket packet = new DatagramPacket(data, 
					data.length, 
					InetAddress.getByName("127.1"), 
					10000);
			
			socket.send(packet);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
