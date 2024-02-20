package inclass.kh.week2.test;

public class ExamArray {
	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr1.length; i++) {
			if (i < arr1.length - 1) {   //마지막 방을 가르킴
				System.out.print(arr1[i] + ", ");
			} else {
				System.out.print(arr1[i]);  //== 을 사용하여 break도 가능
			}
		}
		System.out.println();
		
		System.out.println("=====중첩 배열=====");
		int[][] arr2 = new int[5][3];
		for(int m = 0; m < arr2.length; m++) {
			for(int n = 0; n < arr2[0].length;n++) {
				arr2[m][n] = (m+1);
			}
		}
		for(int m=0; m<arr2.length; m++) {
			for(int n=0; n<arr2[m].length; n++) {
				System.out.print(arr2[m][n]+"\t");
			}
			System.out.println();
		}

	}
}
