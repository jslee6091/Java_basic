package webdeveloper_one.java.child;

import java.util.HashMap;

public class Kiacarsell_1 implements Commoncar{

	@Override
	public void Carname(String name) {
		System.out.println("���̸� : " + name);
	}
	
	@Override
	public void Carprice(String price) {
		System.out.println("������ : " + price);	
	}
	
	public void Print() {
		System.out.println("���");
	}
	
	public static void main(String[] args) {
		Commoncar ccar = new Kiacarsell_1();
		Commoncar hcar = new Hyundaicarsell_1();
		
		// new �Ⱦ��� ��ü����
		// ����ó�� Exception : ������ ������ �ڵ忡�� ����ó���Ѵ�.
		// network.io ��ü ����, jdbc.port ���� �� �ݵ�� ����ó��(���ϸ� ���� �ȵ�)
		// Exception : ��� ����ó���� �θ�
		// �ڽ��� �θ� �ִ� ��� ���� �� �� �ִ�.
		// �ڽ��� �θ𺸴� ���ų� ũ��.
		// �ڽ��� �θ�Ÿ�Կ� ���Եȴ�.
		
		try {
			// ��ĳ����
			Commoncar commoncar = (Commoncar)Class.forName("webdeveloper_one.java.child.Kiacarsell_1").newInstance();
//			commoncar.Carname("ī����3");
//			commoncar.Carprice("1000");
			
			// �ſ� ���� �����Ͱ� ���� ���� ������ ��ü�� �������� �ʰ� hashmap�� ���
			HashMap hash = new HashMap();
			hash.put("kia", "webdeveloper_one.java.child.Kiacarsell_1");
			hash.put("hyundai", "webdeveloper_one.java.child.Hyundaicarsell_1");
			
			System.out.println(hash.get("kia"));
			System.out.println(hash.get("hyundai"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*catch (InstantiationException e) {// ��ü ���� ���� ����
			// printStackTrace() : ������ ���
			e.printStackTrace();
		} catch (IllegalAccessException e) {// �߸��� �������� ���� ���� �ź� ����
			e.printStackTrace();
		} catch (ClassNotFoundException e) {// Ŭ������ ���� ����
			e.printStackTrace();
		}*/
		
		// �ڵ����� 100�� �� ��
		// ���� : ����� ����� ���� �� �� �ִ�.
		
		// k7 ���� 4000Ǯ�ɼ�
//		ccar.Carname("k7");
//		ccar.Carprice("4000");
//		
//		hcar.Carname("gv70");
//		hcar.Carprice("5000");
	}

}
