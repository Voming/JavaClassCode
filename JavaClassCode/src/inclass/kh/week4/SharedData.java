package inclass.kh.week4;

public class SharedData {
	private int number = 12;
	private volatile boolean inChanged; // volatile(키워드 예약어) - 휘발성 
	// nv(non-volatile) - 비휘발성
	// 최적화(비휘발성) : 메모리에 기록된 값을 계속 가져다 사용하는것
	
	public SharedData() {
		
	}

	//동기화 처리된 메소드
	public synchronized void calcNumber() {
		number *= 3;
		System.out.println("changed..." + number);
	}

	public synchronized void printNumber() {
		System.out.println("number : " + number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isInChanged() {  //boolean일때는 get이 아니라 is시리즈
		return inChanged;
	}

	public void setInChanged(boolean inChanged) {
		this.inChanged = inChanged;
	}

}
