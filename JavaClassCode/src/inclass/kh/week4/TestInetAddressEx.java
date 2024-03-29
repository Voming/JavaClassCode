package inclass.kh.week4;

import java.net.MalformedURLException;
import java.net.URL;

public class TestInetAddressEx {
	public static void main(String[] args) {
		new InetAddressEx().method1("oracle.com");
		
		try {
			URL url = new URL("http://www.oracle.com/downloads/index.html");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파일경로 : " + url.getFile());
			System.out.println("URL 전체 : " + url.toExternalForm());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
