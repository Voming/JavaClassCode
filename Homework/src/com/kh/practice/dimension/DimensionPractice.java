package com.kh.practice.dimension;

public class DimensionPractice {
	public void practice1() {
		String arr[][] = new String[][] { { "(0, 0)", "(0, 1)", "(0, 2)" }, { "(1, 0)", "(1, 1)", "(1, 2)" },
				{ "(2, 0)", "(2, 1)", "(2, 2)" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int arr[][] = new int[4][4];
		int input = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = input;
				input++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int arr[][] = new int[4][4];
		int input = 16;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = input;
				input--;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	/*public void practice4() {
		int arr[][] = new int[4][4];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = input;
				input--;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}*/
}
