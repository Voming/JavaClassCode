package inclass.kh.week4;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();

		// 한개 팔면 한개 사가는 프로세스
		Producer p = new Producer(buffer);
		//Consumer c = new Consumer(buffer); 이렇게 쓰면 start사용 불가
		Thread tc = new Thread(new Consumer(buffer));
		
		//Thread tcb = new Thread(new Consumer(new Buffer()));  
		//이렇게 사용하면 안됨 둘이 다른 Buffer를 보기때문
		
		p.start();
		tc.start();
	}
}
