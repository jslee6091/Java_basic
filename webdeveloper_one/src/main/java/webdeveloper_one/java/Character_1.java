package webdeveloper_one.java;

public class Character_1 {

	public static void main(String[] args) {
		
		// char(Character) 문자를 나타낼때 싱글쿼터로 감싼다
		// 문자 + 문자 -> 문자열
		
		char charvalue = '왜';
		char charvalue2 = '스';
		char charvalue3 = '김';
		
		System.out.println(charvalue);
		System.out.println(charvalue2);
		System.out.println(charvalue3);
		
		System.out.println("=============================================");
		
		String name = "이재성";
		for (int i = 0; i < name.length(); i++) {
			char char1 = name.charAt(i);
			System.out.println(char1);
		}
		
		Character ch = new Character('c');
		System.out.println(ch.charValue());
		
		// 본인성을 검색해서 검색되면 이씨가 검색되었습니다.
		// 이, 김, 오 : 이씨. 김씨, 오씨가 검색되었습니다.
		Character arr[] = {'김', '이', '오'};
		Character firstname = name.charAt(0);
		if(firstname.equals('이')) {
			System.out.println("이씨가 검색되었습니다.");
		}
		else if(firstname.equals('김')) {
			System.out.println("김씨가 검색되었습니다.");
		}
		else if(firstname.equals('오')) {
			System.out.println("오씨가 검색되었습니다.");
		}
		else {
			System.out.println("없습니다.");
		}
		
	}

}
