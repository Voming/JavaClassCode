package inclass.kh.week2.abstract_test;

import java.util.HashMap;
import java.util.Map;

import inclass.kh.week2.Child;
import inclass.kh.week2.abstract_sample.InterfaceSample;

public class Student extends Person implements InterfaceSample {
	private String subject;

	public Student() {
	}

	public Student(String subject) {
		super();
		this.subject = subject;
	}

	public Student(String subject, String name) {
		super(name);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "(Student 이름: "+ getName() + " 과목: " + subject + ")";
	}

	// 보통 getter, setter 는 맨 아래에 적음
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// override 개념이 맞지만 재정의를 하는 것이 아닌
	// 애초에 정의한 적이 없는 것을 정의하는 것이기 때문에 기호가 다르다
	// override 할때는 아무것도 없는 상태가 아니다 => public 오로 설정하는 걸로 생각해줘도 됨
	@Override
	public void out() {
		System.out.println("저는 " + getName() + " 학생입니다.");
		System.out.println(subject + " 수강하고 있습니다.");
	}

	// 오버로딩
	public void out(int a) { // abstract 함수에서 매개변수가 있는 다른 함수를 만들고 싶다면 기본형태의 메소드를 미리 만들어둬야함
		System.out.println("저는 " + getName() + " 학생입니다.");
		System.out.println(subject + " 수강하고 있습니다.");
	}

	// 인터페이스에 있는 내용 재정의
	@Override
	public void method1(Child c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub

	}

	@Override
	public String testSum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sumTest() {
		// TODO Auto-generated method stub
		return null;
	}
}
