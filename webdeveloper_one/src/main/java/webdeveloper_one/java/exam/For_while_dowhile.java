package webdeveloper_one.java.exam;

public class For_while_dowhile {

	public static void main(String[] args) {
		// for 2 ~ 10의 합
		// while 3 ~ 11의 합
		// dowhile 4 ~ 12의 합

		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			sum += i;
		}
		System.out.println("for문 합 : " + sum);

		sum = 0;
		int init = 2;
		while (++init <= 11) {
			sum += init;
		}
		System.out.println("while문 합 : " + sum);

		sum = 0;
		init = 4;
		do {
			sum += init;
		} while (++init <= 12);
		System.out.println("dowhile문 합 : " + sum);
	}

}
