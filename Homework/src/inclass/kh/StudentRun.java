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
				//ej.name = inputName;
				//ej.exam(ej.name);
				
				System.out.println("이름을 입력하세요 : ");
				inputName = sc.nextLine();
				System.out.println("아이디를 입력하세요 : ");
				inputId = sc.nextLine();
				
				Student jw = new Student();
				jw.setName(inputName);
				jw.setId(inputId);
				jw.id = inputId; // proteccted는 같은 패키지여서 괜찮다
				
				String inputStr = sc.nextLine(); // String은 ==을 사용하면 안됨
				if(inputStr.equals("퇴근")) {     // Stirng 비교는 equals()사용
					break; 
				}
			}
		}
	}
}
