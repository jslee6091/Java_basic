package webdeveloper_one.java.exam;

public class Array_new {

	public static void main(String[] args) {
		// 3 ~ 21 ���� �迭 �ʱ�ȭ �� �� ���ϱ�
		// 19���� �迭 ���� �� ���ϱ�
		// 4, 9 ,20 ��� ���� ����
		int array[] = new int[19];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 3;
			if(!(array[i] == 4 || array[i] == 9 || array[i] == 20)) {
				sum += array[i];
			}
		}
		System.out.println("���� : " + sum);
	}

}
