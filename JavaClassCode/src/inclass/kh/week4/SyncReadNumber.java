package inclass.kh.week4;

public class SyncReadNumber extends Thread{
	public SharedData sdata;

	public SyncReadNumber(SharedData sdata) {
		super();
		this.sdata = sdata;
	}
	
	@Override
	public void run() {
		for (int n = 1; n <= 5; n++) {
			try {
				// 다른 스래드의 동기화 사용이 끝나기를 기다리는 상태이면
				if (this.getState() == Thread.State.BLOCKED) {
					// 다른 스래드가 신호를 보낼 때까지 기다려라.
					this.wait();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			sdata.printNumber();
		}

	}
}
