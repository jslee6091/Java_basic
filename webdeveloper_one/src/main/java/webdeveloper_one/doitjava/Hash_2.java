package webdeveloper_one.doitjava;

import java.util.Hashtable;

public class Hash_2 {

	public static void main(String[] args) {
		
		/* key, value -> 1 : 1 -> �ӵ��� ���� ������
		 * Map�� hash�� �θ��̴�
		 */
		
		Hashtable hash = new Hashtable();
		hash.put(1, 1);
		hash.put(2, 2);
		hash.put(3, 3);
		hash.put(4, 4);
		hash.put(5, 5);
		
		/* for loop */
		for (int i = 0; i < hash.size(); i++) {
			System.out.println(hash.get(i + 1));
		}
		
		System.out.println("-----------------");
		
		// bean : �ӽ÷� ���� �����Ѵ�
		LoginBean bean = new LoginBean();
		bean.setName("���缺");
		bean.setAge(26);
		bean.setAddress("���ѹα�");
		
		LoginBean bean2 = new LoginBean();
		bean2.setName("�ƹ���");
		bean2.setAge(20);
		bean2.setAddress("�����");
		
		hash.clear();
		
		hash.put(1, bean);
		hash.put(2, bean2);
		
		for(int i = 1; i <= hash.size(); i++) {
			LoginBean dd = (LoginBean)hash.get(i);
			System.out.println(dd.getAddress());
			System.out.println(dd.getAge());
			System.out.println(dd.getName());
			System.out.println("-----------------");
		}
		
		// package:webdeveloper_one.doitjava
		// class:InputLogin_A, InputLoginBean_A
		// class:InputLogin_M, InputLoginBean_M
		// �Է� �̸�, ����, �ּ�, �̸���, ���� 5�� �Է�
		// A�� Arraylist, M�� HashMap, Hashtable �� ���
		
	}

}