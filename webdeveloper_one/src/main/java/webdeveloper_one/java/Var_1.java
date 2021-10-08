package webdeveloper_one.java;

// 클래스는 자바에서 실행할 수 있는 곳이다.
public class Var_1 {

	// main() : 자바 jvm에서 호출
	public static void main(String[] args) {
		// 변수 : 변할 수 있음
		// 변수는 오른쪽에서 왼쪽으로
		// 자바는 call by value만 있다.
		// call by reference(포인터)는 자바에 없다.

		// 출력
		System.out.println("말을 한다");

		// String : 문자열타입에 대한 자바 타입 선언
		// 자바에서 문자열은 더블쿼터쌍으로 이루어진다.
		// 변수이기 때문에 변할 수 있고 오른쪽에서 왼쪽으로 간다
		// 변수 <-> 상수
		String name = "이재성";
		name = "홍길동";
		System.out.println("이름은 : " + name);

		String address = "서울시 성동구";
		System.out.println("주소는 : " + address);

		// 인텔리전스: 자동완성기능
		address = "하와이";
		System.out.println("주소는 : " + address);

	}

}
