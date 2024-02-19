package inclass.kh.week4.tcp;

public class SeverRun {
	public static void main(String[] args) {
		int port = 8008; //가독성 때문에 변수 지정 후 사용
		new TCPEchoSever().tcpSever(port);
	}
}

//SeverRun 실행 + ClientRun실행 순서로 진행해야함