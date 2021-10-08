package webdeveloper_one.java;

public class Casting_1 {

	public static boolean Name(Object name) {
		String nameType = name.getClass().getName(); 
		if(nameType.equals("java.lang.String")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean Age(Object age) {
		String ageType = age.getClass().getName();
		if(ageType.equals("java.lang.Integer")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean Address(Object address) {
		String addressType = address.getClass().getName();
		if(addressType.equals("java.lang.String")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void Allcheck(Object name, Object age, Object address) {
		if(Name(name) && Age(age) && Address(address)) {
			System.out.println("이름 : " + String.valueOf(name));
			System.out.println("나이 : " + (int)age);
			System.out.println("주소 : " + String.valueOf(address));
			System.out.println("회원가입 되었습니다.");
		}
	}
	
	public static void Allcheck2(Object name, Object age, Object address) {
		boolean name2 = name.getClass().getName().equals("java.lang.String");
		boolean age2 = age.getClass().getName().equals("java.lang.Integer");
		boolean address2 = address.getClass().getName().equals("java.lang.String");
		
		if(name2 && age2 && address2) {
			System.out.println("이름 : " + String.valueOf(name));
			System.out.println("나이 : " + (int)age);
			System.out.println("주소 : " + String.valueOf(address));
			System.out.println("회원가입 되었습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		// 캐스팅 종류
		// 문자열 -> 정수
		Integer intvalue = Integer.parseInt("1");
		System.out.println(intvalue.getClass().getName());
		
		// 정수 -> 문자열
		String strvalue = String.valueOf(1);
		System.out.println(strvalue.getClass().getName());
		
		// 본인 나이 + 10 하시오
		Object age = 10;
		Object name = "홍길동";
		String ageType= age.getClass().getName();
		String nameType = name.getClass().getName();
		
		if(nameType.getClass().getName().equals("java.lang.String")) {
			System.out.println("나는 문자열이름");
		}
		
		if(ageType.equals("java.lang.String")) {
			System.out.println("나는 문자열");
		}
		
		if(ageType.equals("java.lang.Integer")) {
			System.out.println("나는 정수");
			
			// 다운 캐스팅 : object -> int
			int agevalue = (int)age;
			
			agevalue = agevalue + 10;
			System.out.println(agevalue);
		}
		
		// 업 캐스팅 : 자식에서 부모형으로
		// 다운 캐스팅 : 부모에서 자식형으로
		
		// 자동 캐스팅 : 자동으로 변환
		// 강제 캐스팅 : 강제적으로 변환
		
		// 문제
		// 이름(str), 나이(int), 주소(str)
		// boolean 이름 메소드 (Objet name) -> 문자열 검색하고 문자면 문자로 캐스팅하고 나서 현재 이름 검색
		// boolean 나이 메소드 (Object age) -> 정수형 검색하고 정수형이면 정수형으로 캐스팅 후 현재 나이 검색
		// boolean 주소 메소드 (Object address) -> 문자열 검색하고 문자면 문자형 캐스팅하고 나서 현재 주소 검색
		// Allcheck(){} : 이름 나이 주소가 맞으면 회원가입 되었습니다.
		Allcheck("이재성", 26, "서울시");
		Allcheck2("이재성", 26, "서울시");
		
	}

}
