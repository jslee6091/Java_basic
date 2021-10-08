package webdeveloper_one.java;

public class Dowhile_1 {

	public static void main(String[] args) {
		int init = 1;
		
		// do{} while : 무조건 한번 실행 후 괄호문 실행
		
		// 1 ~ 10 까지 합을 구하시오
		int sum = 0;
		
		do {
			sum += init;
		} while (++init <= 10);
		System.out.println("sum : " + sum);
		
	}

}
