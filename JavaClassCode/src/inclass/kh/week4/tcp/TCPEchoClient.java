package inclass.kh.week4.tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPEchoClient {
	public void tcpClient(String ip, int port) {
		Socket cs = null;
		try {
			System.out.println("sever에 접속 요청.....");
			cs = new Socket(ip, port);
			System.out.println("sever에 접속 완료!!");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cs != null)
					cs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
