package webdeveloper_one.doitjava.exam;

import java.util.ArrayList;
import java.util.Hashtable;

public class InputLogin {

	public static String userid;
	public static String passwd;
	public static String email;
	public static String address;
	public static String repasswd;
	public static Hashtable users = new Hashtable();
	
	
	public static String getUserid() {
		return userid;
	}


	public static void setUserid(String userid) {
		InputLogin.userid = userid;
	}


	public static String getPasswd() {
		return passwd;
	}


	public static void setPasswd(String passwd) {
		InputLogin.passwd = passwd;
	}


	public static String getEmail() {
		return email;
	}


	public static void setEmail(String email) {
		InputLogin.email = email;
	}


	public static String getAddress() {
		return address;
	}


	public static void setAddress(String address) {
		InputLogin.address = address;
	}


	public static String getRepasswd() {
		return repasswd;
	}


	public static void setRepasswd(String repasswd) {
		InputLogin.repasswd = repasswd;
	}


	public InputLogin(String userid, String passwd, String email, String address, String repasswd) {
		setUserid(userid);
		setPasswd(passwd);
		setEmail(email);
		setAddress(address);
		setRepasswd(repasswd);
		
		ArrayList info = new ArrayList();
		info.add(getUserid());
		info.add(getPasswd());
		info.add(getEmail());
		info.add(getAddress());
		info.add(getRepasswd());
		
		users.put(users.size(), info);
		System.out.println("회원가입 되었습니다");
		
	}
	
}
