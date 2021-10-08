package webdeveloper_one.java;

// public : 누구나 접근 가능
// protected : 해당 패키지만 접근 가능
// private : 현재 클래스에서만 접근 가능

// 형식 : 접근 제한자 class 클래스명{}
public class Java_1 {
	// 전역변수
	public String name = "홍길동";
	public int age = 26;
	public String address = "서울시 성동구";
	
	// jvm 호출하는 main() 메소드
	public static void main(String[] args) {
		// local variable(지역변수) : 괄호가 닫히면 값이 소멸
		String name = "이재성";
		System.out.println("이름 : " + name);
		
		// 객체 obj
		// new : 객체 생성 예약어
		// new : 가비지컬렉터 = 메모리에서 쓰지 않는 객체를 자동 소멸(release)
		Java_1 obj = new Java_1();
		System.out.println("전역 name : " + obj.name);
		System.out.println("전역 age : " + obj.age);
		System.out.println("전역 address : " + obj.address);
		
		
		// 객체지향언어 : c, c++, java, c#
		// 객체지향언어는 큰 개념에서 작은 것 순서이다.
		// 지구.대한민국.서울.서초구.양재동.66-3.5층.502호
	}

}
