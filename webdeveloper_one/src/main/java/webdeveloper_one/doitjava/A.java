package webdeveloper_one.doitjava;

public class A {

	public static String name = "ȫ�浿";
	
	public void abc() {
		System.out.println("abc �޼ҵ� �Դϴ�");
		System.out.println(name);
	}
	
	// �ν��Ͻ� inner class
	static class B{
		public void def() {
			System.out.println("def �޼ҵ� �Դϴ�");
			System.out.println(name);
		}
		
		static class C{
			public void ghi() {
				System.out.println("ghi �޼ҵ� �Դϴ�");
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		
		// class B, C�� static �϶�
		A.B b = new B();
		b.def();
		
		A.B.C c = new B.C();
		c.ghi();

		// class B, C�� static �ƴҶ�
//		A.B ab = a.new B();
//		ab.def();
//		
//		A.B.C abc = ab.new C();
//		abc.ghi();
	}

}