package webdeveloper_one.java;

public class While_1 {

	public static void main(String[] args) {
		
		int init = 0;
		
		/* while: true ��ȣ������ */
		
		while (++init <= 10) {
			System.out.println(init);
		}
		
		// 2 ~ 10 ���� ���� ���Ͻÿ�
		init = 1;
		int sum = 0;
		while (init++ < 10){
			sum += init;
		}
		System.out.println("sum : " + sum);

	}

}
