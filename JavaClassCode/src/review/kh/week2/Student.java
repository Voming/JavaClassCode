package review.kh.week2;

public class Student extends Person{
	private String subject;

	public Student() { }

	public Student(String subject) {
		super();
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
}
