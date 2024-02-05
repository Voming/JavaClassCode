package inclass.kh;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				String inputStr = sc.nextLine(); // String은 ==을 사용하면 안됨
				if(inputStr.equals("퇴근")) {     // Stirng 비교는 equals()사용
					break; 
				}
				System.out.println("이름을 입력하세요 : ");
				String inputName = sc.nextLine();
				System.out.println("아이디를 입력하세요 : ");
				String inputId= sc.nextLine();
				
				Student ej = new Student();
				ej.name = inputName;
				ej.id = inputId;
				
				Student jw = new Student();
				jw.name = inputName;
				jw.id = inputId;
			}
		}
	}
}
