package review.kh;

public class Member {
	private String memberName;
	private final int age; // private final int age; 이렇게 쓰면 생성자에서 오류 뜸 -> new Member()하였을때
	// private final int age; //final 필드는 초기화가 꼭 필요하다 -> 초기값을 주면 해결
	private String email;
	private double score = 80.5;
	private char gender;

	public Member() { // 명시적으로 또는 생성자 안에 초기화 몰아서 함
		this.age = 1000; // 초기화하면 괜찮음
		this.score = 90.2; // 마지막으로 초기화 한 값이 들어간다
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getScore() {
		return this.score;
	}

	public void setName(String name) {
		this.memberName = name;
	}

	public String getName() {
		return this.memberName;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
