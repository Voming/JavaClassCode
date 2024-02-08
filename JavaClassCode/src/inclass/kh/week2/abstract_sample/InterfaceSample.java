package inclass.kh.week2.abstract_sample;

import inclass.kh.week2.Child;

public interface InterfaceSample {
	//abstract 를 넣지 않고 그냥 선언해줘도 됨
	public final int MAX_COUNT = 10;
	
	//public 을 생략해도 public 이라고 생각함
	public abstract void method1(Child c);  
	public void method2();
	void method3();
	void method4();
	
	//메소드 이름은 동사를 앞에 쓰고 명사를 뒤에 씀
	//outline 창을 보면 뭐가있는지 볼 수 있음
	public String testSum();
	public String sumTest();
}
