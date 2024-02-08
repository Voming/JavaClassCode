package inclass.kh.week2;

public class RunAbc {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		System.out.println(a); // inclass.kh.week2.A@48cf768c  //stack과  heap에 저장됨(hash코드로 내부적으로 주소가 저장됨)
//toString//A [num1=0, getClass()=class inclass.kh.week2.A, hashCode()=1221555852, toString()=inclass.kh.week2.A@48cf768c]
		System.out.println(b); // inclass.kh.week2.B@6a6824be
//toString//B [num1=0, str=null, getClass()=class inclass.kh.week2.B, hashCode()=947679291, toString()=inclass.kh.week2.B@387c703b]
		System.out.println(c); // inclass.kh.week2.C@5c8da962
//toString//C [str=null, toString()=A [num1=0, getClass()=class inclass.kh.week2.C, hashCode()=679890578, toString()=inclass.kh.week2.C@28864e92], getClass()=class inclass.kh.week2.C, hashCode()=679890578]
	//                                [ A에있는 내용을 가지고와서 사용을 하고있음]
	
	}
}
