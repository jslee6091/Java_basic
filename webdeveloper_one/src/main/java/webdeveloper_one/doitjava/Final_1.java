package webdeveloper_one.doitjava;

public class Final_1 {

	public static final String name = "전역이름";
	
	public static void main(String[] args) {
		final String name = "홍길동";
//		name = "아무개";
		System.out.println(name);
		System.out.println(Final_1.name);
		
//		Final_1.name = "오징어";

	}

}
