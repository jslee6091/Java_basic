package webdeveloper_one.doitjava;

public class Method_2 {

	public String name;
	public int age;
	public String address;
	
	
	// alt + shift + s -> generate getters and setters
	// get : 값을 얻는다
	// set : 값을 입력, 수정, 삭제
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public void Home(String name, int age, String address) {
		System.out.println("이름 : " + name + " 나이 : " + age + " 주소 : " + address);
	}
	
	public void Home() {
		System.out.println("이름이 같아도 인자갯수와 타입이 틀리면 오버로딩");
	}

	public static void main(String[] args) {
		Method_2 me = new Method_2();
		me.Home("아무개", 20, "안산");
		me.setName("이재성");
		me.setAddress("서울시");
		me.setAge(26);

		System.out.println(me.name);
		System.out.println(me.age);
		System.out.println(me.address);
		
	}

}
