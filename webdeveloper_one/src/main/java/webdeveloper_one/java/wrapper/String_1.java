package webdeveloper_one.java.wrapper;

// import : ��Ű�� �ޱ�
// java.lang ��Ű���� �ִ� ���� ���� ����
import java.lang.String;

public class String_1 {

	public static void main(String[] args) {
		String name = "���缺";
		System.out.println(name);
		
		name = name.replace('��' , '��');
		System.out.println(name);
		
		String newname = name.substring(1, 3);
		System.out.println(newname);
		
		char[] namechar = name.toCharArray();
		for(int i = 0; i < namechar.length; i++) {
			System.out.print(namechar[i] + " ");
		}
		System.out.println();
		
		String name2 = new String(" �̼��� ");
		// ���ڿ� ���� ������
		System.out.println(name2.toString() + " length : " + name2.length());
		System.out.println(name2.trim() + " length : " + name2.trim().length());
		System.out.println(String.valueOf(namechar));
	}

}
