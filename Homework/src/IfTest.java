
public class IfTest {
	public static void main(String args[]) {
		int score = 80;
		String grade = "";
		
		if(score >= 60) {
			grade = "통과";
		}else {
			grade = "재평가";
		}
		
		//삼항 연산자 적용
		grade = score >= 60 ? "통과": "재평가";
		
		System.out.println(grade);
	}
}
