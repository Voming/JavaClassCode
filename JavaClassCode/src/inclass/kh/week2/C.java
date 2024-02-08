package inclass.kh.week2;

public class C extends A{
//	private int num1;
//	public void method1(){
//		System.out.println("method1");
//	}
	
	private String str;
	public void method2(){
		System.out.println("method2");
	}
	@Override
	public String toString() {
		return "C [str=" + str + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	// => A에 있는것을 포함해서 만들 수 있다
	
	
	
}
