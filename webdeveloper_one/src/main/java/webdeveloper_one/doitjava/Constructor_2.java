package webdeveloper_one.doitjava;

public class Constructor_2 extends Parent_1{

	public String name;
	
	public Constructor_2() {
		// �⺻�����ڷ� ����
		this("�̸�");
		System.out.println("�⺻������");
	}
	
	public Constructor_2(String name) {
		// �θ� �ִ� �⺻ �����ڷ� ����
		super();
		System.out.println(name + "�⺻ �����ڿ��� ������ ������");
	}
	
	public void Upmethod() {
		super.Parentmethod();
		System.out.println("�ڽĿ� �ִ� Upmethod()");
	}
	
	@Override
	// annotation(Override ���Ľ��)
	// override : �޼ҵ��̸�(argument ����, argument type) -> �������̵� �ƴϸ� �����ε�
	public void Overmethod() {
		System.out.println("�ڽĿ� �ִ� Overmethod()");
	}

	public static void main(String[] args) {
		Constructor_2 con = new Constructor_2();
		con.Upmethod();
		con.Overmethod();
	}
}