package inclass.kh;

public class BankRun {
	public static void method1() {
		System.out.println("그냥 static 클래스 메소드");
	}

	public static void main(String[] args) {
		// 여기 main 첫머리에서 static의 값 확인 가능
		System.out.println(BankAccount.getAmount()); // 함수에도 static이 있어야 사용가능 
		//많이 쓰이고 자주 호출되는 메소드에 static을 붙임

		System.out.println("고객님 반갑습니다.");
		System.out.println("성함과 주민번호를 주시면 계좌를 개설해 드릴게요.");

		// 같은 패키지 내부라 앞에 import를 하지 않아도 된다.
		BankAccount yi = new BankAccount("yi", "11111", "2323"); // 인스턴스 : 자료형이 참조형, new로 생성해서 씀
		BankAccount jw = new BankAccount("jw", "22222", "1234"); // 본인만의 heap공간이 있음
		BankAccount cw = new BankAccount("cw", "33333", "5555");
		/*
		 * BankAccount af = new BankAccount("cw","33333","5555"); 
		 * BankAccount sd = new BankAccount("cw","33333","5555"); 
		 * BankAccount qe = new BankAccount("cw","33333","5555");
		 */

		jw.deposite(1000);
		yi.deposite(50000);

		System.out.println(jw.getBalance());
		System.out.println(cw.getBalance());

		BankAccount.setAmount(1); // 실습 jw.setAmount(1);
		System.out.println(BankAccount.getAmount());
		/*System.out.println(jw.getAmount()); // 모두 1이나옴
		System.out.println(cw.getAmount()); // 1
		System.out.println(yi.getAmount()); // 1*/

		BankAccount.setAmount(100);
		System.out.println(BankAccount.getAmount());
		/*System.out.println(jw.getAmount()); // 모두 100이나옴
		System.out.println(cw.getAmount()); // 100
		System.out.println(yi.getAmount()); // 100*/
	}
}
