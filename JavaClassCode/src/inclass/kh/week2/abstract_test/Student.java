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

	// 보통 getter, setter는 맨 아래에 적음
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void out() {
		System.out.println("저는 " + getName() + " 학생입니다.");
		System.out.println(subject + " 수강하고 있습니다.");
	}
}
