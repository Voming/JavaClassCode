package inclass.kh.week4;

public class ThreadB implements Runnable {

	@Override
	public void run() {  
		System.out.println("여기 ThreadB가 독립적으로 하는 일");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print("*");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
			System.out.println();
			System.out.println("-----");
		}
		
	}
	
}
