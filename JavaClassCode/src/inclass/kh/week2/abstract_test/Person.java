package inclass.kh.week2.abstract_test;

public abstract class Person { 
	// 미완성 부분이 있기 때문에 해당 클래스로는 new 를 할 수 없음
	// 한개 이상의 abstract 메소드가 있어야함(없어도 불가능 한 것은 아님)
	private String name;

	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 자식 클래스에서 구현할 메소드를 미리 선언해줌
	public abstract void out();
//	public abstract void out2();
//	public abstract void out3();
}
