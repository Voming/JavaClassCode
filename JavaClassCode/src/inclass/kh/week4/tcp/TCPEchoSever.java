package inclass.kh.week4.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoSever {
	public void tcpSever(/* byte[] ip, */ int port) {
		// port 지정하지 않는 다면 windodw가 남는 port 자동할당
		ServerSocket ss = null;
		Socket connectedClients = null;
		PrintWriter pw = null;

		BufferedReader br = null;
		try {
			//1. 서버 소켓 생성
			ss = new ServerSocket(port); // port넣으면 자동X
			System.out.println(ss.getInetAddress().getHostAddress() + " ====client 접속 대기");
			
			//2. 3. client 접속을 기다림 , scanner의 next와 유사함(계속 대기함) 
			//4. 통신이 가능한 소켓이 만들어짐
			connectedClients = ss.accept();
			System.out.println(connectedClients.getInetAddress().getHostAddress() + " ====client 접속 완료");
			
			
//			OutputStream os = connectedClients.getOutputStream();  혼선을 막기위해 아래 처럼 넣어줌
//			OutputStreamWriter osw = new OutputStreamWriter(connectedClients.getOutputStream());
//			osw.write("hello client");  //OutputStreamWriter 줄바꿈 같은 기호가 잘 안됨
//			osw.flush();
//
//			서버에서 클라이언트로 뿌림
//			pw = new PrintWriter(new OutputStreamWriter(connectedClients.getOutputStream()));
//			pw.println("HELLO CLIENT"); // PrintWriter를 사용하면 메소드가 훨씬 풍성해짐
//			pw.flush();
			
			// . // 입출력 스트림 얻어옴
			br = new BufferedReader(new InputStreamReader(connectedClients.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(connectedClients.getOutputStream()));
			String msg = null;
			// 클라이언트에서 서버로 받아옴
			while ((msg = br.readLine()) != null) {
				System.out.println("Client >" + msg);
				
				//읽고나서 바로 클라이언트로 Write하지 않으면 연결 끊김
				pw.println("~~" + msg);
				pw.flush();	
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // 생성의 반대 순서로 close() 해야함
				if (pw != null) pw.close();  //pw와 br의 close 순서는 상관없음
				if (br != null) br.close();
				if (connectedClients != null) connectedClients.close();
				if (ss != null) ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
