package webdeveloper_one.java;

public class For_1 {

	public static void main(String[] args) {
		
		/*for(�ʱ��;���ǽ�;������) {
			���ǽ��� true�̸� ��ȣ ����
			������ +1 ����
		}
		���ǽ�, �ʱ��, ������ ���� ����
		*/
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		// ���� : 1 ~ 10 ���� �� ���Ͻÿ�
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("�� : " + sum);
	}

}
