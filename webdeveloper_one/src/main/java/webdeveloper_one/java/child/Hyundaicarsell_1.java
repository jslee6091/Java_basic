package webdeveloper_one.java.child;

public class Hyundaicarsell_1 implements Commoncar{

	
	@Override
	public void Carname(String name) {
		System.out.println("���̸� : " + name);
		
	}

	@Override
	public void Carprice(String price) {
		System.out.println("������ : " + price);
		
	}

	public static void main(String[] args) {
		/* ����Ͻ�����, ����Ͻ� ���� */
		/* �����ڵ��� �븮�� 1�� �մ� gv80 ������ */
		Commoncar ccar = new Hyundaicarsell_1();
		
		// �θ��� Commoncar�� �޼ҵ带 �ڽĿ��� �������̵�
		ccar.Carname("gv80");
		ccar.Carprice("8000");
		
	}

}
