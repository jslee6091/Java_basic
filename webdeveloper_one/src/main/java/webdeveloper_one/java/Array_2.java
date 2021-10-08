package webdeveloper_one.java;

public class Array_2 {

	public static void main(String[] args) {
		// 2차원 배열 초기화 : 행과 열로 구성
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("\t " + arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=====================================");
		
		// 0 ~ 8 3행 3열 만들고 전체 합 출력
		// 3,6,8 제외한 합 출력
		// 홀수 합, 짝수 합 출력
		int arr2[][] = new int[3][3];
		int totalsum = 0;
		int oddsum = 0;
		int evensum = 0;
		int not368sum = 0;
		int start = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = start++;
				totalsum += arr2[i][j];
				if(!(arr2[i][j] == 3 || arr2[i][j] == 6 || arr2[i][j] == 8)) {
					not368sum += arr2[i][j];
				}
				
				if(arr2[i][j] % 2 == 0) {
					evensum += arr2[i][j];
				}
				else {
					oddsum += arr2[i][j];
				}
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("전체 합 : " + totalsum);
		System.out.println("3,6,8 제외한 합 : " + not368sum);
		System.out.println("짝수 합 : " + evensum);
		System.out.println("홀수 합 : " + oddsum);
	}
}
