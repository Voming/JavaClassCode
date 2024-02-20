package inclass.kh.week4;

public class TestSynchronized {
	public static void main(String[] args) {
		//첫번째 예시
//		Thread t1 = new AccountManager("ATM");
//		Thread t2 = new AccountManager("인터넷 뱅킹");
//		Thread t3 = new AccountManager("모바일 앱");
//
//		t1.start();
//		t2.start();
//		t3.start();
		
		//두번째 예시
		SharedData shareObj = new SharedData();
		
		SynchChangeNumber t1 = new SynchChangeNumber(shareObj);  // 같은 주소값을 가진 shareObj를 공유함
		SyncReadNumber t2 = new SyncReadNumber(shareObj);
		
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		System.out.println(t1.getState());
	}
}
