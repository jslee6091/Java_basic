package webdeveloper_one.doitjava;

public class Method_1 {

	public static String name = "이재성";
	public static int age = 26;
	public static String address = "서울시";
	
	public String Name() {
		return name;
	}
	
	public int Age() {
		return age;
	}
	
	public void Address() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	
	public void Print() {
		System.out.println("void는 return 타입 필요 없음");
	}
	
	public static void main(String[] args) {
		
		// 변수 : 움직일 수 없다
		// 메소드가 움직인다(동사)
		System.out.println("출력");
		Method_1 mm = new Method_1();
		mm.Print();
		
		// 이름 나이 주소 void Address()로 출력
		mm.Address();
		System.out.println(mm.Age());
		
	}

}