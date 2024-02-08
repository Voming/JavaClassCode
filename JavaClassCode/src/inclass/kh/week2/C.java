package inclass.kh.week2;

public class C extends A{   //extends는 1개만 가능 여러개를 받으려면 확장 implements라는 개념이 있음
//	private int num1;    //super로 사용
//	public void method1(){
//		System.out.println("method1");
//	}
	
	private String str;    //this로 사용
	public void method2(){
		System.out.println("method2");
	}
	@Override   //덮어 셨다는 의미(super인 Object에 이미 저장되어잇음)
	public String toString() {
		return "C [str=" + str + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	// => A에 있는것을 포함해서 만들 수 있다
	
	//eclipse 가 자동으로 오버라이딩 캐치함
//	public void method1(int t)/*오버로딩 하면 새롭게 생성되는 것  접근제한자는 부모와 같거나 넓을 수 있음*/ {
//		
//	}
	@Override  //다음에 오는 문장에 영향을 줌
	public void method1() {  //같은 패키지 안이라면 private제외하고 오버라이딩 할 수 있음
		//예외처리느 부모의 것보다 좁은 범위로 가능
	}
	
//	void method1(){   //아예 부모와 똑같이 생겼다면 오류 발생
//		System.out.println("method1");
//	}
}
