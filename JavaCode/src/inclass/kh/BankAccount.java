package inclass.kh;

public class BankAccount {
	private String no;
	private String password;
	private String owner;
	private String cid;
	private int balance;
	
	public BankAccount() {
		
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
