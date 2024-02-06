package inclass.kh;

public class BankAccount {
	private/* public 쓰는경우도 있음 */ static int amount = 5; // 클래스 변수

	private String no; // 멤버 변수
	private String password;
	private String owner;
	private String cid;
	private int balance;

	/* 기본 생성자 생략 가능 
	 * public BankAccount() { }
	 */

	public BankAccount(String owner, String cid, String password, String no) { // 제한이 있는 생성자
		this.owner = owner;
		this.cid = cid;
		this.password = password;
		if (BankAccount.amount == 0) {
			System.out.println("더이상 계좌 개설이 불가능합니다. 다음기회에 이용해주세요");
			return;
		}
		BankAccount.amount--; // 접근할 때 this 말고 클래스 명을 사용 권장
		this.no = no;
	} // 제힌이 있는 생성자

	// 생성자 오버로딩
	public BankAccount(String no, String password, String owner, String cid, int balance) {
		/* 중복된 코드가 있는경우 
		 * if (BankAccount.amount == 0) {
		 * System.out.println("더이상 계좌 개설이 불가능합니다. 다음기회에 이용해주세요"); return; }
		 */
		// 생성자 this는 첫번째 줄에서만 사용가능 -> 위에 있는 생성자 불러옴(위치 상관X)
		this(owner, cid, password, String.valueOf(Math.random()).substring(2)); // 괄호 위치 주의
		// System.out.println(Math.random());
		/*
		 * 위의 String.valueOf(Math.random())와 동일 double randomNo = Math.random(); String
		 * randStr = String.valueOf(randomNo); this.no = String.valueOf(randomNo);
		 */
		this.balance = balance;
	}

	public void deposite(int input) {
		balance += input;
	}

	public void redraw(int input) {
		if (balance < input) {
			System.out.println("잔액부족");
			return; // 먼저 빠저나가게 하고
		}
		balance -= input; // 정상적인 식 실행
	}

	// 많이 쓰이고 자주 호출되는 메소드에 static을 붙임
	public static int getAmount() {
		return BankAccount.amount;
	}

	public static void setAmount(int amount) { // 생성이 되는 시점에만 설정하게 함부로 접근하지 못하게 함
		BankAccount.amount = amount;
	}

	/*
	 * private void setAmount(int amount) { //생성이 되는 시점에만 설정하게 함부로 접근하지 못하게 함
	 * BankAccount.amount = amount; }
	 */

	public String getNo() {
		return no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOwner() {
		return owner;
	}

	public String getCid() {
		return cid;
	}

	public int getBalance() {
		return balance;
	}
}
