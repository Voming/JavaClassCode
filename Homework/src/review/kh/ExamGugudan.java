package review.kh;

public class ExamGugudan {
	public static void main(String args[]) {
		//for
		for(int i = 2; i<10; i++) {
			System.out.println("for문"+ i +"단");
			for(int j = 1; j<10; j++) {
				System.out.printf("%d * %d =  %d\n", i, j , i*j);
			}
		}
		//while
		int i = 2;
		int j = 1;
		while(i <10) {
			System.out.println("while문"+ i +"단");
			while(j<10) {
				System.out.printf("%d * %d =  %d\n", i, j , i*j);
				j++;
			}
			i++;
			j = 1;
		}
		//do-while
		i = 2;
		j = 1;
		do {
			System.out.println("do-while문"+ i +"단");
			do {
				System.out.printf("%d * %d =  %d\n", i, j , i*j);
				j++;
			}while(j<10);
			i++;
			j = 1;
		}while(i<10);
		
	}
}
