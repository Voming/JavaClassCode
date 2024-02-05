package inclass.kh;

public class TestArray {

	public static void main(String[] args) {   //args[0] = 0 가능은함	
		//배열 Array : 같은 자료형으로 여러개의 변수를 선언하고 사용할 때 사용함
		//			  + 같은 유형의 값을 넣어 관리
		// *** 즁요 *** 배열의 크기를 할당 받아 사용할 수 있음
		//배열 선언 + 배열 할당 + 배열 사용(읽기, 쓰기)
		
		//선언 방법
		String[] arrSeason = {"봄", "여름","가을","겨울"};   //0부터 시작
		//String arrSeason2[] = {"봄", "여름","가을","겨울"};  // []위치 둘 다 가능
		
		String arr[]; //이때 방의 크기는 0이다(선언이 실제로는 되지 않은 상태) -> 선언
		arr = new String[3]; // new 자료형[할당받을 크기]로 할당 해주어야함 -> 할당
		//arr 크기는 3, 인덱스는 0~2 
		arr[0] = "0번 방 값";
		arr[1] = "1번 방 값";
		arr[2] = "2번 방 값";
		//ArrayIndexOutOfBoundsExcetion //arr[3] = ""
		
		System.out.println(arrSeason[0]);   //봄
		System.out.println(arrSeason[1]);   //여름
		System.out.println(arrSeason[2]);   //가을
		System.out.println(arrSeason[3]);   //겨울
		
		System.out.println("====배열을 반복문으로====");
		for(int i =0; i<arr.length; i++) {     //arr의 자료형은 String 배열이고, .length로 배열의 크기를 알 수 있다
			System.out.println(arr[i]);
		}
		
		arrSeason[1] = "초여름";
		
		int[] arr1 = new int[] {10, 20, 30, 40};
		int[] arr2 = new int[] {1,2,3,4,5,6};
		
		System.out.println("====원본====");
		for(int i =0; i<arr1.length; i++) {  
			System.out.println(arr1[i]);
		}
		System.out.println("====복사====");
		for(int i =0; i<arr2.length; i++) {  
			System.out.println(arr2[i]);
		}
		
		//복사 방법2
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);   //arr2에서 복사설정하지 않은 부분은 arr2그대로 유지됨
		
		System.out.println("====원본====");
		for(int i =0; i<arr1.length; i++) {  
			System.out.println(arr1[i]);
		}
		System.out.println("====복사====");
		for(int i =0; i<arr2.length; i++) {  
			System.out.println(arr2[i]);
		}
		
		
		/*int v1 = 100;
		double v2  = 5.3;
		String v3 = "자료형에 따른 접근 가능 메소드";
		int[] v4 = new int[]{10,20};
		String[] v5 = new String[]{"기호", "주의"};
		char v6 = '한';*/
		int arr_1[][] = new int[2][3];

		for (int i = 0; i < arr_1.length; i++) {
			for (int j = 0; j < arr_1[0].length; j++) {
				arr_1[i][j] = 10;
			}
		}
		
		/*2차원 배열*/ 
		//정변 배열
		int[][] array20 = {{1,2,3,4} , {5,6,7,8}};  //[2][4]
		//가변 배열
		int[][] array21 = {{1,2,3,4} , {5,6,7}};  //[2][4] (가로 세로가 딱 떨어지게 정변 배열이 만들어짐)
		//array21[1][3] = 8; 불가능
		
		//가변 배열
		int[][] arr30 = new int [3][];
		arr30[0] = new int [3];   // = new int[] {1,2,3} 형식과 동일
		arr30[1] = new int [2];
		arr30[2] = new int [5];   //new int가 빠지면 안됨!!!
		
		System.out.println(array20.length); // 행크기, m
		System.out.println(array20[0].length); // 행[0]의 열크기, n
		System.out.println(array20[1].length); // 행[1]의 열크기, o
		
		System.out.println("====2차원 가변 배열====");
		for(int m = 0; m < array20.length; m++) {
			for(int n = 0; n < array20[0].length; n++) {
				System.out.println(array20[m][n]); 
			}
		}
		
		
	}
	
}
