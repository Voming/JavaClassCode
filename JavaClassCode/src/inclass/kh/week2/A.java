package inclass.kh.week2;

public class A extends Object{   //내 자식이 누구인지 알 수 없음
	private int num1;
	
	void method1(){
		System.out.println("method1");
	}
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
