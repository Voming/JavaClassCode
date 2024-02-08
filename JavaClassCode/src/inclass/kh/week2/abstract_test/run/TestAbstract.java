package inclass.kh.week2.abstract_test.run;

import inclass.kh.week2.abstract_test.Person;
import inclass.kh.week2.abstract_test.Professor;
import inclass.kh.week2.abstract_test.Student;

public class TestAbstract {
	public static void main(String[] args) {
		Student s1 = new Student("자바");
		s1.out();
		Student s2 = new Student("자바", "홍길동");
		s2.out();
		
		Professor p1 = new Professor("컴공");
		p1.out();
		Professor p2 = new Professor("컴공", "김철수");
		p2.out();
		
		Person person = new Person() {  // 해당 클래스에서 이렇게 구현할 수 있지만 다른 클래스에서 다시 사용하려면 또 만들어야함
			@Override
			public void out() {
				System.out.println("추상클래스를 사용하려면 지금처럼 추상적이지 않도록 오버라이드 해줘야함");
			}
//			@Override
//			public void out2() {}
//			@Override
//			public void out3() {}
		};
		
		person.out();
	}
}
