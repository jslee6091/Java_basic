package webdeveloper_one.doitjava;

public class Array_2 {

	public static void main(String[] args) {
		
		// 3행 3열
		// 행과 열로 구성
		int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("\t" + array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\t----------------------------------");
		
		int array2[][] = new int[3][5];
		
		// 1 ~ 15 값을 입력 후 출력
		int num = 1;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				array2[i][j] = num++;
				System.out.print("\t" + array2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\t----------------------------------");
		
		// 1행, 3행을 뺀 합을 출력
		int sum = 0;
		for (int i = 0; i < array2.length; i++) {
			if(!(i == 0 || i == 2)) {
				for (int j = 0; j < array2[0].length; j++) {
					sum += array2[i][j];
				}
			}
		}
		System.out.println("\t" + sum);
		
	}

}
