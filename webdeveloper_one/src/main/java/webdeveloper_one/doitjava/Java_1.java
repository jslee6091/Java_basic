package webdeveloper_one.doitjava;

public class Java_1 {

	// jvm에서 main 호출(call) 한다
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("world");
		
		// 변수 : 저장하기 위한 것
		// 자바는 call by value만 있다.
		// 값을 이동시킨다
		// 컴파일 후 실행 속도 빠름
		// c, c++, c# : call by reference(포인터, 가리키기)
		// 변수 : 오른쪽에서 왼쪽으로 간다 (실제값이 이동)
		// 더블 쿼터 : 문자열을 나타낸다
		// 문자 : 문자가 모이면 문자열(자바)
		String strvalue = "이재성";
		System.out.println("이름 : " + strvalue);
		
		// 자바에서의 변수 선언
		String name;
		// 초기화
		name = "홍길동";
		
		System.out.println("이름 : " + name);
		
		String email,address;
		email = "1234@naver.com";
		address = "서울시";
		
		System.out.println("email : " + email + ", address : " + address);
		
		// 초기화 : 주소값에 갔더니 null이 있다.
		// 빈공간만 만들고 싶을 때
		String nullvalue = null;
		System.out.println("null : " + nullvalue);
		
		// System.out.println(); = 출력하면서 줄바꿈
		// System.out.print(); = 출력하면서 줄바꿈은 하지 않음
		System.out.print("줄바꿈 x");
		// 문자 : 바이트가 아니라 문자에 따라 맞추어짐
		// 영어 : 1바이트, 한글 : 2바이트
		// 예약어(int, public, static, void 등등)는 변수명, 클래스명, 메소드명으로 쓸 수 없다.
		
		// 정수 : 0 ~ 10 정수형
		// 자바에서 정수형은 int 형으로 받는다
		int age = 10;
		age = age + 10;
		age += 10;
		
		System.out.println("정수형 : " + age);
		
		// 상수 : final 변수, 메소드, 클래스
		// 상수는 값을 움직일 수 없고 상속이 안됨
		// 원시 타입 클래스 모두 final String, Integer, Long, Double...
//		final int age2 = 0;
//		age2 = 3;
//		System.out.println("상수 나이 : " + age2);
		// Java는 주소가 없고 객체만 있다, 객체로만 찾는다
		
		// 자바에서 문자는 char(Character)이다.
		// 자바에서 문자는 싱글쿼터로 묶는다
		char charvalue1 = 'a';
		char charvalue2 = 'b';
		char charvalue3 = 'c';
		
		System.out.println("문자1 : " + charvalue1);
		System.out.println("문자2 : " + charvalue2);
		System.out.println("문자3 : " + charvalue3);
		
		String name2 = "이재성";
		
		
		// 지역변수 : 해당하는 괄호문이 닫히면 소멸한다.
		// 전역변수 : 값이 당분간 유지된다.(객체가 살아있을 때)
	}

}
