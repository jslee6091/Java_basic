package webdeveloper_one.java;

public class For_2 {

	public static void main(String[] args) {
		// \t : tab(5ĭ �̵�)
		// \n : �ٹٲ�
		// System.out.println : �ٹٲ� ����
		// System.out.print : �ٹٲ� ����
		
		// ������ 2 ~9 �� 3,5,7 ���� ��� 
		for(int i = 2; i < 10; i++) {
			if(!(i == 3 || i == 5 || i == 7)) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i + "*" + j + "=" + i*j + " \t");
				}
				System.out.println();
			}
		}
	}
}
