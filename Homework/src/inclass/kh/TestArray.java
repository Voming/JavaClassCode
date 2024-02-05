package inclass.kh;

public class TestArray {

	public static void main(String[] args) {	
		//배열 Array
		String[] arrSeason = {"봄", "여름","가을","겨울"};   //0부터 시작
		
		System.out.println(arrSeason[0]);   //봄
		System.out.println(arrSeason[1]);   //여름
		System.out.println(arrSeason[3]);   //가을
		System.out.println(arrSeason[4]);   //겨울
		
		arrSeason[1] = "초여름";
	}

}
