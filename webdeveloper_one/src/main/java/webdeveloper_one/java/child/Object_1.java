package webdeveloper_one.java.child;

import java.io.StreamCorruptedException;

public class Object_1 extends Object {

	String name = "아무개";
	
	// object : 모든 클래스는 반드시 Object를 상속받는다.
	// 모든 클래스의 부모는 Object 이다.
	// 자바에서 클래스는 하나만 상속받을 수 있다(Object 예외)
	// 인터페이스는 무한으로 받을 수 있다.
	// Object를 상속받지 않는 클래스는 자바가 아니다. (native)

	public static void main(String[] args) {
		// Object
		// 모든 클래스의 부모는 Object이다.
		// 부모형은 자식의 형을 가질 수 있다.

		// String strvalue = new String("FreeRTOS");

		// toString() : 실제값을 끄집어낸다
		// System.out.println(strvalue.toString());

		// 게시판 : 타입
		// 자유게시판, 공지사항, 비밀게시판
		
		Object ob = new Object_1();
//		Object name2 = "홍길동";
		System.out.println("ob : " + ob.getClass().getName());
		
		Object obvalue = new String("문자열2");
		System.out.println("obvalue : " + obvalue.getClass().getName());
		
		if(obvalue.equals("문자열2")) {
			System.out.println("obvalue = 문자열2");
		}
		
		Object sd = 24;
		System.out.println("sd : " + sd);
		
		// int는 예약어이기 때문에 클래스 호출 불가
		int age = 10;
		System.out.println("age : " + age);
		// wrapper 클래스
		Integer age2=20;
		int age3 = age2;
		Integer age4 = age;
		System.out.println("age2 : " + age2.getClass().getName());
		System.out.println("age3 : " + age3);
		System.out.println("age4 : " + age4 + " type : " + age4.getClass().getName());
		
		Object intvalue = new Integer(1);
		System.out.println("intvalue : " + intvalue.getClass().getName());
		
		
		if(intvalue.equals(1)) {
			System.out.println("정수형입니다");
		}
	}

}
