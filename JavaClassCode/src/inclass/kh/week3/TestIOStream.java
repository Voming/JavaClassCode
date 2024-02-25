package inclass.kh.week3;

import java.io.File;
import java.io.IOException;

public class TestIOStream {
	public static void main(String[] args) {
		//파일 생성
		File f1 = new File("./test/test.txt");  
		//윈도우의 경로 자체는 D:\\file\\f2이런 형태로 되어있음
		if(!f1.exists()) {  //존재하지 않는다면 만들기
			//우리가 아는 test.txt 폴더 만들기
			f1.mkdirs(); //없는 디렉토리 다 만들기
		}
		File f2 = new File("./test/test.txt/test2.txt"); 
		try {
			f2.createNewFile();  //파일 만들기
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
