package webdeveloper_one.java;

public class Trycatch_1 {

	public static void main(String[] args) {
		
		try {
			// ���� �ϴ� ��
			int array[] = {1,2,3,4,5};
			for(int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error!");
		}catch (Exception e) {
			// Exception : ��� ����ó���� �θ��̴�
			// catch�� �������� �� Exception�� ���� �������� �;��Ѵ�
		}
		
	}

}
