package webdeveloper_one.doitjava;

public class Opt_2 {

	public static void main(String[] args) {
		
		// +-*/%
		System.out.println(2 + 3);
		System.out.println(8 - 5);
		System.out.println(2 * 6);
		System.out.println(9 / 3);
		System.out.println(7 % 2);
		
		int one = 5; int two = 2;
		
		System.out.println(one < two);
		System.out.println(one > two);
		System.out.println(one <= two);
		System.out.println(one >= two);
		
		one = 10; two = 10; int three = 5;
		
		System.out.println(one == two);
		System.out.println(one != two);
		System.out.println(one == three);
		System.out.println(one != three);

		// new : ���ο� ��ü ����
		// �ڹٴ� �ּҷ� ���� ���Ѵ�. ��ü�� ���ؼ��� ���� ����
		String str1 = new String("�ȳ�");
		String str2 = new String("�ȳ�");
		
		// ���ڿ��� �ƴ� ��ü ���̹Ƿ� false�̴�
		System.out.println(str1 == str2);
		// ���ڿ� ���̹Ƿ� true
		System.out.println(str1.equals(str2));
		
	}

}