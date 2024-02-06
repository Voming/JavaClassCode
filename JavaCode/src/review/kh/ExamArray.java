package review.kh;

public class ExamArray {
	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr1.length; i++) {
			if (i < arr1.length - 1) {
				System.out.print(arr1[i] + ", ");
			} else {
				System.out.print(arr1[i]);
			}
		}
		System.out.println();
	}
}
