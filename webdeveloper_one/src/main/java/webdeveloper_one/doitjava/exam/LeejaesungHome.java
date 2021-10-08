package webdeveloper_one.doitjava.exam;

public class LeejaesungHome {

	public String name;
	public int age;
	public String address;
	public String email;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void Homeprint() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("주소 : " + getAddress());
		System.out.println("이메일 : " + getEmail());
		
	}
	public static void main(String[] args) {
		// 이름 나이 주소 이메일 입출력할 수 있는 메소드
		// Homeprint(){ 이름, 나이, 주소, 이메일 입출력할 수 있는 메소드 출력}
		LeejaesungHome ljs = new LeejaesungHome();
		ljs.setName("이재성");
		ljs.setAge(26);
		ljs.setAddress("서울시");
		ljs.setEmail("aa@email.com");
		ljs.Homeprint();
	}

}
