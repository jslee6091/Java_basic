package webdeveloper_one.doitjava;

public class Dowhile_1 {

	public static void main(String[] args) {
		// do{������ �ѹ� ���� �� ���� ������ ����}while(���ǽ�);
		int init = 0;
		int sum = 0;
		do {
			sum += init;
			System.out.println(sum);
		} while (++init <= 10);
		
		
	}

}
