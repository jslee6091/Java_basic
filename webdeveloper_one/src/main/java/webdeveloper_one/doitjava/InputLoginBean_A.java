package webdeveloper_one.doitjava;

public class InputLoginBean_A {

	public static String name;
	public static int age;
	public static String address;
	public static String email;
	public static String nickname;
	
	
	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		InputLoginBean_A.name = name;
	}


	public static int getAge() {
		return age;
	}


	public static void setAge(int age) {
		InputLoginBean_A.age = age;
	}


	public static String getAddress() {
		return address;
	}


	public static void setAddress(String address) {
		InputLoginBean_A.address = address;
	}


	public static String getEmail() {
		return email;
	}


	public static void setEmail(String email) {
		InputLoginBean_A.email = email;
	}


	public static String getNickname() {
		return nickname;
	}


	public static void setNickname(String nickname) {
		InputLoginBean_A.nickname = nickname;
	}
	
	public InputLoginBean_A(String name, int age, String address, String email, String nickname) {
		setName(name);
		setAge(age);
		setAddress(address);
		setEmail(email);
		setNickname(nickname);
	}

}
