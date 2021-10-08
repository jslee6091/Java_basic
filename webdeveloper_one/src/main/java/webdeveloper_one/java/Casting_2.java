package webdeveloper_one.java;

import java.util.ArrayList;
import java.util.List;

public class Casting_2 {

	public static void main(String[] args) {
		// 자동 캐스팅, 강제 캐스팅
		// 업 캐스팅, 다운 캐스팅
		// api 단위 캐스팅 안되면 업 캐스팅, 다운 캐스팅

		String name = "이재성";
		int age = 26;

		// 문자열이 제일 크다
		// 빅데이터 : 타입이 없다(문자열)
		// 자동 형변환
		System.out.println(name + age + 10);

		// 문자열 -> 정수
		try {
			int intvalue = Integer.parseInt("하하하");
			System.out.println(intvalue);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 들어가야 합니니다");
		}

		finally {
			// 에러가 나든 안나든 실행
			System.out.println("무조건 실행");
		}

		// 정수 -> 문자열
		String strvalue = String.valueOf(34);
		String.valueOf("hello");

		// ctrl + shift + o : 자동 import
		// ArrayList가 배열보다 속도가 빠르다
		// index : 0부터 시작
//		ArrayList array = new ArrayList();
//		array.add(1);
//		array.add(2);
//		array.add(3);
//		
//		for(int i = 0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}
		
		// 업 캐스팅 : 원래 List로 캐스팅 되는데 이게 보통 생략된다.
		List list = (List) new ArrayList();
		list.add("hello");
		list.add("world");
		
		for (int i = 0; i < list.size(); i++) {
			// 다운 캐스팅 : Object -> String
			String strvalue2 = String.valueOf(list.get(i));
			System.out.println(strvalue2);
		}
		
	}

}
