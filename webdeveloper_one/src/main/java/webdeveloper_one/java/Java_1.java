package webdeveloper_one.java;

// public : ������ ���� ����
// protected : �ش� ��Ű���� ���� ����
// private : ���� Ŭ���������� ���� ����

// ���� : ���� ������ class Ŭ������{}
public class Java_1 {
	// ��������
	public String name = "ȫ�浿";
	public int age = 26;
	public String address = "����� ������";
	
	// jvm ȣ���ϴ� main() �޼ҵ�
	public static void main(String[] args) {
		// local variable(��������) : ��ȣ�� ������ ���� �Ҹ�
		String name = "���缺";
		System.out.println("�̸� : " + name);
		
		// ��ü obj
		// new : ��ü ���� �����
		// new : �������÷��� = �޸𸮿��� ���� �ʴ� ��ü�� �ڵ� �Ҹ�(release)
		Java_1 obj = new Java_1();
		System.out.println("���� name : " + obj.name);
		System.out.println("���� age : " + obj.age);
		System.out.println("���� address : " + obj.address);
		
		
		// ��ü������ : c, c++, java, c#
		// ��ü������� ū ���信�� ���� �� �����̴�.
		// ����.���ѹα�.����.���ʱ�.���絿.66-3.5��.502ȣ
	}

}
