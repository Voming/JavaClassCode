package inclass.kh.week4;

import java.util.Random;

public class AccountManager extends Thread {
	private Account ac;
	private String threadName;

	public AccountManager() {

	}

	public AccountManager(String threadName) {
		super();
		this.threadName = threadName;
	}

	@Override
	public void run() {
		ac = new Account();
		Account.setBalance(1000);

		while (Account.getBalance() > 0) {
			System.out.println("현재 잔액 : " + Account.getBalance());
			// 출금할 돈을 랜덤으로 처리함(백원단위)
			int money = new /*java.util.*/Random().nextInt(10) * 100;
			System.out.println(threadName + "가 출금할 돈 : " + money);
			ac.withDraw(money);
		}
	}
}
