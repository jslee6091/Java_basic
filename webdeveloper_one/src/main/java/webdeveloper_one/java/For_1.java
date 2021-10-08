package webdeveloper_one.java;

public class For_1 {

	public static void main(String[] args) {
		
		/*for(초기식;조건식;증감식) {
			조건식이 true이면 괄호 실행
			증감식 +1 증가
		}
		조건식, 초기식, 증감식 생략 가능
		*/
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 문제 : 1 ~ 10 까지 합 구하시오
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합 : " + sum);
	}

}
