package webdeveloper_one.doitjava;

public class Java_1 {

	// jvm���� main ȣ��(call) �Ѵ�
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("world");
		
		// ���� : �����ϱ� ���� ��
		// �ڹٴ� call by value�� �ִ�.
		// ���� �̵���Ų��
		// ������ �� ���� �ӵ� ����
		// c, c++, c# : call by reference(������, ����Ű��)
		// ���� : �����ʿ��� �������� ���� (�������� �̵�)
		// ���� ���� : ���ڿ��� ��Ÿ����
		// ���� : ���ڰ� ���̸� ���ڿ�(�ڹ�)
		String strvalue = "���缺";
		System.out.println("�̸� : " + strvalue);
		
		// �ڹٿ����� ���� ����
		String name;
		// �ʱ�ȭ
		name = "ȫ�浿";
		
		System.out.println("�̸� : " + name);
		
		String email,address;
		email = "1234@naver.com";
		address = "�����";
		
		System.out.println("email : " + email + ", address : " + address);
		
		// �ʱ�ȭ : �ּҰ��� ������ null�� �ִ�.
		// ������� ����� ���� ��
		String nullvalue = null;
		System.out.println("null : " + nullvalue);
		
		// System.out.println(); = ����ϸ鼭 �ٹٲ�
		// System.out.print(); = ����ϸ鼭 �ٹٲ��� ���� ����
		System.out.print("�ٹٲ� x");
		// ���� : ����Ʈ�� �ƴ϶� ���ڿ� ���� ���߾���
		// ���� : 1����Ʈ, �ѱ� : 2����Ʈ
		// �����(int, public, static, void ���)�� ������, Ŭ������, �޼ҵ������ �� �� ����.
		
		// ���� : 0 ~ 10 ������
		// �ڹٿ��� �������� int ������ �޴´�
		int age = 10;
		age = age + 10;
		age += 10;
		
		System.out.println("������ : " + age);
		
		// ��� : final ����, �޼ҵ�, Ŭ����
		// ����� ���� ������ �� ���� ����� �ȵ�
		// ���� Ÿ�� Ŭ���� ��� final String, Integer, Long, Double...
//		final int age2 = 0;
//		age2 = 3;
//		System.out.println("��� ���� : " + age2);
		// Java�� �ּҰ� ���� ��ü�� �ִ�, ��ü�θ� ã�´�
		
		// �ڹٿ��� ���ڴ� char(Character)�̴�.
		// �ڹٿ��� ���ڴ� �̱����ͷ� ���´�
		char charvalue1 = 'a';
		char charvalue2 = 'b';
		char charvalue3 = 'c';
		
		System.out.println("����1 : " + charvalue1);
		System.out.println("����2 : " + charvalue2);
		System.out.println("����3 : " + charvalue3);
		
		String name2 = "���缺";
		
		
		// �������� : �ش��ϴ� ��ȣ���� ������ �Ҹ��Ѵ�.
		// �������� : ���� ��а� �����ȴ�.(��ü�� ������� ��)
	}

}