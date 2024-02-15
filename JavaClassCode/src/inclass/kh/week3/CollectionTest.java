package inclass.kh.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
		
		System.out.println(map1.containsKey("김철수")); // 해당하는 키를 가지고있는 게  있는지
		
		
		Map<String, Student> mclassMap = new HashMap<String, Student>();
	
		Student mSt= new Student();
		mSt.setName("kim");
		mSt.setSubject("math");
		System.out.println(mSt);
		mclassMap.put("학생", mSt);
		System.out.println(mclassMap);
		
		
		List<Map<String, Student>> mapList = new ArrayList<Map<String, Student>>();	
		//mapList.add(new HashMap<String, Student>());//이렇게 하면 안됨
		Map<String, Student> mapStu = new HashMap<String, Student>();
		// 가장 내부에 있는 참조형 new
		Student student1 = new Student();
		student1.setName("김철수");
		mapList.add(mapStu);
		Student student12 = new Student();
		student12.setName("aaa");
		mapStu.put("학생1", student1);
		mapStu.put("학생1", student12);
		mapList.add(mapStu);
		System.out.println(mapList);
		
		System.out.println("----------");
		Map<String, List<Student>> map2 = new HashMap<String, List<Student>>();
		List<Student> list2 = new ArrayList<Student>();
		Student instance2 = new Student();
		instance2.setName("홍길동");
		list2.add(instance2);
		Student instance22 = new Student();
		instance22.setName("ttt");
		list2.add(instance22);
		map2.put("학생2", list2);
		System.out.println(map2);
		
		List<Student> list22 = new ArrayList<Student>();
		System.out.println("----------2");
		Student instance23 = new Student();
		instance23.setName("ㅁㅁㅁㅁ");
		list22.add(instance23);
		Student instance24 = new Student();
		instance24.setName("ㄷㄷㄷㄷ");
		list22.add(instance24);
		map2.put("학생3", list22);
		System.out.println(map2);
		
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("lemon");
		fruits.add("potato");
		
		fruits.remove(1);
		
		System.out.println(fruits);
		for(String f : fruits) {
			System.out.println(f);
		}
		
		fruits.set(1, "apple");  //수정
		System.out.println(fruits);
		fruits.add("lemon");
		System.out.println(fruits);
		
		Iterator<String> fIter = fruits.iterator();
		System.out.println(fIter);  // java.util.ArrayList$Itr@3ac42916  
		//$표시는 내부 클래스를 의미함
		while(fIter.hasNext()) {
			String fruit = fIter.next();
			System.out.println(fruit);
		}
		
		
		
		Map<String, String> storeMap = new HashMap<String, String>();
		storeMap.put("b-1", "banana");
		storeMap.put("b-2", "lemon");
		storeMap.put("a-1", "potato");
		storeMap.put("a-2", "banana");
		System.out.println(storeMap);
		
		storeMap.remove("b-2", "lemon");
		System.out.println(storeMap);
		
		Set<String> stKey = storeMap.keySet();
		for(String s : stKey) {
			System.out.println(s + " : " + storeMap.get(s));
		}
		
		storeMap.keySet().iterator();
		
		Set<Entry<String, String>> setEnty = storeMap.entrySet();
		System.out.println(setEnty); //[a-1=potato, b-1=banana, a-2=banana]
	
	}
}
