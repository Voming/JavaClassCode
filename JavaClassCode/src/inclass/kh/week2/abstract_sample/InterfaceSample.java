package inclass.kh.week2.abstract_sample;

import inclass.kh.week2.Child;

public interface InterfaceSample {
	//abstract를 넣지 않고 그냥 선언해줘도 됨
	public final int MAX_COUNT = 10;
	
	public void method1(Child c);  
	public void method2();
	public void method3();
	public void method4();
}
