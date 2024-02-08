package inclass.kh.week2.abstract_sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestInterface {
	public static void main(String[] args) {
		// < > 자료형이 길게 적혀진것 일뿐
		// array 방식으로 만드냐
		ArrayList</* 대문자로 시작하는 자료형 */ Integer> intList = new ArrayList<Integer>();
		// link 방식으로 만드냐
		LinkedList<String> strList = new LinkedList<String>();
		// 인터페이스 방식을 사용하기 때문에 둘이 동일한 메소드로 가능한 것임
		
		//아래와 같은 형식도 가능함 -> 대부분 이 형태로 쓸 것임
		List< String> List = new ArrayList<String>();
		
		List = strList; 

		intList.add(1);
		intList.add(2);
		intList.add(3);

		System.out.println(intList); // [1, 2, 3]
		System.out.println(intList.size()); // 3
		intList.add(4);
		System.out.println(intList.size()); // 4
		intList.remove(2);
		System.out.println(intList); // [1, 2, 4]
		System.out.println(intList.size()); // 3
		
		strList.add("홍길동");
		strList.add("김철수");
		System.out.println(strList); // [홍길동, 김철수]
	}

}
