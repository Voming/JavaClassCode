package inclass.kh.week2.test;

import inclass.kh.week2.Child;
import inclass.kh.week2.Parent;

public class TestBinding {
	public static void main(String[] args) {
		//Binding (동적 바인딩, 정적 바인딩)
		//컴파일 시에는 정적 바인딩
		//실행 시에는 동적 바인딩
		
		Parent p = new Parent();
		p.display();
		
		System.out.println("\n=====정적/동적 바인딩=====");
		System.out.println("===업캐스팅===");
		Parent bind = new Child();  //선언 부분 꼭 확인
		bind.display();  //컴파일 시에는 parent의 display를 가리키지만 실행시에는 Child를 가리킴
		//bind.out();    //out 접근불가 (컴파일이 먼저되기 때문에 child의 out을 먼저 부르지 못함)
		//=> 디버깅하기 힘들 수 있음
		//다형성이 들어가지 않았다면 정적, 동적의 차이가 없다.

		System.out.println("\n===다운 캐스팅===");
		((Child)bind).out();   //모두 자식 클래스 메소드
		((Child)bind).display();
	}
}
