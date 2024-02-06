package inclass.kh;

public class BankRun {
	public static void main(String[] args) {
		String no;
		String password;
		String owner;
		String cid;
		int balance;

		System.out.println("고객님 반갑습니다.");
		System.out.println("성함과 주민번호를 주시면 계좌를 개설해 드릴게요.");
		
		BankAccount yi = new BankAccount("yi","11111","2323");
		BankAccount jw = new BankAccount("jw","22222","1234");
		BankAccount cw = new BankAccount("cw","33333","5555");
		
		jw.deposite(1000);
		yi.deposite(50000);
		
		System.out.println(jw.getBalance());
		System.out.println(cw.getBalance());
		
		jw.setAmount(1);    //== BankAccount.setAmount(1);
		System.out.println(jw.getAmount());   //모두 1이나옴
		System.out.println(cw.getAmount());   //1
		System.out.println(yi.getAmount());   //1
		
		yi.setAmount(100);
		System.out.println(jw.getAmount());   //모두 100이나옴
		System.out.println(cw.getAmount());   //100
		System.out.println(yi.getAmount());   //100
	}
}
