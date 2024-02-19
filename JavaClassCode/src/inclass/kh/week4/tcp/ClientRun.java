package inclass.kh.week4.tcp;

public class ClientRun {
	public static void main(String[] args) {
		//서버에 요청(ip, port를 가지고)
		int port = 8008;  //서버와 동일한 port여야 함
		new TCPEchoClient().tcpClient("localhost"/*현재 실행하는 나의 IP*/, port);
	}
}
