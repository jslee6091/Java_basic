package webdeveloper_one.java;

public class Dowhile_1 {

	public static void main(String[] args) {
		int init = 1;
		
		// do{} while : ������ �ѹ� ���� �� ��ȣ�� ����
		
		// 1 ~ 10 ���� ���� ���Ͻÿ�
		int sum = 0;
		
		do {
			sum += init;
		} while (++init <= 10);
		System.out.println("sum : " + sum);
		
	}

}
