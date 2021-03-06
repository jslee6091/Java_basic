package webdeveloper_one.doitjava;

public class Constructor_2 extends Parent_1{

	public String name;
	
	public Constructor_2() {
		// 기본생성자로 점프
		this("이름");
		System.out.println("기본생성자");
	}
	
	public Constructor_2(String name) {
		// 부모에 있는 기본 생성자로 점프
		super();
		System.out.println(name + "기본 생성자에서 점프한 생성자");
	}
	
	public void Upmethod() {
		super.Parentmethod();
		System.out.println("자식에 있는 Upmethod()");
	}
	
	@Override
	// annotation(Override 겹쳐썼다)
	// override : 메소드이름(argument 개수, argument type) -> 오버라이딩 아니면 오버로딩
	public void Overmethod() {
		System.out.println("자식에 있는 Overmethod()");
	}

	public static void main(String[] args) {
		Constructor_2 con = new Constructor_2();
		con.Upmethod();
		con.Overmethod();
	}
}
