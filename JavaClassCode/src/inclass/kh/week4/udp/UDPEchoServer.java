package inclass.kh.week4.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPEchoServer {
	private static String ip = "localhost"; // 상대방 ip
	private static int myPort = 9007;
	private static int destPort = 9008;

	public static void main(String[] args) {
		new UDPEchoServer().udpServer(myPort);
	}

	public void udpServer(int myPort) {
		// 1. UDP 소켓 생성
		try (DatagramSocket dsock = new DatagramSocket(myPort)) { // close 를 안해도 됨
			while (true) {
				// 2. 수신받을 데이터 packet 만들기
				byte[] buffer = new byte[1000];
				DatagramPacket dPacket = new DatagramPacket(
						buffer, 
						buffer.length
						);
				
				// 3. socket 을 통해서 수신받은 데이터 packet 을 담아달라고 하기
				dsock.receive(dPacket);  //데이터가 dPacket에 들어있음 
				// java 에서 흔치 않은 모양 void 자료형이고 dPacket을 받아서 dPacket에 넣어줌
				
				String reciveMsg = new String(dPacket.getData(), 0, dPacket.getLength());
				System.out.println(reciveMsg);
				//System.out.println(dPacket.getData().toString());  //[B@424c0bc4 로 나옴 String으로 변환 따로해주기
				System.out.println(reciveMsg.length());
				System.out.println(dPacket.getLength());
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
