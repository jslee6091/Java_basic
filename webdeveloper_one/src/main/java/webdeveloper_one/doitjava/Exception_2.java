package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_2 {

	public void Print() {
		
		// 부모형의 에러클래스가 나오면 자식에 에러클래스는 올 수 없다
		// Exception 오면 그 다음부터 에러 자식 클래스 올 수 없다
		try {
			// Exception : 모든 예외 상황의 부모
			// 부모이기 때문에 모든 에러 처리 가능
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String temp = "";
			while (temp != null) {
				temp = buffer.readLine();
			}
		} catch (IOException e) {
			new Exception("Error message");
		} catch (Exception e) {
			// TODO : hello
		} finally {
			System.out.println("Error 상관없이 무조건 실행");
		}

	}

	// 해당하는 메소드를 호출하면(call) 호출하는 곳에서도 에러 처리 해야함
	public static String Name() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		while (temp != null) {
			temp = buffer.readLine();
			if(temp.equals("exit")) {
				// 프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			System.out.println(temp);
		}
		return "홍길동";
	}
	
	// 메소드는 스스로 호출하지못함
	// java에서 main은 jvm이 호출
	// java -> jvm 이 해석한다(번지수 x, 객체)
	// java 은닉화 캡슐화
	// java 재사용성 -> 자바의 공통
	public static void main(String[] args) throws Exception {
		// Exception_2.Name() 에서 Exception이 발생할 수 있으므로 호출하는 main()에서도 Exception처리 해줘야함
		// throws 또는 try/catch
		try {
			Exception_2.Name();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
