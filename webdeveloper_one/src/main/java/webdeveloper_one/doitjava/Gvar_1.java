package webdeveloper_one.doitjava;

public class Gvar_1 {

	// �������� : ���� ������, Ÿ��, �����̸�
	// �ʱ�ȭ �ʿ� x
	// lifecycle : �ֱ� -> ��ü �ֱⰡ ���ϸ�(������ �÷���) �Ҹ�
	// ������ �÷��� : jvm ���� �ִٰ� ���� �ʴ� ��ü�� ������ �ڵ����� �Ҹ�, �켱���� ���ϱ� ����
	public String name;
	
	// ū�� -> ���� ��
	// ex) ���ѹα�, ����, ���ʱ�, ���絿, �ѱ�IT���������а�, 5��, 502ȣ
	// �̰��� ��ü����(Object-oriented) �̴�.
	
	public static void main(String[] args) {
		
		// ���������� �ݵ�� �ʱ�ȭ, ���������� ��������
		
		String name = "���缺";
		System.out.println(name);
		
		// new : ��ü ����
		Gvar_1 ob = new Gvar_1();
		ob.name = "Jason Lee";
		System.out.println(ob.name);
	}

}
