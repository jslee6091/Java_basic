package webdeveloper_one.java;

import java.util.ArrayList;
import java.util.List;

public class Casting_2 {

	public static void main(String[] args) {
		// �ڵ� ĳ����, ���� ĳ����
		// �� ĳ����, �ٿ� ĳ����
		// api ���� ĳ���� �ȵǸ� �� ĳ����, �ٿ� ĳ����

		String name = "���缺";
		int age = 26;

		// ���ڿ��� ���� ũ��
		// ������ : Ÿ���� ����(���ڿ�)
		// �ڵ� ����ȯ
		System.out.println(name + age + 10);

		// ���ڿ� -> ����
		try {
			int intvalue = Integer.parseInt("������");
			System.out.println(intvalue);
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� ���� �մϴϴ�");
		}

		finally {
			// ������ ���� �ȳ��� ����
			System.out.println("������ ����");
		}

		// ���� -> ���ڿ�
		String strvalue = String.valueOf(34);
		String.valueOf("hello");

		// ctrl + shift + o : �ڵ� import
		// ArrayList�� �迭���� �ӵ��� ������
		// index : 0���� ����
//		ArrayList array = new ArrayList();
//		array.add(1);
//		array.add(2);
//		array.add(3);
//		
//		for(int i = 0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}
		
		// �� ĳ���� : ���� List�� ĳ���� �Ǵµ� �̰� ���� �����ȴ�.
		List list = (List) new ArrayList();
		list.add("hello");
		list.add("world");
		
		for (int i = 0; i < list.size(); i++) {
			// �ٿ� ĳ���� : Object -> String
			String strvalue2 = String.valueOf(list.get(i));
			System.out.println(strvalue2);
		}
		
	}

}
