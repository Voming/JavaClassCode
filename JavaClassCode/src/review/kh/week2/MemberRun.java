package review.kh.week2;

public class MemberRun {

	public static void main(String[] args) {
		Member m1 = new Member();

		System.out.println("int Sum진행");
		System.out.println(m1.sum(1, 5));
		System.out.println("float Sum진행");
		System.out.println(m1.sum(2.0f, 8.0f));
		
		//long result = m1.sum(4, 6); //권장하지 않음
	}
}
