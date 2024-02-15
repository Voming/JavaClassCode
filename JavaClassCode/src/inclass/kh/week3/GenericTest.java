package inclass.kh.week3;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void main(String[] args) {
		// 다양한 타입의 객체들을 다루는 메소드나 클래스 타입을 미리 명시해 줌으로서
		// 형변환을 하는 번거로움 없이 사용하게 해주는 것으로 배열이나 이후 배울 컬랙션 사용 시
		// 데이터 타입의 안정성을 높일 수 있다
		// ovreloading의 한계를 극복함 - 새로운 자료형에 대처하지 못함
		/*List list = new ArrayList();  //이렇게 하면 아무거나 다 들어갈 수있음
		list.add(123);
		list.add("aaa");*/
		
		List<String> list = new ArrayList<String>();  //<> 안에 미리 명시해주면 안정성 높아진다
		list.add("aaa");  //형태에 해당하는 값을 넣는다
		
	}

}
