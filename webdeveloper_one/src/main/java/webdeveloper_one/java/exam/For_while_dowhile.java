package webdeveloper_one.java.exam;

public class For_while_dowhile {

	public static void main(String[] args) {
		// for 2 ~ 10�� ��
		// while 3 ~ 11�� ��
		// dowhile 4 ~ 12�� ��

		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			sum += i;
		}
		System.out.println("for�� �� : " + sum);

		sum = 0;
		int init = 2;
		while (++init <= 11) {
			sum += init;
		}
		System.out.println("while�� �� : " + sum);

		sum = 0;
		init = 4;
		do {
			sum += init;
		} while (++init <= 12);
		System.out.println("dowhile�� �� : " + sum);
	}

}
