package webdeveloper_one.java.child;

// exxtends : 같은것, class <- class, interface <- interface
// implements : 틀린것, class <- interface

// override : 같은 이름의 메소드나 변수를 자식에서 재정의하는 것
// 이름, 리턴타입, 타입, 인자개수가 자식에 있으면 재정의
// 이름, 리턴타입, 타입, 인자개수가 자식에서 같지 않으면 오버로딩

public class Childcommon implements BaseCommon{

	String name = "이재성";
	
	@Override // 어노니테이션 : 오버라이딩 하겠다는 뜻
	public void C501(String classname) {
		System.out.println("C501");	
	}
	
	@Override
	public void C502(String classname) {
		System.out.println("C502");
	}
	
	@Override
	public void C503(String classname) {
		System.out.println("C503");	
	}

	public static void main(String[] args) {
		// class : 객체 생성 되고 몸체 구현
		// class : 하는 역할은 실행만 하는 곳
		
		Childcommon ch = new Childcommon();
		System.out.println(ch.name);
		ch.C501("신입_1");
		ch.C502("신입_2");
		ch.C503("신입_3");
	}

}
