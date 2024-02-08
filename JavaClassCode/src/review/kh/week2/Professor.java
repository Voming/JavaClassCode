package review.kh.week2;

public class Professor extends Person{
	private String major;

	public Professor() {
	}

	public Professor(String major) {
		super();
		this.major = major;
	}

	@Override
	public String toString() {
		return "Professor [major=" + major + "]";
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
