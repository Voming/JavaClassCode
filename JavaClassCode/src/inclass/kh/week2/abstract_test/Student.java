package inclass.kh.week2.abstract_test;

public class Student extends Person {
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
		return "Student [subject=" + subject + "]";
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
	@Override
	public void out() {
		System.out.println("저는 " + getName() + " 학생입니다.");
		System.out.println(subject + " 수강하고 있습니다.");
	}
	
	// 오버로딩
	public void out(int a) {   // abstract 함수에서 매개변수가 있는 다른 함수를 만들고 싶다면 기본형태의 메소드를 미리 만들어둬야함
		System.out.println("저는 " + getName() + " 학생입니다.");
		System.out.println(subject + " 수강하고 있습니다.");
	}
}
