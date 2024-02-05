package inclass.kh;

import java.util.Scanner;

public class StudentRun {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("이름을 입력하세요 : ");
				String inputName = sc.nextLine();
				System.out.println("아이디를 입력하세요 : ");
				String inputId = sc.nextLine();
				
				Student ej = new Student();
				ej.setName(inputName);
				ej.setId(inputId);
				System.out.println(ej.getName());
				System.out.println(ej.getId());
				ej.id = inputId; // proteccted는 같은 패키지여서 괜찮다
				//ej.name = inputName;  privat으로 생성하여 여기서 접근 불가
				//ej.exam(ej.name);
			
				
				//while문 나가기
				String inputStr = sc.nextLine(); // String은 ==을 사용하면 안됨
				if(inputStr.equals("퇴근")) {     // Stirng 비교는 equals()사용
					break; 
				}
			}
		}
	}
}
