package webdeveloper_one.doitjava;

public class While_1 {

	public static void main(String[] args) {
		
		// while(조건식) {조건식 맞으면 실행}
		int init = 0;
		while (init++ <= 10) {
			System.out.println(init);
		}
		
		System.out.println("=========================");
		
		// 1 ~ 10 합
		init = 0;
		int sum = 0;
		while(++init <= 10) {
			sum = sum + init;
		}
		System.out.println(sum);

	}

}
