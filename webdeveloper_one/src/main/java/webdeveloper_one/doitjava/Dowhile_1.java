package webdeveloper_one.doitjava;

public class Dowhile_1 {

	public static void main(String[] args) {
		// do{무조건 한번 실행 후 조건 맞으면 실행}while(조건식);
		int init = 0;
		int sum = 0;
		do {
			sum += init;
			System.out.println(sum);
		} while (++init <= 10);
		
		
	}

}
