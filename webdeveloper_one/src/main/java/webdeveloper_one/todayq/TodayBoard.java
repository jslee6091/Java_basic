package webdeveloper_one.todayq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;

public class TodayBoard {

	public String name;
	public int age;
	public String address;
	public String userid;
	public String passwd;
	public String email;
	public String title;
	public String writer;
	public String date;
	public int visitors;
	public String details;
	public static int usernumber = 0;
	public static int boardnumber = 0;
	public static String loginid;
	public static String loginpasswd;
	
	// ȸ�� ���� ���� ex) 1 : {�̸�, ����, �ּ�, ���̵�, �н�����}
	public static Hashtable userinfo = new Hashtable();
	
	// �Խù� ���� : ����, �ۼ���, ��¥, ��ȸ��
	public static Hashtable boardinfo = new Hashtable();
	
	// �Խù� �������� ���� ex) 1 : {����, �ۼ���, ��¥, ��ȸ��}
	public static Hashtable hast = new Hashtable();
	
	public static File Listfile = new File("C:\\project\\work\\jwork\\webdeveloper_one\\src\\main\\java\\webdeveloper_one\\todayq\\List.txt");
	public static File Searchfile = new File("C:\\project\\work\\jwork\\webdeveloper_one\\src\\main\\java\\webdeveloper_one\\todayq\\Search.txt");
	public static File Readfile = new File("C:\\project\\work\\jwork\\webdeveloper_one\\src\\main\\java\\webdeveloper_one\\todayq\\Read.txt");
	
