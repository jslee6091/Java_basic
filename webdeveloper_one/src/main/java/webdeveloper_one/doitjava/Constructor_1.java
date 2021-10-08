package webdeveloper_one.doitjava;

public class Constructor_1 {

	public String name;
	public int age;
	public String address;
	public String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Constructor_1() {
		System.out.println("기본 생성자");
	}
	
	public Constructor_1(String name, int age, String address, String email) {
		// application : 콘솔 -> 응용프로그램
		// web + application : 브라우저 : safari, chrome, opera, firefox ... -> 웹 애플리케이션
		// 매개변수 : 해당하는 지역변수 (app, web)
		// 인자(argument) : application
		// parameter : web + application
		// 지역변수와 전역변수의 이름이 같으면 반드시 전역변수 this.전역변수
		setName(name);
		setAge(age);
		setAddress(address);
		setEmail(email);
	}
	
	public static void main(String[] args) {
		// 기본생성자는 생략 가능
		// 이미 클래스 타입이 있다

		// 5개 이름, 나이, 주소, 이메일 입력 => new 5개
		// 5개 이름, 나이, 주소, 이메일을 메소드를 통해서 출력하시오
		Constructor_1 con1 = new Constructor_1("이재성", 26, "서울시", "a@gmail.com");
		Constructor_1 con2 = new Constructor_1("아무개", 55, "미국", "aa@email.com");
		Constructor_1 con3 = new Constructor_1("홍길동", 100, "영국", "aaa@email.com");
		Constructor_1 con4 = new Constructor_1("이순신", 400, "조선", "aaaa@email.com");
		Constructor_1 con5 = new Constructor_1("김김김", 1000, "제주", "aaaaa@email.com");
		
		Constructor_1 arr[] = {con1, con2, con3, con4, con5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("이름 : " + arr[i].getName());
			System.out.println("나이 : " + arr[i].getAge());
			System.out.println("주소 : " + arr[i].getAddress());
			System.out.println("이메일 : " + arr[i].getEmail());
			System.out.println("--------------------------------");
		}
		
	}

}
