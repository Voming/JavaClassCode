package inclass.kh.week4;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();

		// 한개 팔면 한개 사가는 프로세스
		Producer p = new Producer(buffer);
		//Consumer c = new Consumer(buffer); 이렇게 쓰면 start사용 불가
		Thread tc = new Thread(new Consumer(buffer));
		
		p.start();
		tc.start();
	}
}
