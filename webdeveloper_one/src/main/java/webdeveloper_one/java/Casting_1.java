package webdeveloper_one.java;

public class Casting_1 {

	public static boolean Name(Object name) {
		String nameType = name.getClass().getName(); 
		if(nameType.equals("java.lang.String")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean Age(Object age) {
		String ageType = age.getClass().getName();
		if(ageType.equals("java.lang.Integer")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean Address(Object address) {
		String addressType = address.getClass().getName();
		if(addressType.equals("java.lang.String")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void Allcheck(Object name, Object age, Object address) {
		if(Name(name) && Age(age) && Address(address)) {
			System.out.println("�̸� : " + String.valueOf(name));
			System.out.println("���� : " + (int)age);
			System.out.println("�ּ� : " + String.valueOf(address));
			System.out.println("ȸ������ �Ǿ����ϴ�.");
		}
	}
	
	public static void Allcheck2(Object name, Object age, Object address) {
		boolean name2 = name.getClass().getName().equals("java.lang.String");
		boolean age2 = age.getClass().getName().equals("java.lang.Integer");
		boolean address2 = address.getClass().getName().equals("java.lang.String");
		
		if(name2 && age2 && address2) {
			System.out.println("�̸� : " + String.valueOf(name));
			System.out.println("���� : " + (int)age);
			System.out.println("�ּ� : " + String.valueOf(address));
			System.out.println("ȸ������ �Ǿ����ϴ�.");
		}
	}
	
	
	public static void main(String[] args) {
		// ĳ���� ����
		// ���ڿ� -> ����
		Integer intvalue = Integer.parseInt("1");
		System.out.println(intvalue.getClass().getName());
		
		// ���� -> ���ڿ�
		String strvalue = String.valueOf(1);
		System.out.println(strvalue.getClass().getName());
		
		// ���� ���� + 10 �Ͻÿ�
		Object age = 10;
		Object name = "ȫ�浿";
		String ageType= age.getClass().getName();
		String nameType = name.getClass().getName();
		
		if(nameType.getClass().getName().equals("java.lang.String")) {
			System.out.println("���� ���ڿ��̸�");
		}
		
		if(ageType.equals("java.lang.String")) {
			System.out.println("���� ���ڿ�");
		}
		
		if(ageType.equals("java.lang.Integer")) {
			System.out.println("���� ����");
			
			// �ٿ� ĳ���� : object -> int
			int agevalue = (int)age;
			
			agevalue = agevalue + 10;
			System.out.println(agevalue);
		}
		
		// �� ĳ���� : �ڽĿ��� �θ�������
		// �ٿ� ĳ���� : �θ𿡼� �ڽ�������
		
		// �ڵ� ĳ���� : �ڵ����� ��ȯ
		// ���� ĳ���� : ���������� ��ȯ
		
		// ����
		// �̸�(str), ����(int), �ּ�(str)
		// boolean �̸� �޼ҵ� (Objet name) -> ���ڿ� �˻��ϰ� ���ڸ� ���ڷ� ĳ�����ϰ� ���� ���� �̸� �˻�
		// boolean ���� �޼ҵ� (Object age) -> ������ �˻��ϰ� �������̸� ���������� ĳ���� �� ���� ���� �˻�
		// boolean �ּ� �޼ҵ� (Object address) -> ���ڿ� �˻��ϰ� ���ڸ� ������ ĳ�����ϰ� ���� ���� �ּ� �˻�
		// Allcheck(){} : �̸� ���� �ּҰ� ������ ȸ������ �Ǿ����ϴ�.
		Allcheck("���缺", 26, "�����");
		Allcheck2("���缺", 26, "�����");
		
	}

}
