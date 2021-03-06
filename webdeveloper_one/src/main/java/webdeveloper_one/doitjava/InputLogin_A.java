package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class InputLogin_A {

	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		System.out.println("이름, 나이, 주소, 이메일, 별명을 순서대로 총 5번 입력하세요");
		try {
			int count = 0;
			while(count++ < 5) {
				InputLoginBean_A login = new InputLoginBean_A(buf.readLine(), Integer.parseInt(buf.readLine()), buf.readLine(), buf.readLine(), buf.readLine());
				arr.add(login);
				System.out.println("입력되었습니다.");
			}
			System.out.println("======================");
			System.out.println("입력이 완료되었습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력하세요");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			InputLoginBean_A temp = (InputLoginBean_A) it.next();
			System.out.println("이름 : " + temp.name);
			System.out.println("나이 : " + temp.age);
			System.out.println("주소 : " + temp.address);
			System.out.println("이메일 : " + temp.email);
			System.out.println("별명 : " + temp.nickname);
		}
		
	}

}
