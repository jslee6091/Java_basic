package webdeveloper_one.doitjava;

public class Method_1 {

	public static String name = "���缺";
	public static int age = 26;
	public static String address = "�����";
	
	public String Name() {
		return name;
	}
	
	public int Age() {
		return age;
	}
	
	public void Address() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
	}
	
	public void Print() {
		System.out.println("void�� return Ÿ�� �ʿ� ����");
	}
	
	public static void main(String[] args) {
		
		// ���� : ������ �� ����
		// �޼ҵ尡 �����δ�(����)
		System.out.println("���");
		Method_1 mm = new Method_1();
		mm.Print();
		
		// �̸� ���� �ּ� void Address()�� ���
		mm.Address();
		System.out.println(mm.Age());
		
	}

}