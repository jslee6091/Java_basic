package webdeveloper_one.doitjava;

public class Array_1 {

	public static void main(String[] args) {
		// �迭 : �ڹ��� �迭�� ���� Ÿ���� ���������� �̷���� ����
		// object ��� Ÿ���� ���� �� �ִ�
		// �迭 index : 0���� ����
		int array[] = {1,2,3,4,5};
		int array2[] = new int[] {1,2,3,4};
		int array3[] = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("=================================");
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = i + 1;
			System.out.println(array3[i]);
		}
		
		System.out.println("=================================");
		
		// 1 ~ 10 �� ���Ͻÿ�
		int s = 0;
		for(int i = 0; i < array3.length; i++) {
			s += array3[i];
		}
		System.out.println(s);
		
		// while, dowhile : 3, 9 ������ �� ���
		int sum = 0, index = 0;
		while(index < array3.length) {
			if(!(array3[index] == 3 || array3[index] == 9)) {
				sum += array3[index];
			}
			index++;
		}
		System.out.println("while �� : " + sum);
		
		sum = 0; index = 0;
		do {
			if(!(array3[index] == 3 || array3[index] == 9)) {
				sum += array3[index];
			}
		}while(++index < array3.length);
		System.out.println("dowhile �� : " + sum);
	}

}
