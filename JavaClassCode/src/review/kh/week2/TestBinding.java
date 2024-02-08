package review.kh.week2;

import inclass.kh.week2.Child;
import inclass.kh.week2.Parent;

public class TestBinding {
	public static void main(String[] args) {
		//Binding (동적 바인딩, 정적 바인딩)
		//컴파일 시에는 정적 바인딩
		//실행 시에는 동적 바인딩
		
		Parent p = new Parent();
		p.display();

		Parent bind = new Child();
		bind.display();  //컴파일 시에는 parent의 display를 가리키지만 실행시에는 Child를 가리킴
		//bind.out();    //out 접근불가 (컴파일이 먼저되기 때문에 child의 out을 먼저 부르지 못함)
		
		
		Child c = new Child();
		
	}
}
