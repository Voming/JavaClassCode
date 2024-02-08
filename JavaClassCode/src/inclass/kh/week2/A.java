package inclass.kh.week2;

public class A {
	private int num1;
	public void method1(){
		System.out.println("method1");
	}
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
