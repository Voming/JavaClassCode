package inclass.kh.week2;

public class Child extends Parent {
	private int num = 2;
	
	public Child(){
		this(10);
	}
	
	public Child(int a){
		super();
		setNum(a);  //부모의 함수 -> super.num으로 들어감
	}
	
	
	public void out() {
		System.out.println("자식 클래스 매소드");
	}
	
	@Override
	public void display() {
		System.out.println("안녕하세요. 인사드립니다.");
		System.out.println("num : " + num);
		System.out.println("super.num : " + super.num);
		super.display();
	}

}
