package review.kh;

public class ExamIf {
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
		
	
		//중첩 삼항 연산자
		score = 90;
		grade = score >= 90 ? "우수": (grade = score >= 60 ? "통과": "재평가");
		System.out.println(grade);
		
		int a = 10;
		int b = 20;
		int result1 = a>b ? a++: b--;
		
		//삼항 연산자 -> if else문
		int result2 = a<b ? a++: (b==0? a--: b++);
		
		System.out.println(result1 + "\t" + result2);
		
		a = 10;
		b = 20;
		int result3 = 0;
		if(a<b) {
			result3 = a++;
		}else if(b == 0) {
			result3 = a--;
		}else {
			result3 = b++;
		}
		System.out.println(result3);
		
		//비트 연산자
		int data = 10;
		System.out.println(~data); //1의 보수
		System.out.println(~data + 1); //0의 보수
		
		System.out.println(1 <<1); //1의 2배
		System.out.println(1 <<2); //1의 4배
		System.out.println(1 <<3); //1의 8배
		System.out.println(1 <<4); //1의 16배
		
		System.out.println(16 >>1); // 1/2
		System.out.println(16 >>2); // 1/4
		System.out.println(16 >>3); // 1/8
		System.out.println(16 >>4); // 1/16
		
		System.out.println(-16 >>1); // 1/2 부호 비트까지 Shift함
		System.out.println(-16 >>2); // 1/4
		System.out.println(-16 >>3); // 1/8
		System.out.println(-16 >>4); // 1/16
		
		
	}
}
