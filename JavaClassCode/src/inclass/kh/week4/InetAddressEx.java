package inclass.kh.week4;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {
	public void method1(String domain) {
		System.out.println(domain + "에 대한 정보입니다.");
		// The constructor InetAddress() is not visible
		// InetAddress ia = new InetAddress(); //접근제한자가 default & 메소드만 호출해서 사용하면 되는 클래스

		try {
			// 도메인 명을 통해 IP주소를 얻는다.
			InetAddress ia = InetAddress.getByName(domain);
			System.out.println("getByName : " + ia);

			// IP주소를 byte 배열로 리턴
			byte[] b = ia.getAddress(); // new 는 안했지만 이미 new 가 되어있는 ia를 가져와서 사용한다.
			System.out.println("getAddress : " + b);
			System.out.println("getAddress : " + Arrays.toString(b)); // for문 사용하지 않고 배열 출력하기 + String으로 변환
			// byte 반목문 출력
			for (byte item : b) {
				System.out.println(item);
			}
			//양수로 바꿔주고 싶을 때
			for (int i = 0; i < b.length; i++) {
				if (b[i] < 0)
					System.out.print(b[i] + 256);
				else
					System.out.print(b[i]);
				System.out.print(".");
			}
			System.out.println();
			
			

			// byte 배열을 통해 IP주소를 얻는다.
			InetAddress iaA = InetAddress.getByAddress(b);
			System.out.println("getByAddress : " + iaA);

			// 도메인 명에 지정된 모든 호스트의 IP주소를 배열에 담아 반환
			InetAddress[] iaAN = InetAddress.getAllByName(domain);
			System.out.println("getAllByName : " + iaAN);
			System.out.println("getAllByName : " + Arrays.toString(iaAN));

			// 지역호스트의 IP주소를 반환한다.
			InetAddress iaLH = InetAddress.getLocalHost();
			System.out.println("getLocalHost : " + iaLH);

			// FQDN(Full Qualified Domain Name)을 얻는다. String
			System.out.println("getCanonicalHostName : " + iaA.getCanonicalHostName());
			// 호스트의 IP주소를 반환한다. String
			System.out.println("getHostAddress : " + iaA.getHostAddress());
			// 호스트의 이름을 반환한다. String
			System.out.println("getHostName : " + ia.getHostName());
			// IP주소가 멀티캐스트 주소인지 알려준다. boolean
			System.out.println("isMulticastAddress : " + ia.isMulticastAddress());
			// IP주소가 loopback 주소(127.0.0.1)인지 알려준다. boolean
			System.out.println("isLoopbackAddress : " + ia.isLoopbackAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
