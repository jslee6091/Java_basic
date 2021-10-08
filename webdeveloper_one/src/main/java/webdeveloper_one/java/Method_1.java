package webdeveloper_one.java;

public class Method_1 {

	public String name = "홍길동";
	public int age = 266;
	public String address = "인천시";
	
	// 메소드 형식 : 접근제한자 리턴타입 메소드명() {return 리턴타입}
	public String Name() {
		return name;
	}
	
	public int Age() {
		return age;
	}
	
	public String Address() {
		return address;
	}
	
	public static void main(String[] args) {
		// 변수 : 괄호가 없다, 하나의 값만 갖는다, 저장공간이 됨
		// 메소드 : 동사이다(변수는 명사), 괄호가 있다
		String name = "이재성";
		int age = 26;
		String address = "서울시 성동구";
		
		Method_1 obj = new Method_1();
		
		// 지역변수 : 이름, 나이, 주소 출력
		// 전역변수 : 이름, 나이, 주소 출력
		// 이름, 나이, 주소 메소드 출력
		
		System.out.println("=========지역변수===========");
		System.out.println("지역 name : " + name);
		System.out.println("지역 age : " + age);
		System.out.println("지역 address: " + address);
		
		System.out.println("=========전역변수===========");
		System.out.println("전역 name : " + obj.name);
		System.out.println("전역 age : " + obj.age);
		System.out.println("전역 address : " + obj.address);
		
		System.out.println("=========메소드===========");
		System.out.println("메소드 name: " + obj.Name());
		System.out.println("메소드 age : " + obj.Age());
		System.out.println("메소드 address : " + obj.Address());

	}

}
