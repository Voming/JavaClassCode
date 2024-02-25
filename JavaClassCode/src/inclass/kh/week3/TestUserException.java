package inclass.kh.week3;

import java.util.Scanner;

public class TestUserException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		CheckEven instance1 = new CheckEven();
		try {
			int result = instance1.printEven(input);
			System.out.println(result);
		} catch (EvenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
