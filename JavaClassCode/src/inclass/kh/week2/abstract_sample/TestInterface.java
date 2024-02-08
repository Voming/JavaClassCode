package inclass.kh.week2.abstract_sample;

import java.util.ArrayList;

public class TestInterface {
	public static void main(String[] args) {
		// < > 자료형이 길게 적혀진것 일뿐
		ArrayList</* 대문자로 시작하는 자료형 */ Integer> intList = new ArrayList<Integer>();
		ArrayList</* 대문자로 시작하는 자료형 */ String> strList = new ArrayList<String>();

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
