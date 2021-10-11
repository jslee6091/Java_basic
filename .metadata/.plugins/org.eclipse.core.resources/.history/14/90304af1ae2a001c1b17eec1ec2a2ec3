package webdeveloper_one.doitjava.exam;

import java.util.ArrayList;
import java.util.Hashtable;

public class Login {

	public static String userid;
	public static String passwd;
	public static Hashtable userlogin = new Hashtable(InputLogin.users);
	
	public static String getUserid() {
		return userid;
	}
	public static void setUserid(String userid) {
		Login.userid = userid;
	}
	public static String getPasswd() {
		return passwd;
	}
	public static void setPasswd(String passwd) {
		Login.passwd = passwd;
	}
	
	public Login(String userid, String passwd) {
		setUserid(userid);
		setPasswd(passwd);
		
		for(Object key : userlogin.keySet()) {
			ArrayList temp = (ArrayList)userlogin.get(key);
			if(temp.get(0).equals(getUserid()) && temp.get(1).equals(getPasswd())) {
				System.out.println("아이디와 패스워드가 일치합니다");
			}
			else {
				System.out.println("아이디와 패스워드가 일치하지 않습니다");
			}
		}
	}

}
