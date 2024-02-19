package inclass.kh.week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) throws FileNotFoundException {
		method1();
	}

	public static void method1() throws FileNotFoundException {
		// try catch 대신 throws로 처리함
		// 해당 메소드를 쓰는 모든 곳에서 똑같이 throws를 선언해줘야함
		BufferedReader br = new BufferedReader(new FileReader(new File("")));
		System.out.println("파일이 없습니다.");
	}

	public void method() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:/data/text.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) // null일수도 있어서 null아닐때만 하도록
					br.close(); // close실행할때도 예외가 발생 할 수 있기때문에 try catch로 묶어줌
			} catch (IOException e) {
			}
		}

	}

	public void name() {
		try (BufferedReader br = new BufferedReader(new FileReader("C:/data/text.txt"))) {
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
