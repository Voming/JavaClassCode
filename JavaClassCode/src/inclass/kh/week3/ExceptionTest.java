package inclass.kh.week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ExceptionTest {
	public static void main(String[] args) {
		// Unhandled exception type FileNotFoundException
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			System.out.println("실행 완료");
		}
	}

	
}
