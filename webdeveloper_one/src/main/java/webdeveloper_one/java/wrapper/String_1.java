package webdeveloper_one.java.wrapper;

// import : 패키지 받기
// java.lang 패키지에 있는 것은 생략 가능
import java.lang.String;

public class String_1 {

	public static void main(String[] args) {
		String name = "이재성";
		System.out.println(name);
		
		name = name.replace('이' , '김');
		System.out.println(name);
		
		String newname = name.substring(1, 3);
		System.out.println(newname);
		
		char[] namechar = name.toCharArray();
		for(int i = 0; i < namechar.length; i++) {
			System.out.print(namechar[i] + " ");
		}
		System.out.println();
		
		String name2 = new String(" 이순신 ");
		// 문자열 값을 꺼낸다
		System.out.println(name2.toString() + " length : " + name2.length());
		System.out.println(name2.trim() + " length : " + name2.trim().length());
		System.out.println(String.valueOf(namechar));
	}

}
