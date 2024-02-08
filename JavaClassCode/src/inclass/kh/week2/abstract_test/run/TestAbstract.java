package inclass.kh.week2.abstract_test.run;

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
	}
}
