package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class FileAddress {

	public String name;
	public int age;
	public String address;
	public static ArrayList array = new ArrayList();
	public static Hashtable hast = new Hashtable();
	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	
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

	public FileAddress(String name, int age, String address) {
		setName(name);
		setAge(age);
		setAddress(address);
	}
	
	public static void Search() {
		System.out.println("===========================");
		Enumeration enu = hast.keys();
		while(enu.hasMoreElements()) {
			ArrayList temp = (ArrayList)hast.get(enu.nextElement());
			
			for(int i = 0; i < array.size(); i++) {
				FileAddress user = (FileAddress)array.get(i);
				System.out.print("[이름 : " + user.getName());
				System.out.print(" 나이 : " + user.getAge());
				System.out.println(" 주소 : " + user.getAddress() + "]");
			}
		}
	}
	
	public static void Insert() {
		System.out.println("===========================");
		System.out.println("이름, 나이, 주소 순서대로 입력");
		try {
			array.add(new FileAddress(buf.readLine(), Integer.parseInt(buf.readLine()), buf.readLine()));
		} catch (NumberFormatException e) {
			System.out.println("나이 입력 오류 : 숫자를 입력해주세요");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hast.put(1, array);
	}

	public static void main(String[] args) throws IOException {
		
		while(true) {
			System.out.println("===========================");
			System.out.println("추가, 검색, 종료 중 하나 선택");
			String choice = buf.readLine();
			
			if(choice.equals("추가")) {
				Insert();
			}
			else if(choice.equals("검색")) {
				Search();
			}
			else if(choice.equals("종료")) {
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
