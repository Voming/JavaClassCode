package inclass.kh.week4;

import java.util.Arrays;

interface PrintString{
	//void showString(String str);
	
	void makeString(String s1, String s2);
}

public class TestLamda {
	public static void main(String[] args) {
//		PrintString lamdaStr = s -> System.out.println(s);
//		lamdaStr.showString("안녕");
//		showMyString(lamdaStr);
//		
		String s1 = "hello";
		String s2 = "world";
		PrintString concat = (c1 , c2) ->  System.out.println(s1 + s2);
		concat.makeString(s1, s2);
		
		int arr[] = {1,2,3,4,5,6};
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		int sumVal = Arrays.stream(arr).sum();
		System.out.println(sumVal);
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		
	}
	
	public static void showMyString(PrintString p) {
		//p.showString("메소드로 사용");
	}
}
