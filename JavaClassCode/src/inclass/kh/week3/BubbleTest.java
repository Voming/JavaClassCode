package inclass.kh.week3;

public class BubbleTest {
	public static void main(String[] args) {
		//Double[] arr = new Double[] { 3.1, 2.5, 5.1, 8.3, 1.0, 4.5, 6.7 };
		String[] arr = new String[] {"다","마","가","라","파","마","나","바"};

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) // /if(arr[i] > arr[i+1]) 오름차순 //if(arr[i] < arr[i+1]) 내림차순
				{
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			printArray(arr);
			//static 안쓴다면 아래처럼 써야함
			//new BubbleTest().printArray(arr);
		}
		
		String str1 = "abc";
		String str2 = "dfe";
		int comp = str1.compareTo(str2);
		System.out.println(comp); 
	}
          //static없애면 안됨(static인 main에서 사용하기 때문
	public static void printArray(Object[] arr) {//메소드의 매개변수에 업캐스팅을 많이 쓴다
		for(int i = 0; i < arr.length ; i++) {   //wrapper 클래스 형으로 호출해줘야함
			System.out.print(arr[i] + "/");
		}
		System.out.println();
	}
	
	//compareTo()반환값
	//str보다 사전순으로 앞이면 음수, 같으면 0, 뒤면 정수 값을 반환
}
