package webdeveloper_one.java.exam;

public class Home {

	public String name = "이재성";
	public int age= 26;
	public String address= "서울시";
	public String email = "aaaa@naver.com";
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void Home() {
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 주소 : " + getAddress() + " 이메일 : " + getEmail());
	}
	
	public void Home2(String name, int age, String address, String email) {
		System.out.println("이름 : " + name + " 나이 : " + age + " 주소 : " + address + " 이메일 : " + email);	
	}
	public static void main(String[] args) {
		// 이름, 나이, 주소, 이메일 : 전역변수
		// return 메소드
		// void Home() : 이름, 나이, 주소, 이메일 메소드 출력
		// void Home2(이름, 나이, 주소, 이메일) :  출력
		Home obj = new Home();
		obj.Home();
		obj.Home2("홍길동", 300, "조선", "hhh@gmail.com");
	}

}
