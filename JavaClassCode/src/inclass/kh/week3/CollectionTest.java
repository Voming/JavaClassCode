package inclass.kh.week3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
	}
}
