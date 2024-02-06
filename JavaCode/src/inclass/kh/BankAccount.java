package inclass.kh;

public class BankAccount {
	private static int amount;
	
	private String no;
	private String password;
	private String owner;
	private String cid;
	private int balance;
	
	/*public BankAccount() {    //기본 생성자 생략 가능
		
	}*/
	
	public BankAccount(String owner, String cid,String password) { //제한이 있는 생성자
		this.owner = owner;
		this.cid = cid;
		this.password = password;
	}
	
	public void deposite(int input) {
		balance += input;
	}
	
	public void redraw(int input) {
		if(balance < input) {
			System.out.println("잔액부족");
			return;   // 먼저 빠저나가게 하고
		}
		balance -= input;   //정상적인 식 실행
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

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
