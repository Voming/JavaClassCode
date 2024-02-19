package inclass.kh.week4;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("Main Thread 시작");
		
		//새 일꾼 만들기
		//Thread를 extends로 상속 받아서 바로 start 로 사용 가능
		ThreadA ta = new ThreadA();  //독립적인 일X, ta.method1() X (main 일꾼이 하는 일)
		ta.start();  //일꾼 ta가 run 부분을 독립적으로 실행함
		//ta.run(); 스레드 동작이 아님, 사용하지 않기 
		ta.setPriority(10);
		
		Thread tb = new Thread(new ThreadB());   //Runnable을 implements로 상속 받았기 때문
		tb.start();   //start -> run 실행
		tb.setPriority(1);   //번호가 커야 우선 순위 높음(1~10, 5가 중간)
		
		/* 결과
		Main Thread 시작
		여기 ThreadA가 독립적으로 하는 일
		2 * 1 = 2
		2 * 2 = 4
		여기 ThreadB가 독립적으로 하는 일
		Main Thread 종료
		*****2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18
		****-----
		**/
		
		System.out.println("Main Thread 종료");
	}
}
