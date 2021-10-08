package webdeveloper_one.java.child;

public class Child_1 extends Parent{

	@Override
	public boolean equals(Object obj) {
		System.out.println("오버라이딩된 메소드 입니다");
		return true;
	}
	
	// main()은 모든 객체에서 공유해야하므로 static 이다.
	public static void main(String[] args) {
		Child_1 ch = new Child_1();
		ch.equals("amugae");
		
		Parent ch2 = new Child_1();
		// equals는 Parent형이지만 실제 동작은 자식 메소드로 오버라이딩 된다.
		// 부모 타입으로 선언하는 이유 : 
		// 자식 타입으로 선언하면 객체를 많이 생성할 때 선언이 번거로우므로 부모를 이용해 간단히 선언한다.
		ch2.equals(ch2);
	}
}
