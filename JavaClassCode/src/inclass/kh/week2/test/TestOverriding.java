package inclass.kh.week2.test;

import inclass.kh.week2.Child;
import inclass.kh.week2.Parent;

public class TestOverriding {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		
		p.display();      //"부모클래스 메소드"
		System.out.println();
		c.display();      //"안녕하세요. 인사드립니다.부모클래스 메소드"
		System.out.println();
		c.out();          //"자식 클래스 매소드"
		System.out.println();
		pc.display();     //"안녕하세요. 인사드립니다.부모클래스 메소드"
		//pc.out(); 불가능
	}
}
