package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class InputLogin_M {

	public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		try {
			System.out.println("�̸� �Է��ϼ���");
			String name = buffer.readLine();

			System.out.println("���� �Է��ϼ���");
			int age = Integer.parseInt(buffer.readLine());

			System.out.println("�ּ� �Է��ϼ���");
			String addr = buffer.readLine();

			System.out.println("�̸��� �Է��ϼ���");
			String email = buffer.readLine();

			System.out.println("���� �Է��ϼ���");
			String nickname = buffer.readLine();

			new InputLoginBean_M(name, age, addr, email, nickname);
			
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� �Է��ϼ���");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (String key : InputLoginBean_M.hash.keySet()) {
			System.out.println(key + " : " + InputLoginBean_M.hash.get(key));
		}
		
//		����� �ڵ�
//		InputLoginBean_M login1 = new InputLoginBean_M("���缺1", 261, "����1", "�̸���@1", "�缺1");
//		InputLoginBean_M login2= new InputLoginBean_M("���缺2", 262, "����2", "�̸���@2", "�缺2");
//		InputLoginBean_M login3= new InputLoginBean_M("���缺3", 263, "����3", "�̸���@3", "�缺3");
//		InputLoginBean_M login4 = new InputLoginBean_M("���缺4", 264, "����4", "�̸���@4", "�缺4");
//		InputLoginBean_M login5 = new InputLoginBean_M("���缺5", 265, "����5", "�̸���@5", "�缺5");
//		
//		InputLoginBean_M input[] = {login1, login2, login3, login4, login5};
//		
//		Hashtable hast = new Hashtable();
//		for(int i = 0; i < input.length; i++) {
//			hast.put(i, input[i]);
//		}
//		
//		for(int i = 0; i < hast.size(); i++) {
//			InputLoginBean_M temp = input[i];
//			System.out.println("�̸� : " + temp.name);
//			System.out.println("���� : " + temp.age);
//			System.out.println("�ּ� : " + temp.address);
//			System.out.println("�̸��� : " + temp.email);
//			System.out.println("���� : " + temp.nickname);	
//		}
		
	}

}
