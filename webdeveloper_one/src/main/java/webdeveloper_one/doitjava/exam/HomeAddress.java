package webdeveloper_one.doitjava.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// ���� �̸� ���� �ּҸ� ����� ���ؼ� �̸��̸� �̸�, ���̸� ����, �ּҸ� �ּҸ� ���
public class HomeAddress {

	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static String name;
	public static int age;
	public static String address;
	
	public static void Name() throws Exception {
		System.out.println("�̸� : " + name);
	}
	
	public static void Age() throws Exception {
		System.out.println("���� : " + age);
	}
	
	public static void Address() throws Exception {
		System.out.println("�ּ� : " + address);
	}
	
	public HomeAddress() {
		name = "���缺";
		age = 26;
		address = "�����";
	}
	
	public static void main(String[] args) throws Exception {
		
		new HomeAddress();
		
		String temp = "";
		while(temp != null) {
			System.out.println("�̸�, ����, �ּ�, exit �� �ϳ��� �����Ͽ� �Է��ϼ���");
			temp = buf.readLine();
			
			if(temp.equals("�̸�")) {
				Name();
			}
			else if(temp.equals("����")) {
				Age();
			}
			else if(temp.equals("�ּ�")) {
				Address();
			}
			else if(temp.equals("exit")) {
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
			System.out.println("==============================================");
		}
	}

}
