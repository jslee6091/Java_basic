package webdeveloper_one.doitjava;

public class While_1 {

	public static void main(String[] args) {
		
		// while(���ǽ�) {���ǽ� ������ ����}
		int init = 0;
		while (init++ <= 10) {
			System.out.println(init);
		}
		
		System.out.println("=========================");
		
		// 1 ~ 10 ��
		init = 0;
		int sum = 0;
		while(++init <= 10) {
			sum = sum + init;
		}
		System.out.println(sum);

	}

}
