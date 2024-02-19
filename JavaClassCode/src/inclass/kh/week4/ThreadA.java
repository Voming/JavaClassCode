package inclass.kh.week4;

public class ThreadA extends Thread /* 일꾼 같은 모양의 클래스 */ {

	public void method1() { // 메인에서 호출할 수 있는 메소드
		System.out.println("ThreadA - method1()");
	}

	@Override
	public void run() {   
		System.out.println("여기 ThreadA가 독립적으로 하는 일");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \n", i , j , (i * j));
				try {   //InterruptedExceptio가 발생하기 쉽기때문에 예외처리 해줌
					Thread.sleep(10);   //밀리세컨드로 지연시킴
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				
			}
			System.out.println("-----");
		}
		
		//이외의 여러가지 일 가능
	}

}
