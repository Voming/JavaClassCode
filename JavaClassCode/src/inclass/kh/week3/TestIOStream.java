package inclass.kh.week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIOStream {
	public static void main(String[] args) {
		// 파일 생성
		File f1 = new File("./test/test.txt");
		// 윈도우의 경로 자체는 D:\\file\\f2이런 형태로 되어있음
		if (!f1.exists()) { // 존재하지 않는다면 만들기
			// 우리가 아는 test.txt 폴더 만들기
			f1.mkdirs(); // 없는 디렉토리 다 만들기
		}
		File f2 = new File("./test/test.txt/test2.txt");
		try {
			f2.createNewFile(); // 파일 만들기
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 현재 디렉토리에 파일 생성시에는 mkdir용 file 생성 없어도 됨
		File f3 = new File("test3.txt");
		try {
			f3.createNewFile(); // 파일 만들기
		} catch (IOException e) {
			e.printStackTrace();
		}

		//
		// String[] fileArr = f1.list(); // 들어가는 것이 디렉토리 객체여야한다.
		String[] fileArr = new File("./").list();
		if (fileArr != null) {
			for (String filename : fileArr) {
				System.out.println(filename);
			}
		}

		File f5 = new File("./src/a.txt");
		System.out.println(f5.length()); // 46 바이트로 크기가 나옴

		// 파일 객체에 쓰기(출력 스트림)
		// BufferedReader br = new BufferedReader(new FileReader(new File("")));
		FileWriter fw = null;
		FileWriter fw2 = null;
		try {
			fw = new FileWriter(f3);
			fw.write("aaa"); // 덮어쓰기
			fw.flush();

			fw2 = new FileWriter(f5, true); // 이어쓰기
			fw2.write("bbb");
			fw2.flush(); // 버퍼를 비우는 기능 포함

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (fw2 != null)
					fw2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("=========파일 탐색기로 확인해주세요");
		
		
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
//			fr = new FileReader(f5);
//			char[] readData = new char[1000];
//			System.out.println(readData.length);  //1000
//			int length = fr.read(readData);
//			System.out.println(length);   //12
//			String readStr = String.valueOf(readData); //문자열으로 변환
//			System.out.println(readStr);
			
			
			//보조스트림 추가
			fr = new FileReader(f5);
			br = new BufferedReader(fr);
			String s = null;
			while(( s = br.readLine()) != null) {
				System.out.println(s);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