	public static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	
	
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getVisitors() {
		return visitors;
	}
	public void setVisitors(int visitors) {
		this.visitors = visitors;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public TodayBoard(String name, int age, String address, String userid, String email, String passwd) {
		setName(name);
		setAge(age);
		setAddress(address);
		setUserid(userid);
		setEmail(email);
		
		try {
			while(!Checkpasswd(passwd)) {
				System.out.println("��й�ȣ�� �ߺ��Ǿ����ϴ�. �ٽ� �Է��ϼ���");
			
				passwd = buff.readLine();
			}
			setPasswd(passwd);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public TodayBoard(String title, String writer, String date, int visitor, String detail) {
		setTitle(title);
		setWriter(writer);
		setDate(date);
		setVisitors(visitor);
		setDetails(detail);
	}
	
	public static boolean Checkpasswd(String password) {
		boolean check = true;
		for(Object key : userinfo.keySet()) {
			TodayBoard temp = (TodayBoard)userinfo.get(key);
			if(password.equals(temp.getPasswd())) {
				check = false;
				break;
			}
		}
		
		return check;
	}
	
	public static void Signup() {
		try {
			ArrayList signup = new ArrayList();
			System.out.println("ȸ������ �����մϴ�");
			
			System.out.println("�̸�, ����, �ּ�, ���̵�, �̸���, �н����� ������� �Է�");
			userinfo.put(usernumber, new TodayBoard(buff.readLine(), Integer.parseInt(buff.readLine()), buff.readLine(), buff.readLine(), buff.readLine(), buff.readLine()));
			usernumber++;
			
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static boolean Login() {
		boolean loginsuccess = false;
		try {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			String ID = buff.readLine();
			String password = buff.readLine();
			
			for(Object key : userinfo.keySet()) {
				TodayBoard user = (TodayBoard)userinfo.get(key);
				if(user.getUserid().equals(ID) && user.getPasswd().equals(password)) {
					loginsuccess = true;
					
					// ���� �α����� ���� ���� �Է�
					loginid = ID;
					loginpasswd = password;
					break;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return loginsuccess;
	}
	
	public static void Search() {
		try {
			FileWriter filewr = new FileWriter(Searchfile);
			filewr.write("����\t\t�ۼ���\t\t��¥\t\t��ȸ��\n");
			boolean searchsuccess = false;
			
			System.out.println("�˻�� �Է��ϼ��� (�ۼ���¥, �ۼ���, �������� �˻� ����)");
			String searchword = buff.readLine();
			
			for(Object key : boardinfo.keySet()) {
				TodayBoard search = (TodayBoard)boardinfo.get(key);
				if(searchword.equals(search.getDate()) || searchword.equals(search.getWriter()) || searchword.equals(search.getTitle())) {
					filewr.write(search.getTitle() + "\t\t" + search.getWriter() + "\t\t" + search.getDate() + "\t\t" + search.getVisitors() + "\n");
					searchsuccess = true;
				}
			}
			
			if(!searchsuccess) {
				filewr.write("�ش� �Խù��� �����ϴ�.");
			}
			
			filewr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void Write() {
		try {
			ArrayList inputboard = new ArrayList();
			LocalDateTime ldt = LocalDateTime.now();
			
			System.out.println("������ �Է��ϼ���");
			String title = buff.readLine();
			
			// ��¥ ����
			String date = ldt.getYear() + "." + ldt.getMonthValue() + "." + ldt.getDayOfMonth();
			
			System.out.println("�󼼳����� �Է��ϼ���");
			String detail = buff.readLine();
			
			boardinfo.put(boardnumber, new TodayBoard(title, loginid, date, 0, detail));
			boardnumber++;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Read() {
		// �� �󼼳��� �б�
		
		try {
			System.out.println("�Խ��� ����Ʈ ���Ͽ��� ���ϴ� ���� �ϳ� �����Ͽ� ��ü ������ �Է��ϼ���");
			String searchtitle = buff.readLine();
			boolean titleexist = false;
			
			FileWriter filewr = new FileWriter(Readfile);
			
			for(Object key : boardinfo.keySet()) {
				TodayBoard write = (TodayBoard)boardinfo.get(key);
				if(write.getTitle().equals(searchtitle)) {
					write.setVisitors(write.getVisitors() + 1);
					
					filewr.write("���� : " + write.getTitle() + "\t");
					filewr.write("�ۼ��� : " + write.getWriter() + "\t");
					filewr.write("��¥ : " + write.getDate() + "\t");
					filewr.write("��ȸ�� : " + write.getVisitors() + "\n");
					filewr.write("�󼼳���\n" + write.getDetails());
					titleexist = true;
					break;
				}
				
			}
			
			if(!titleexist) {
				System.out.println("�ش� �Խù��� �������� �ʽ��ϴ�.");
			}
			
			filewr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Lists() {
		try {
			FileWriter filewr = new FileWriter(Listfile);
			
			filewr.write("����\t\t�ۼ���\t\t��¥\t\t��ȸ��\n");
			for(Object key : boardinfo.keySet()) {
				TodayBoard temp = (TodayBoard)boardinfo.get(key);
				filewr.write(temp.getTitle() + "\t\t" + temp.getWriter() + "\t\t" + temp.getDate() + "\t\t" + temp.getVisitors() + "\n");
			}
			
			filewr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Logout() {
		loginid = "";
		loginpasswd = "";
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	public static void main(String[] args) {
		
		// Logic
		// ó���̽ʴϱ�? yes : ȸ������, no : �α���
		// �α��� : ���̵�, ��й�ȣ Ȯ���� ���̵� �Ǵ� ��й�ȣ�� Ʋ������ �ٽ� �õ�
		// �α��� ���� �� ����Ʈ, �˻�, �۾���, �� �󼼳��� �б�, ���� �� �ϳ� ����
		// �� �޼ҵ� ����
		// ���� ���� �� ����
		
		
		try {
			while(true) {
				System.out.println("ȸ���̽ʴϱ�? (yes/no �� ����)");
				String firstornot = buff.readLine();
				
				if(firstornot.equals("no")) {
					// ȸ������ ����
					Signup();
				}
				else if(firstornot.equals("yes")) {
					// �α��� ����
					// �α��� ������ �Խ��� Ž�� ����
					if(Login()) {
						System.out.println("�α��� �����߽��ϴ�.");
						
						while(true) {
							System.out.println("���ϴ� ���� �����ϼ��� (����Ʈ/�˻�/�۾���/���б�/�α׾ƿ�/����)");
							String choice = buff.readLine();
							
							if(choice.equals("����Ʈ")) {
								Lists();
							}
							else if(choice.equals("�˻�")) {
								Search();
							}
							else if(choice.equals("�۾���")) {
								Write();
							}
							else if(choice.equals("���б�")) {
								Read();
							}
							else if(choice.equals("�α׾ƿ�")) {
								Logout();
								break;
							}
							else if(choice.equals("����")) {
								System.exit(0);
							}
							else {
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
							}
						}
					}
					else {
						System.out.println("�ٽ� �α��� �ϼ���");
					}
				}
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}