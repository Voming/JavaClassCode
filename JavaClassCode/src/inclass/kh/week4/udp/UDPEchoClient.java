package inclass.kh.week4.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPEchoClient {
	private static String ip = "localhost"; // 상대방 ip
	private InetAddress inetAddr;

	private static int myPort = 9008;
	private static int destPort = 9007;

	public static void main(String[] args) {
		new UDPEchoClient().udpClient(ip, myPort);
	}

	public void udpClient(String ip, int myPort) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요 : ");
		String sendMsg = sc.nextLine();
		// byte[] sendMsgByteArr = new byte[sendMsg.length() * 2];
		byte[] sendMsgByteArr = sendMsg.getBytes(); // byte[]의 길이는 String의 3배이다
		System.out.println(sendMsgByteArr.length);

		// 1. UDP 소켓 생성
		try (DatagramSocket dsock = new DatagramSocket(myPort)) { // close를 안해도 됨, 포트 번호 없어도 됨
			// +) 같은 포트 번호를 사용한다면 서로 주고 받기가 안됨
			// +) UDP는 서버 개념이 없음(소켓을 열어놓고만 있다가 데이터 패킷만 전달함)
			// +) 보내고 받기 위해 소캣 2개가 열려 있어야함

			inetAddr = InetAddress.getByName(ip); // String -> InetAddress 변환

			// 2. 보낼 데이터 만들기
			DatagramPacket dataPack = new DatagramPacket(
					sendMsgByteArr, // 보내는 데이터를 byte[]형태로
					sendMsgByteArr.length, // 보내는 데이터 길이
					inetAddr, // 포트 번호
					destPort // 목적지
			);
			// 3. socket 을 통해서 packet 보내기
			dsock.send(dataPack);
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
