package webdeveloper_one.doitjava.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 본인 이름 나이 주소를 입출력 통해서 이름이면 이름, 나이면 나이, 주소면 주소를 출력
public class HomeAddress {

	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static String name;
	public static int age;
	public static String address;
	
	public static void Name() throws Exception {
		System.out.println("이름 : " + name);
	}
	
	public static void Age() throws Exception {
		System.out.println("나이 : " + age);
	}
	
	public static void Address() throws Exception {
		System.out.println("주소 : " + address);
	}
	
	public HomeAddress() {
		name = "이재성";
		age = 26;
		address = "서울시";
	}
	
	public static void main(String[] args) throws Exception {
		
		new HomeAddress();
		
		String temp = "";
		while(temp != null) {
			System.out.println("이름, 나이, 주소, exit 중 하나를 선택하여 입력하세요");
			temp = buf.readLine();
			
			if(temp.equals("이름")) {
				Name();
			}
			else if(temp.equals("나이")) {
				Age();
			}
			else if(temp.equals("주소")) {
				Address();
			}
			else if(temp.equals("exit")) {
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
			else {
				System.out.println("다시 입력하세요");
			}
			System.out.println("==============================================");
		}
	}

}
