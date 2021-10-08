package webdeveloper_one.doitjava;

import java.util.HashMap;

public class InputLoginBean_M {

	public static String name;
	public static int age;
	public static String address;
	public static String email;
	public static String nickname;
	public static HashMap<String, Object> hash = new HashMap();
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		InputLoginBean_M.name = name;
	}
	
	public static int getAge() {
		return age;
	}
	
	public static void setAge(int age) {
		InputLoginBean_M.age = age;
	}
	
	public static String getAddress() {
		return address;
	}
	
	public static void setAddress(String address) {
		InputLoginBean_M.address = address;
	}
	
	public static String getEmail() {
		return email;
	}
	
	public static void setEmail(String email) {
		InputLoginBean_M.email = email;
	}
	
	public static String getNickname() {
		return nickname;
	}
	
	public static void setNickname(String nickname) {
		InputLoginBean_M.nickname = nickname;
	}
	
	public InputLoginBean_M(String name, int age, String address, String email, String nickname) {
		setName(name);
		setAge(age);
		setAddress(address);
		setEmail(email);
		setNickname(nickname);
		
		hash.put("이름", getName());
		hash.put("나이", getAge());
		hash.put("주소", getAddress());
		hash.put("이메일", getEmail());
		hash.put("별명", getNickname());
		
	}

}
