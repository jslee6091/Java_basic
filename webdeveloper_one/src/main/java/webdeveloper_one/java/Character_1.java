package webdeveloper_one.java;

public class Character_1 {

	public static void main(String[] args) {
		
		// char(Character) ���ڸ� ��Ÿ���� �̱����ͷ� ���Ѵ�
		// ���� + ���� -> ���ڿ�
		
		char charvalue = '��';
		char charvalue2 = '��';
		char charvalue3 = '��';
		
		System.out.println(charvalue);
		System.out.println(charvalue2);
		System.out.println(charvalue3);
		
		System.out.println("=============================================");
		
		String name = "���缺";
		for (int i = 0; i < name.length(); i++) {
			char char1 = name.charAt(i);
			System.out.println(char1);
		}
		
		Character ch = new Character('c');
		System.out.println(ch.charValue());
		
		// ���μ��� �˻��ؼ� �˻��Ǹ� �̾��� �˻��Ǿ����ϴ�.
		// ��, ��, �� : �̾�. �达, ������ �˻��Ǿ����ϴ�.
		Character arr[] = {'��', '��', '��'};
		Character firstname = name.charAt(0);
		if(firstname.equals('��')) {
			System.out.println("�̾��� �˻��Ǿ����ϴ�.");
		}
		else if(firstname.equals('��')) {
			System.out.println("�达�� �˻��Ǿ����ϴ�.");
		}
		else if(firstname.equals('��')) {
			System.out.println("������ �˻��Ǿ����ϴ�.");
		}
		else {
			System.out.println("�����ϴ�.");
		}
		
	}

}
