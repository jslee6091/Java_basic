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
			System.out.println("�α����� �����մϴ�.");
			
			System.out.println("���̵� �Է��ϼ���");
			String id = buff.readLine();
			
			System.out.println("�н����带 �Է��ϼ���");
			String pw = buff.readLine();
			
			while(id.equals("") || pw.equals("")) {
				System.out.println("�ٽ� �α����� �����մϴ�.");
				
				System.out.println("���̵� �Է��ϼ���");
				id = buff.readLine();
				
				System.out.println("�н����带 �Է��ϼ���");
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
			System.out.println("ȸ�������� �����մϴ�");
			
			System.out.println("���̵� �Է��ϼ���");
			String id = buff.readLine();
			while(id.equals("")) {
				System.out.println("�ٽ� ���̵� �Է��ϼ���");
				id = buff.readLine();
				
			}
			
			System.out.println("�н����带 �Է��ϼ���");
			String pw = buff.readLine();
			while(pw.equals("")) {
				System.out.println("�ٽ� �н����带 �Է��ϼ���");
				pw = buff.readLine();
				
			}
			
			
			System.out.println("�̸����� �Է��ϼ���");
			String email = buff.readLine();
			while(email.equals("")) {
				System.out.println("�ٽ� �̸����� �Է��ϼ���");
				email = buff.readLine();
				
			}
			
			
			
			System.out.println("�ּҸ� �Է��ϼ���");
			String addr = buff.readLine();
			while(addr.equals("")) {
				System.out.println("�ٽ� �ּҸ� �Է��ϼ���");
				addr = buff.readLine();
				
			}
			
			
			System.out.println("repasswd�� �Է��ϼ���");
			String repw = buff.readLine();
			while(!repw.equals(pw)) {
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
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