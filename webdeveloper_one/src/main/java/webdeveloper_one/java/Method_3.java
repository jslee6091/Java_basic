package webdeveloper_one.java;

public class Method_3 {

	public String movename = "오징어게임";
	public String moveaddress = "대한민국";
	public int moveage = 2021;

	// 기본 생성자 : 인자가 없는 생성자
	public Method_3() {
		System.out.println("기본 생성자입니다");
	}

	// 인자(argument)가 있는 생성자
	public Method_3(String name, String address) {
		System.out.println("이름 : " + name + " 주소 : " + address);
	}

	// get : 값을 얻는다
	// set : 값을 설정, 수정한다
	public String getMovename() {
		return movename;
	}

	public void setMovename(String movename) {
		// 지역 변수와 전역 변수가 이름이 같으면 전역변수에 this. 을 놓아야한다.
		this.movename = movename;
	}

	public String getMoveaddress() {
		return moveaddress;
	}

	public void setMoveaddress(String moveaddress) {
		this.moveaddress = moveaddress;
	}

	public int getMoveage() {
		return moveage;
	}

	public void setMoveage(int moveage) {
		this.moveage = moveage;
	}

	public Method_3(String movename, String moveaddress, int moveage) {
		this.movename = movename;
		this.moveaddress = moveaddress;
		this.moveage = moveage;
	}

	public static void main(String[] args) {

		// 생성자 : 생성자도 괄호가 있으므로 메소드이다.
		// 클래스 타입으로 미리 정해져있다.
		// 어떤 타입들을 받을 때 편하게 받을 수 있다.
		// 기본생성자는 생략 가능하다.
		// 기본생성자는 인자가 있는 생성자가 오면 생략이 불가능하다. (기본 생성자 주석처리하면 에러 발생)

		Method_3 obj = new Method_3();
		obj.setMovename("DP");
		obj.setMoveaddress("한국");
		System.out.println("영화이름 : " + obj.getMovename() + "\n영화주소 : " + obj.getMoveaddress());
		System.out.println("====================================");
		
		Method_3 obj2 = new Method_3("광개토대왕", "고구려");
		obj2.setMovename("컨저링3");
		obj2.setMoveaddress("미국");
		System.out.println("영화이름 : " + obj2.getMovename() + "\n영화주소 : " + obj2.getMoveaddress());
		System.out.println("====================================");
		
		Method_3 obj3 = new Method_3("소스코드", "미국", 2008);
		System.out.println("영화이름 : " + obj3.getMovename() + "\n영화주소 : " + obj3.getMoveaddress() + "\n영화제작연도 : " + obj3.getMoveage());
		
	}

}
