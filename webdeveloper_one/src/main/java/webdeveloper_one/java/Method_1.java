package webdeveloper_one.java;

public class Method_1 {

	public String name = "ȫ�浿";
	public int age = 266;
	public String address = "��õ��";
	
	// �޼ҵ� ���� : ���������� ����Ÿ�� �޼ҵ��() {return ����Ÿ��}
	public String Name() {
		return name;
	}
	
	public int Age() {
		return age;
	}
	
	public String Address() {
		return address;
	}
	
	public static void main(String[] args) {
		// ���� : ��ȣ�� ����, �ϳ��� ���� ���´�, ��������� ��
		// �޼ҵ� : �����̴�(������ ���), ��ȣ�� �ִ�
		String name = "���缺";
		int age = 26;
		String address = "����� ������";
		
		Method_1 obj = new Method_1();
		
		// �������� : �̸�, ����, �ּ� ���
		// �������� : �̸�, ����, �ּ� ���
		// �̸�, ����, �ּ� �޼ҵ� ���
		
		System.out.println("=========��������===========");
		System.out.println("���� name : " + name);
		System.out.println("���� age : " + age);
		System.out.println("���� address: " + address);
		
		System.out.println("=========��������===========");
		System.out.println("���� name : " + obj.name);
		System.out.println("���� age : " + obj.age);
		System.out.println("���� address : " + obj.address);
		
		System.out.println("=========�޼ҵ�===========");
		System.out.println("�޼ҵ� name: " + obj.Name());
		System.out.println("�޼ҵ� age : " + obj.Age());
		System.out.println("�޼ҵ� address : " + obj.Address());

	}

}
