package inclass.kh.week3;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import inclass.kh.week2.abstract_test.Student;

public class CollectionTest {
	public static void main(String[] args) {
		List<String> strList = new LinkedList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		strList.add("m");
		strList.add("r");
		strList.add("t");
		strList.add("*");
		strList.add("/");
		strList.add(",");
		strList.add("i");
		strList.add("o");
		System.out.println(strList.get(3)); // D
		strList.remove(3);
		System.out.println(strList); //[A, B, C]
		System.out.println(strList.isEmpty()); //false
		//strList.clear();
		System.out.println(strList.isEmpty()); //true
		
		Collections.sort(strList);
		System.out.println(strList);
		
		System.out.println("=====Set (+map과 함께 쓰인다)(순서 존재 하지 않음, 중복값 불가)====");
		Set<String> s1 = new HashSet<String>(); //Set 특정한 값을 저장하는 추상 자료형(순서 존재 하지 않음, 중복값 불가)
		s1.add("oracle");
		s1.add("java");
		s1.add("html");
		// 하나만 꺼내서 볼 수 없다
//		for (int i = 0; i < s1.size(); i++) {
//		}
		//enhanced for를 사용해야 하나씩 출력 가능
		for(String e : s1) {   //index가 없어도 반복문 가능
			System.out.println(e);
			switch (e) {
			case "java":
				
				break;

			default:
				break;
			}
		}
		
		System.out.println("=====Map(key, value) 형태 (key는 Set형태 + String)====");
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("홍길동", 111);
		map1.put("아무개", 222);
		Integer v1 = map1.get("홍길동");
		//Integer v1 = map1.get(map1); 로 호출하면 안됨
		System.out.println(v1); //111
		
		System.out.println(map1); //{홍길동=111, 아무개=222}
		
		map1.put("김철수", 333);
		map1.put("박영희", 444);
		
		Set<String> map1KeySet = map1.keySet();
		for(String key : map1KeySet) {
			System.out.print(key + ":");       //키           //순서가 정해지지 않음
			System.out.println(map1.get(key)); //값
		}
		
		
		
		Map<String, Student> mclassMap = new HashMap<String, Student>();
		Student mSt= new Student();
		mSt.setName("kim");
		mSt.setSubject("math");
		System.out.println(mSt);
		mclassMap.put("학생", mSt);
		System.out.println(mclassMap);
	}
}
