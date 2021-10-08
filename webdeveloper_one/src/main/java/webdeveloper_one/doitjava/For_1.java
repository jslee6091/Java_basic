package webdeveloper_one.doitjava;

public class For_1 {

	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){조건식 맞으면 실행}
		// for(;;) - 생략 가능
		
		// 1 ~ 10 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int i = 1;
		for (; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("==============================");
		
		// 2 ~ 11 합 출력
		int sum = 0;
		for (int j = 2; j <= 11; j++) {
			sum += j;
		}
		System.out.println(sum);

		System.out.println("==============================");
		
		// 3 ~ 20 전체합 출력
		// 3 ~ 20 중 3,8,13 제외한 값 출력
		int sum2 = 0, sum3 = 0;
		for (int j = 3; j <= 20; j++) {
			sum2 += j;
			if(!(j == 3 || j == 8 || j == 13)) {
				sum3 += j;
			}
		}
		System.out.println("3 ~ 20 sum : " + sum2);
		System.out.println("3 ~ 20 3, 8, 13 제외 sum : " + sum3);
		
		System.out.println("==============================");
		
		// 4 ~ 20 중 4, 8,13을 제외하고 짝수, 홀수의 합을 각각 출력
		int oddsum = 0;
		int evensum = 0;
		for (int j = 4; j <= 20; j++) {
			if(!(j == 4 || j == 8 || j == 13)) {
				if(j % 2 == 1) {
					oddsum += j;
				}
				else {
					evensum += j;
				}
			}
		}
		
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
		
		
	}

}
