package inclass.kh.week4.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoSever {
	public void tcpSever(/*byte[] ip, */ int port) {
		//port 지정하지 않는 다면 windodw가 남는 port 자동할당
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(port); //port넣으면 자동X
			System.out.println(ss.getInetAddress().getHostAddress() + " ====client 접속 대기");
			Socket connectedClients = ss.accept(); //client 접속을 기다림, scanner의 next와 유사함(계속 대기함)
			System.out.println(connectedClients.getInetAddress().getHostAddress() + " ====client 접속 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ss != null) ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
