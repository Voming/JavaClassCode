package inclass.kh.week3;

import inclass.kh.week2.abstract_test.Student;

public class GenericEx<T> /*4개까지 가능함*/{
	private T a1;
	

	public T getA1() {
		return a1;
	}

	public void setA1(T a1) {
		this.a1 = a1;
	}
	
	public <K> K methodGenric(K a1) {
		return a1;                                                                                                                                                                                                                                                                                                                             
	}
	

	public <S> S  methodGenric(Object[]  a2, int index) {
		return (S)a2[index];                                                                                                                                                                                                                                                                                                                             
	}
	
	public static void main(String[] args) {
		GenericEx<String>  ex1 = new GenericEx<String>();
		ex1.setA1("ex=====");
		
		GenericEx<Integer>  ex2 = new GenericEx<Integer>();
		ex2.setA1(123);
		
		ex1.methodGenric("aaa");
		ex1.methodGenric(123);
		Student r3 = ex1.methodGenric(new Student());
		Integer obj = ex1.methodGenric(new Integer[] {1,2,3,4}, 1);
	}

	
	
}
