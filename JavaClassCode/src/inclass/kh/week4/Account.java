package inclass.kh.week4;

public class Account {
	private static int balance;

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		Account.balance = balance;
	}

	//synchronized를 특적 블록, 메소드 전체에 줄수 있는데 범위가 커질 수록 묶여서 실행 되는게 보임
	public /* synchronized */ void withDraw(int money) {  //withDraw가 sleep하는 동안 money의 값이 바뀔 수 있음
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) { // this 자체가 new Account()를 한 객체이다, this가 아니라면 sync하고 싶은 객체
			//진입한 순서로 실행된다고 보장 되지 않음
			if (balance >= money) {
				System.out.println("==출금 : " + money);
				balance -= money;
			}
			else{
				System.out.println("==잔액부족");
			}
		}
	}
}
