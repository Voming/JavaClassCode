package inclass.kh.week2;

public class Child extends Parent {
	
	public Child(){
		this(10);
	}
	
	public Child(int a){
		super();
		setNum(a);
	}
	
	
	public void out() {
		System.out.println("자식 클래스 매소드");
	}
	
	@Override
	public void display() {
		System.out.println("안녕하세요. 인사드립니다.");
		super.display();
	}

}
