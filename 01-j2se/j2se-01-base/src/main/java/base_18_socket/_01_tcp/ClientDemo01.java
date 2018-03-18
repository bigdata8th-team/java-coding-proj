package base_18_socket._01_tcp;

import java.io.IOException;
import java.net.Socket;

public class ClientDemo01 {
	public static void main(String[] args) {
		try (
				Socket socket = new Socket("127.1", 10000);
				) {		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
