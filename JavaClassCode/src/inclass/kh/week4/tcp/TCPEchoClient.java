package inclass.kh.week4.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPEchoClient {
	public void tcpClient(String ip, int port) {
		Scanner sc = new Scanner(System.in);
		Socket cs = null;
		BufferedReader br = null;
		
		PrintWriter pw = null;
		
		try {
			System.out.println("sever에 접속 요청.....");
			//3. 서버에 접속하는 소켓 
			//4. 서버에서 리턴 된거 대입함 (양쪽이 동시성을 가지고 생성됨)
			cs = new Socket(ip, port);
			System.out.println("sever에 접속 완료!!");
			
//			서버에서 클라이언트로 받아옴
//			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
//			String msg = null;
//			while ((msg = br.readLine()) != null) {
//				System.out.println("Sever >" + msg);
//			}
			
			// . // 입출력 스트림 얻어옴
			pw = new PrintWriter(new OutputStreamWriter(cs.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			
			while(true){
				System.out.print("전달 메시지 : ");
				String imputMsg = sc.nextLine();

				// 클라이언트에서 서버로 뿌림
				pw.println(imputMsg);
				pw.flush();
			
				//서버에서 클라이언트로 받아옴
				String msg = null;
				msg = br.readLine();
				
				if(msg == null) break;
				System.out.println("echo >" + msg);
			}
			System.out.println("echo 끝");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // 생성의 반대 순서로 close() 해야함
				if (pw != null) pw.close();
				if (br != null) br.close();
				if (cs != null) cs.close();
				if (sc != null) sc.close();   //sc는 단독생성 되어서 close순서 상관 없음
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
