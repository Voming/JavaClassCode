package inclass.kh.week2;

public class Parent {
	protected int num = 1;
	
	
	public Parent(){
		super();
	}
	
	
	public void display() {
		System.out.println("부모클래스 메소드");
	}


	protected int getNum() {
		return num;
	}


	protected void setNum(int num) {
		this.num = num;
	}
}
