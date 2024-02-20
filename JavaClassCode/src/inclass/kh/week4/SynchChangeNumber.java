package inclass.kh.week4;

public class SynchChangeNumber extends Thread {
	public SharedData sdata;

	public SynchChangeNumber(SharedData sdata) {
		super();
		this.sdata = sdata;
	}

	@Override
	public void run() {
		for (int k = 1; k <= 5; k++) {
			sdata.calcNumber();

			// 해당 스래드가 공유자원 사용이 끝난 상태라면
			if (this.getState() == Thread.State.TERMINATED) {  //TERMINATED 공유 자원 사용이 끝난 상태
				// 다른 스래드한테 신호를 보냄
				// this(Thread) 부모것을 자신것 처럼 쓰는중, super라고 써도는 됨
				// super는 진짜 부모껄 주로 가져다 써야할때 보통 씀
				// 자식에도 똑같은 메소드가 오버라이드 되었을때 구분하기위해 super를 적어주고, 아니라면 굳이 super는 적어주지 않음
				this.notify();
			}
		}
	}
}
