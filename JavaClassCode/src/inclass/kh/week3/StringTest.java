package inclass.kh.week3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer("스트링 버퍼 값");

		String str1 = new String("스트링 객체 만들어서 비교 => 안됨, eqauls를 사용해야함");

		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);

		String str = "AA|BB|CC";

		StringTokenizer st = new StringTokenizer(str, "|");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		/*
		 * System.out.println("띄어쓰기 입력"); 
		 * int a = sc.nextInt(); //띄어쓰기가 들어가면 자동으로 b로 넘어가 값을 받음 
		 * int b = sc.nextInt();
		 * 
		 * System.out.println("정수하나 입력"); int c = sc.nextInt();
		 * 
		 * System.out.println(a); System.out.println(b); System.out.println(c);
		 */

		/*
		 * System.out.println("띄어쓰기 입력");
		 * 
		 * List<Integer> intlist = new ArrayList<Integer>(); while(sc.hasNextInt()) {
		 * //입력값이 들어올때까지 while문 내부가 실행되지 않다가 intlist.add(sc.nextInt()); //int가 아닌 형이 나오면
		 * 중단됨 } System.out.println(intlist); //System.out.println(intlist.get(3));
		 * 
		 * System.out.println(new Date()); //import java.util.Date
		 * 
		 * Date today = new Date(); SimpleDateFormat ft = new
		 * SimpleDateFormat("yyyy-MM-dd hh-mm-ss"); String ftToday = ft.format(today);
		 * System.out.println(ftToday);
		 */

		StringBuffer sb10 = new StringBuffer("스트링 버퍼값");
		StringBuffer sb20 = sb10;
		System.out.println(sb10);
		System.out.println(sb20);

		sb10.append("aaa");

		System.out.println(sb10); // 스트링 버퍼값aaa // 둘다 같은 메모리를 사용하기때문에 값이 같이 바뀜
		System.out.println(sb20); // 얕은 복사(주소값 복사)가 일어남

		// StringBuffer sb30 = (StringBuffer)sb10.clone(); //반환이 더 큰 Object형이기 때문에 자식인
		// StringBuffer에 넣을 수 없음
		// 형변환 안되는 이유...?

		
	}
}
