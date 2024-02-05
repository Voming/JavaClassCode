package inclass.kh;

//클래스 실습
public class Student {
	// private 클래스 내부에서만 사용
	private String id;
	private String name;
	private String phone;
	private int age;
	//접근제한자를 적지 않았다면 default
	
	// Getter / Setter 게터, 세터
	//오른쪽 마우스 -> Source -> Generate getter...
	void exam(String name) {
		System.out.println( name + "님 시험을 진행합니다.");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void enterance() {
		System.out.println("입실했습니다.");
	}
}
