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
	
	// 회원 정보 저장 ex) 1 : {이름, 나이, 주소, 아이디, 패스워드}
	public static Hashtable userinfo = new Hashtable();
	
	// 게시물 정보 : 제목, 작성자, 날짜, 조회수
	public static Hashtable boardinfo = new Hashtable();
	
	// 게시물 개수별로 저장 ex) 1 : {제목, 작성자, 날짜, 조회수}
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
				System.out.println("비밀번호가 중복되었습니다. 다시 입력하세요");
			
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
			System.out.println("회원가입 진행합니다");
			
			System.out.println("이름, 나이, 주소, 아이디, 이메일, 패스워드 순서대로 입력");
			userinfo.put(usernumber, new TodayBoard(buff.readLine(), Integer.parseInt(buff.readLine()), buff.readLine(), buff.readLine(), buff.readLine(), buff.readLine()));
			usernumber++;
			
			System.out.println("회원가입이 완료되었습니다");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static boolean Login() {
		boolean loginsuccess = false;
		try {
			System.out.println("아이디와 비밀번호를 입력하세요");
			String ID = buff.readLine();
			String password = buff.readLine();
			
			for(Object key : userinfo.keySet()) {
				TodayBoard user = (TodayBoard)userinfo.get(key);
				if(user.getUserid().equals(ID) && user.getPasswd().equals(password)) {
					loginsuccess = true;
					
					// 현재 로그인한 유저 정보 입력
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
			filewr.write("제목\t\t작성자\t\t날짜\t\t조회수\n");
			boolean searchsuccess = false;
			
			System.out.println("검색어를 입력하세요 (작성날짜, 작성자, 제목으로 검색 가능)");
			String searchword = buff.readLine();
			
			for(Object key : boardinfo.keySet()) {
				TodayBoard search = (TodayBoard)boardinfo.get(key);
				if(searchword.equals(search.getDate()) || searchword.equals(search.getWriter()) || searchword.equals(search.getTitle())) {
					filewr.write(search.getTitle() + "\t\t" + search.getWriter() + "\t\t" + search.getDate() + "\t\t" + search.getVisitors() + "\n");
					searchsuccess = true;
				}
			}
			
			if(!searchsuccess) {
				filewr.write("해당 게시물이 없습니다.");
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
			
			System.out.println("제목을 입력하세요");
			String title = buff.readLine();
			
			// 날짜 저장
			String date = ldt.getYear() + "." + ldt.getMonthValue() + "." + ldt.getDayOfMonth();
			
			System.out.println("상세내용을 입력하세요");
			String detail = buff.readLine();
			
			boardinfo.put(boardnumber, new TodayBoard(title, loginid, date, 0, detail));
			boardnumber++;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Read() {
		// 글 상세내용 읽기
		
		try {
			System.out.println("게시판 리스트 파일에서 원하는 글을 하나 선택하여 전체 제목을 입력하세요");
			String searchtitle = buff.readLine();
			boolean titleexist = false;
			
			FileWriter filewr = new FileWriter(Readfile);
			
			for(Object key : boardinfo.keySet()) {
				TodayBoard write = (TodayBoard)boardinfo.get(key);
				if(write.getTitle().equals(searchtitle)) {
					write.setVisitors(write.getVisitors() + 1);
					
					filewr.write("제목 : " + write.getTitle() + "\t");
					filewr.write("작성자 : " + write.getWriter() + "\t");
					filewr.write("날짜 : " + write.getDate() + "\t");
					filewr.write("조회수 : " + write.getVisitors() + "\n");
					filewr.write("상세내용\n" + write.getDetails());
					titleexist = true;
					break;
				}
				
			}
			
			if(!titleexist) {
				System.out.println("해당 게시물이 존재하지 않습니다.");
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
			
			filewr.write("제목\t\t작성자\t\t날짜\t\t조회수\n");
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
		System.out.println("로그아웃 되었습니다.");
	}
	
	public static void main(String[] args) {
		
		// Logic
		// 처음이십니까? yes : 회원가입, no : 로그인
		// 로그인 : 아이디, 비밀번호 확인후 아이디 또는 비밀번호가 틀렸으면 다시 시도
		// 로그인 성공 후 리스트, 검색, 글쓰기, 글 상세내용 읽기, 종료 중 하나 선택
		// 각 메소드 실행
		// 종료 선택 시 종료
		
		
		try {
			while(true) {
				System.out.println("회원이십니까? (yes/no 중 선택)");
				String firstornot = buff.readLine();
				
				if(firstornot.equals("no")) {
					// 회원가입 진행
					Signup();
				}
				else if(firstornot.equals("yes")) {
					// 로그인 진행
					// 로그인 성공시 게시판 탐색 시작
					if(Login()) {
						System.out.println("로그인 성공했습니다.");
						
						while(true) {
							System.out.println("원하는 서비스 선택하세요 (리스트/검색/글쓰기/글읽기/로그아웃/종료)");
							String choice = buff.readLine();
							
							if(choice.equals("리스트")) {
								Lists();
							}
							else if(choice.equals("검색")) {
								Search();
							}
							else if(choice.equals("글쓰기")) {
								Write();
							}
							else if(choice.equals("글읽기")) {
								Read();
							}
							else if(choice.equals("로그아웃")) {
								Logout();
								break;
							}
							else if(choice.equals("종료")) {
								System.exit(0);
							}
							else {
								System.out.println("잘못 입력하셨습니다.");
							}
						}
					}
					else {
						System.out.println("다시 로그인 하세요");
					}
				}
				else {
					System.out.println("잘못 입력하셨습니다");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
