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
			System.out.println("이름 입력하세요");
			String name = buffer.readLine();

			System.out.println("나이 입력하세요");
			int age = Integer.parseInt(buffer.readLine());

			System.out.println("주소 입력하세요");
			String addr = buffer.readLine();

			System.out.println("이메일 입력하세요");
			String email = buffer.readLine();

			System.out.println("별명 입력하세요");
			String nickname = buffer.readLine();

			new InputLoginBean_M(name, age, addr, email, nickname);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력하세요");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (String key : InputLoginBean_M.hash.keySet()) {
			System.out.println(key + " : " + InputLoginBean_M.hash.get(key));
		}
		
//		강사님 코드
//		InputLoginBean_M login1 = new InputLoginBean_M("이재성1", 261, "서울1", "이메일@1", "재성1");
//		InputLoginBean_M login2= new InputLoginBean_M("이재성2", 262, "서울2", "이메일@2", "재성2");
//		InputLoginBean_M login3= new InputLoginBean_M("이재성3", 263, "서울3", "이메일@3", "재성3");
//		InputLoginBean_M login4 = new InputLoginBean_M("이재성4", 264, "서울4", "이메일@4", "재성4");
//		InputLoginBean_M login5 = new InputLoginBean_M("이재성5", 265, "서울5", "이메일@5", "재성5");
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
//			System.out.println("이름 : " + temp.name);
//			System.out.println("나이 : " + temp.age);
//			System.out.println("주소 : " + temp.address);
//			System.out.println("이메일 : " + temp.email);
//			System.out.println("별명 : " + temp.nickname);	
//		}
		
	}

}
