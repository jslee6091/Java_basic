package webdeveloper_one.doitjava.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class ShopManager {

	public static HashMap user = new HashMap();
	public static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

	public static void Login() {
		
		try {
			System.out.println("로그인을 진행합니다.");
			
			System.out.println("아이디를 입력하세요");
			String id = buff.readLine();
			
			System.out.println("패스워드를 입력하세요");
			String pw = buff.readLine();
			
			while(id.equals("") || pw.equals("")) {
				System.out.println("다시 로그인을 진행합니다.");
				
				System.out.println("아이디를 입력하세요");
				id = buff.readLine();
				
				System.out.println("패스워드를 입력하세요");
				pw = buff.readLine();
			}
			
			new Login(id, pw);
			System.out.println("========================");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void InputLogin() {
		try {
			System.out.println("회원가입을 진행합니다");
			
			System.out.println("아이디를 입력하세요");
			String id = buff.readLine();
			while(id.equals("")) {
				System.out.println("다시 아이디를 입력하세요");
				id = buff.readLine();
				
			}
			
			System.out.println("패스워드를 입력하세요");
			String pw = buff.readLine();
			while(pw.equals("")) {
				System.out.println("다시 패스워드를 입력하세요");
				pw = buff.readLine();
				
			}
			
			
			System.out.println("이메일을 입력하세요");
			String email = buff.readLine();
			while(email.equals("")) {
				System.out.println("다시 이메일을 입력하세요");
				email = buff.readLine();
				
			}
			
			
			
			System.out.println("주소를 입력하세요");
			String addr = buff.readLine();
			while(addr.equals("")) {
				System.out.println("다시 주소를 입력하세요");
				addr = buff.readLine();
				
			}
			
			
			System.out.println("repasswd를 입력하세요");
			String repw = buff.readLine();
			while(!repw.equals(pw)) {
				System.out.println("비밀번호가 맞지 않습니다. 다시 입력하세요");
				repw = buff.readLine();
				
			}
			
			new InputLogin(id, pw, email, addr, repw);
			System.out.println("========================");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ShopManager.InputLogin();
		ShopManager.Login();
	}

}
