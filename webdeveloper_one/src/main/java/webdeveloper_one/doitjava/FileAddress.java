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
				System.out.print("[�̸� : " + user.getName());
				System.out.print(" ���� : " + user.getAge());
				System.out.println(" �ּ� : " + user.getAddress() + "]");
			}
		}
	}
	
	public static void Insert() {
		System.out.println("===========================");
		System.out.println("�̸�, ����, �ּ� ������� �Է�");
		try {
			array.add(new FileAddress(buf.readLine(), Integer.parseInt(buf.readLine()), buf.readLine()));
		} catch (NumberFormatException e) {
			System.out.println("���� �Է� ���� : ���ڸ� �Է����ּ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hast.put(1, array);
	}

	public static void main(String[] args) throws IOException {
		
		while(true) {
			System.out.println("===========================");
			System.out.println("�߰�, �˻�, ���� �� �ϳ� ����");
			String choice = buf.readLine();
			
			if(choice.equals("�߰�")) {
				Insert();
			}
			else if(choice.equals("�˻�")) {
				Search();
			}
			else if(choice.equals("����")) {
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}

	}

}
