package webdeveloper_one.java;

// Ŭ������ �ڹٿ��� ������ �� �ִ� ���̴�.
public class Var_1 {

	// main() : �ڹ� jvm���� ȣ��
	public static void main(String[] args) {
		// ���� : ���� �� ����
		// ������ �����ʿ��� ��������
		// �ڹٴ� call by value�� �ִ�.
		// call by reference(������)�� �ڹٿ� ����.

		// ���
		System.out.println("���� �Ѵ�");

		// String : ���ڿ�Ÿ�Կ� ���� �ڹ� Ÿ�� ����
		// �ڹٿ��� ���ڿ��� �������ͽ����� �̷������.
		// �����̱� ������ ���� �� �ְ� �����ʿ��� �������� ����
		// ���� <-> ���
		String name = "���缺";
		name = "ȫ�浿";
		System.out.println("�̸��� : " + name);

		String address = "����� ������";
		System.out.println("�ּҴ� : " + address);

		// ���ڸ�����: �ڵ��ϼ����
		address = "�Ͽ���";
		System.out.println("�ּҴ� : " + address);

	}

}
