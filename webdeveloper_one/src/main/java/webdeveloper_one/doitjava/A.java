package webdeveloper_one.doitjava;

public class A {

	public static String name = "홍길동";
	
	public void abc() {
		System.out.println("abc 메소드 입니다");
		System.out.println(name);
	}
	
	// 인스턴스 inner class
	static class B{
		public void def() {
			System.out.println("def 메소드 입니다");
			System.out.println(name);
		}
		
		static class C{
			public void ghi() {
				System.out.println("ghi 메소드 입니다");
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		
		// class B, C가 static 일때
		A.B b = new B();
		b.def();
		
		A.B.C c = new B.C();
		c.ghi();

		// class B, C가 static 아닐때
//		A.B ab = a.new B();
//		ab.def();
//		
//		A.B.C abc = ab.new C();
//		abc.ghi();
	}

}
