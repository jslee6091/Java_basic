package webdeveloper_one.java;

public class Method_3 {

	public String movename = "��¡�����";
	public String moveaddress = "���ѹα�";
	public int moveage = 2021;

	// �⺻ ������ : ���ڰ� ���� ������
	public Method_3() {
		System.out.println("�⺻ �������Դϴ�");
	}

	// ����(argument)�� �ִ� ������
	public Method_3(String name, String address) {
		System.out.println("�̸� : " + name + " �ּ� : " + address);
	}

	// get : ���� ��´�
	// set : ���� ����, �����Ѵ�
	public String getMovename() {
		return movename;
	}

	public void setMovename(String movename) {
		// ���� ������ ���� ������ �̸��� ������ ���������� this. �� ���ƾ��Ѵ�.
		this.movename = movename;
	}

	public String getMoveaddress() {
		return moveaddress;
	}

	public void setMoveaddress(String moveaddress) {
		this.moveaddress = moveaddress;
	}

	public int getMoveage() {
		return moveage;
	}

	public void setMoveage(int moveage) {
		this.moveage = moveage;
	}

	public Method_3(String movename, String moveaddress, int moveage) {
		this.movename = movename;
		this.moveaddress = moveaddress;
		this.moveage = moveage;
	}

	public static void main(String[] args) {

		// ������ : �����ڵ� ��ȣ�� �����Ƿ� �޼ҵ��̴�.
		// Ŭ���� Ÿ������ �̸� �������ִ�.
		// � Ÿ�Ե��� ���� �� ���ϰ� ���� �� �ִ�.
		// �⺻�����ڴ� ���� �����ϴ�.
		// �⺻�����ڴ� ���ڰ� �ִ� �����ڰ� ���� ������ �Ұ����ϴ�. (�⺻ ������ �ּ�ó���ϸ� ���� �߻�)

		Method_3 obj = new Method_3();
		obj.setMovename("DP");
		obj.setMoveaddress("�ѱ�");
		System.out.println("��ȭ�̸� : " + obj.getMovename() + "\n��ȭ�ּ� : " + obj.getMoveaddress());
		System.out.println("====================================");
		
		Method_3 obj2 = new Method_3("��������", "����");
		obj2.setMovename("������3");
		obj2.setMoveaddress("�̱�");
		System.out.println("��ȭ�̸� : " + obj2.getMovename() + "\n��ȭ�ּ� : " + obj2.getMoveaddress());
		System.out.println("====================================");
		
		Method_3 obj3 = new Method_3("�ҽ��ڵ�", "�̱�", 2008);
		System.out.println("��ȭ�̸� : " + obj3.getMovename() + "\n��ȭ�ּ� : " + obj3.getMoveaddress() + "\n��ȭ���ۿ��� : " + obj3.getMoveage());
		
	}

}
