package webdeveloper_one.java.child;

import java.io.StreamCorruptedException;

public class Object_1 extends Object {

	String name = "�ƹ���";
	
	// object : ��� Ŭ������ �ݵ�� Object�� ��ӹ޴´�.
	// ��� Ŭ������ �θ�� Object �̴�.
	// �ڹٿ��� Ŭ������ �ϳ��� ��ӹ��� �� �ִ�(Object ����)
	// �������̽��� �������� ���� �� �ִ�.
	// Object�� ��ӹ��� �ʴ� Ŭ������ �ڹٰ� �ƴϴ�. (native)

	public static void main(String[] args) {
		// Object
		// ��� Ŭ������ �θ�� Object�̴�.
		// �θ����� �ڽ��� ���� ���� �� �ִ�.

		// String strvalue = new String("FreeRTOS");

		// toString() : �������� �������
		// System.out.println(strvalue.toString());

		// �Խ��� : Ÿ��
		// �����Խ���, ��������, ��аԽ���
		
		Object ob = new Object_1();
//		Object name2 = "ȫ�浿";
		System.out.println("ob : " + ob.getClass().getName());
		
		Object obvalue = new String("���ڿ�2");
		System.out.println("obvalue : " + obvalue.getClass().getName());
		
		if(obvalue.equals("���ڿ�2")) {
			System.out.println("obvalue = ���ڿ�2");
		}
		
		Object sd = 24;
		System.out.println("sd : " + sd);
		
		// int�� ������̱� ������ Ŭ���� ȣ�� �Ұ�
		int age = 10;
		System.out.println("age : " + age);
		// wrapper Ŭ����
		Integer age2=20;
		int age3 = age2;
		Integer age4 = age;
		System.out.println("age2 : " + age2.getClass().getName());
		System.out.println("age3 : " + age3);
		System.out.println("age4 : " + age4 + " type : " + age4.getClass().getName());
		
		Object intvalue = new Integer(1);
		System.out.println("intvalue : " + intvalue.getClass().getName());
		
		
		if(intvalue.equals(1)) {
			System.out.println("�������Դϴ�");
		}
	}

}
