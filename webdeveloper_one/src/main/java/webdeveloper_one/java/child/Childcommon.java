package webdeveloper_one.java.child;

// exxtends : ������, class <- class, interface <- interface
// implements : Ʋ����, class <- interface

// override : ���� �̸��� �޼ҵ峪 ������ �ڽĿ��� �������ϴ� ��
// �̸�, ����Ÿ��, Ÿ��, ���ڰ����� �ڽĿ� ������ ������
// �̸�, ����Ÿ��, Ÿ��, ���ڰ����� �ڽĿ��� ���� ������ �����ε�

public class Childcommon implements BaseCommon{

	String name = "���缺";
	
	@Override // �������̼� : �������̵� �ϰڴٴ� ��
	public void C501(String classname) {
		System.out.println("C501");	
	}
	
	@Override
	public void C502(String classname) {
		System.out.println("C502");
	}
	
	@Override
	public void C503(String classname) {
		System.out.println("C503");	
	}

	public static void main(String[] args) {
		// class : ��ü ���� �ǰ� ��ü ����
		// class : �ϴ� ������ ���ุ �ϴ� ��
		
		Childcommon ch = new Childcommon();
		System.out.println(ch.name);
		ch.C501("����_1");
		ch.C502("����_2");
		ch.C503("����_3");
	}

}
