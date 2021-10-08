package webdeveloper_one.java;

public class Switch_1 {

	public static void main(String[] args) {
		int choice = 2;
		
		// break 안하면 case 2부터 default까지 모두 실행함
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
			System.out.println("기타");
			break;
		}
		
		System.out.println("end");
	}

}
