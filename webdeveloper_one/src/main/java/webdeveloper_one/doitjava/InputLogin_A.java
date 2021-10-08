package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class InputLogin_A {

	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		System.out.println("�̸�, ����, �ּ�, �̸���, ������ ������� �� 5�� �Է��ϼ���");
		try {
			int count = 0;
			while(count++ < 5) {
				InputLoginBean_A login = new InputLoginBean_A(buf.readLine(), Integer.parseInt(buf.readLine()), buf.readLine(), buf.readLine(), buf.readLine());
				arr.add(login);
				System.out.println("�ԷµǾ����ϴ�.");
			}
			System.out.println("======================");
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� �Է��ϼ���");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			InputLoginBean_A temp = (InputLoginBean_A) it.next();
			System.out.println("�̸� : " + temp.name);
			System.out.println("���� : " + temp.age);
			System.out.println("�ּ� : " + temp.address);
			System.out.println("�̸��� : " + temp.email);
			System.out.println("���� : " + temp.nickname);
		}
		
	}

}