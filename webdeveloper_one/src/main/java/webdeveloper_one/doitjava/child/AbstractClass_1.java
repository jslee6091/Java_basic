package webdeveloper_one.doitjava.child;

abstract class A {
	abstract void abc();
}

class B extends A {
	@Override
	void abc() {
		System.out.println("overriding method");
	}
}

public class AbstractClass_1 {

	public static void main(String[] args) {
		A a1 = new B();
		B b2 = new B();

		// parents method
		a1.abc();
		// child method(Overriding)
		b2.abc();

	}

}
