package webdeveloper_one.java.exam;

import java.util.ArrayList;

public class LoginBean {

	public static void main(String[] args) {
		
		ArrayList<InputLogin> Array = new ArrayList<InputLogin>();
		
		// �̸�, ����, �ּ� 5�� �Է�
		Array.add(new InputLogin("���缺", 26, "�����"));
		Array.add(new InputLogin("���ѹα�", 70, "�ѹݵ�"));
		Array.add(new InputLogin("�̱�", 300, "�Ƹ޸�ī"));
		Array.add(new InputLogin("��������", 1500, "����"));
		Array.add(new InputLogin("��", 4000, "�����"));
		
		// ã���� �ϴ� ���� ����
		InputLogin searchuser = new InputLogin("���缺", 1500, "���þ�");
		
		String searchname = "���缺";
		int searchage = 1500;
		String searchaddr = "���þ�";
		
		// �̸� �˻�
		
		
		for(int i = 0; i < Array.size(); i++) {
			if(Array.get(i).userid.equals(searchname)) {
				System.out.println(searchname + " ���ԵǾ��ֽ��ϴ�.");
			}
			else if(String.valueOf(Array.get(i).age).equals(String.valueOf(searchage))) {
				System.out.println(searchage + " ���ԵǾ��ֽ��ϴ�.");
			}
			else if(Array.get(i).address.equals(searchaddr)) {
				System.out.println(searchaddr + " ���ԵǾ��ֽ��ϴ�.");
			}
		}


	}

}
