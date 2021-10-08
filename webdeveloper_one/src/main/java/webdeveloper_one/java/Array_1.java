package webdeveloper_one.java;

public class Array_1 {

	public static void main(String[] args) {
		// 1차원 배열 초기화
		// 배열은 0부터 시작, 0부터 접근
		// java에서 index는 무조건 0부터 시작
		// 요소(element) 배열의 갯수
		int arr[] = {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====================================");
		
		// 1 ~ 10 배열 초기화를 하고 합 구하기
		int arr2[] = new int[10];
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1;
			sum += arr2[i];
		}
		System.out.println(sum);
		
		System.out.println("=====================================");
		
		int arr3[] = new int[5];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		arr3[3] = 4;
		arr3[4] = 5;
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("=====================================");
		
		// 1 ~ 20 합 구하기
		int arr4[] = new int[20];
		int sum2 = 0;
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = i + 1;
			sum2 += arr4[i];
		}
		System.out.println(sum2);
		
	}

}
