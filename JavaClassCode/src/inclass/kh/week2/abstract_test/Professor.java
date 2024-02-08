package inclass.kh.week2.abstract_test;

public class Professor extends Person {
	private String major;

	public Professor() {
	}

	public Professor(String major) {
		super();
		this.major = major;
	}

	public Professor(String name, String major) {
		super(name);
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
	
	@Override
	public void out() {
		System.out.println("저는 " + getName() + " 교수입니다.");
		System.out.println(major + " 전공하고 있습니다.");
	}

}
