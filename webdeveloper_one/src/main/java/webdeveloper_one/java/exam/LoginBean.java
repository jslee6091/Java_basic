package webdeveloper_one.java.exam;

import java.util.ArrayList;

public class LoginBean {

	public static void main(String[] args) {
		
		ArrayList<InputLogin> Array = new ArrayList<InputLogin>();
		
		// 이름, 나이, 주소 5개 입력
		Array.add(new InputLogin("이재성", 26, "서울시"));
		Array.add(new InputLogin("대한민국", 70, "한반도"));
		Array.add(new InputLogin("미국", 300, "아메리카"));
		Array.add(new InputLogin("광개토대왕", 1500, "고구려"));
		Array.add(new InputLogin("고래", 4000, "태평양"));
		
		// 찾고자 하는 유저 정보
		InputLogin searchuser = new InputLogin("이재성", 1500, "러시아");
		
		String searchname = "이재성";
		int searchage = 1500;
		String searchaddr = "러시아";
		
		// 이름 검색
		
		
		for(int i = 0; i < Array.size(); i++) {
			if(Array.get(i).userid.equals(searchname)) {
				System.out.println(searchname + " 가입되어있습니다.");
			}
			else if(String.valueOf(Array.get(i).age).equals(String.valueOf(searchage))) {
				System.out.println(searchage + " 가입되어있습니다.");
			}
			else if(Array.get(i).address.equals(searchaddr)) {
				System.out.println(searchaddr + " 가입되어있습니다.");
			}
		}


	}

}
