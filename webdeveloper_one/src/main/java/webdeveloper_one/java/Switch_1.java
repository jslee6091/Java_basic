package webdeveloper_one.java;

public class Switch_1 {

	public static void main(String[] args) {
		int choice = 2;
		
		// break ���ϸ� case 2���� default���� ��� ������
		switch (choice) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("��Ÿ");
			break;
		}
		
		System.out.println("end");
	}

}
