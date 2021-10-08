package webdeveloper_one.doitjava;

public class For_1 {

	public static void main(String[] args) {
		// for(�ʱ��; ���ǽ�; ������){���ǽ� ������ ����}
		// for(;;) - ���� ����
		
		// 1 ~ 10 ���
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int i = 1;
		for (; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("==============================");
		
		// 2 ~ 11 �� ���
		int sum = 0;
		for (int j = 2; j <= 11; j++) {
			sum += j;
		}
		System.out.println(sum);

		System.out.println("==============================");
		
		// 3 ~ 20 ��ü�� ���
		// 3 ~ 20 �� 3,8,13 ������ �� ���
		int sum2 = 0, sum3 = 0;
		for (int j = 3; j <= 20; j++) {
			sum2 += j;
			if(!(j == 3 || j == 8 || j == 13)) {
				sum3 += j;
			}
		}
		System.out.println("3 ~ 20 sum : " + sum2);
		System.out.println("3 ~ 20 3, 8, 13 ���� sum : " + sum3);
		
		System.out.println("==============================");
		
		// 4 ~ 20 �� 4, 8,13�� �����ϰ� ¦��, Ȧ���� ���� ���� ���
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
		
		System.out.println("¦���� �� : " + evensum);
		System.out.println("Ȧ���� �� : " + oddsum);
		
		
	}

}
