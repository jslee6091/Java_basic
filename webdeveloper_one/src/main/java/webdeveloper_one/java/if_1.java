package webdeveloper_one.java;

public class if_1 {

	public static void main(String[] args) {

		// a&&b : a and b�� true �̸� true
		// a||b : a or b�� true �̸� true
		int a = 10;
		int b = 20;

		if (a == 10 || b == 30) {
			System.out.println("true!");
		} else {
			System.out.println("false!");
		}

		a = 20;
		b = 220;

		if (a < b && a == b) {
			System.out.println("true!!");
		} else {
			System.out.println("false!!");
		}
	}

}
