package webdeveloper_one.doitjava;

public class If_3 {

	public static void main(String[] args) {
		int one = 10, two = 20;
		
		if(one > two) {
			System.out.println("one > two");
		}
		else {
			System.out.println("one <= two");
		}
		
		
		// else if: 앞의 else if가 false이면 뒤의 else if 가 true 될때까지 실행
		int init = 10;
		
		if(init <= 50) {
			System.out.println(init);
		}else if(init <= 40) {
			System.out.println(init);
		}else if(init <= 30) {
			System.out.println(init);
		}else if(init <= 20) {
			System.out.println(init);
		}else if(init <= 10) {
			System.out.println(init);
		}

	}

}
