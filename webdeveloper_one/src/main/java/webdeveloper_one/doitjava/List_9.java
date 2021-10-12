package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class List_9 {

	public String name;
	public int age;
	public String address;
	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static ArrayList arr = new ArrayList();
	public static Hashtable hast = new Hashtable();
	
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

	public List_9(String name, int age, String address) {
		setName(name);
		setAge(age);
		setAddress(address);
	}

	public static void main(String[] args) throws IOException {
		
		while(true) {
			System.out.println("���� �� �ϳ��� �����ϼ���");
			System.out.println("1. ��� 2. �˻� 3. ����");
			String temp = buf.readLine();
			boolean check = false;
			
			// ���
			if(temp.equals("1")) {
				System.out.println("�̸�, ����, �ּ��� ������� �Է��ϼ���");
				arr.add(new List_9(buf.readLine(), Integer.parseInt(buf.readLine()), buf.readLine()));
				System.out.println("�Է� �Ϸ� �Ǿ����ϴ�.");
				
				if(hast.size() == 0) {
					hast.put(1, arr);
				}
				else {
					hast.replace(1, arr);	
				}

			}
			else if(temp.equals("2")) {
				System.out.println("���� �˻� �׸� �� �ϳ��� �����ϼ���");
				System.out.println("1. �̸� 2. ���� 3. �ּ�");
				String inputs = buf.readLine();
				check = false;
				
				if(inputs.equals("1")) {
					System.out.println("�˻��� �̸��� �Է��ϼ���");
					String inputname = buf.readLine();
					
					for(Object key : hast.keySet()) {

						ArrayList users = (ArrayList)hast.get(key);
						for(int i = 0; i < users.size(); i++) {
							
							List_9 arrname = (List_9)users.get(i);
							if(arrname.getName().equals(inputname)) {
								System.out.println(inputname + " �˻��Ǿ����ϴ�.");
								System.out.println(arrname.getName() + " - " + arrname.getAge() + " - " + arrname.getAddress());
								check = true;
								break;
							}
						}
					}
					
					if(!check) {
						System.out.println(inputname + "�˻����� �ʾҽ��ϴ�.");
					}
				}
				else if(inputs.equals("2")) {
					System.out.println("�˻��� ������ �Է��ϼ���");
					int inputage = Integer.parseInt(buf.readLine());
					check = false;
					
					for(Object key : hast.keySet()) {
						ArrayList users = (ArrayList)hast.get(key);
						for(int i = 0; i < users.size(); i++) {
							
							List_9 arrage = (List_9)users.get(i);
							if(String.valueOf(arrage.getAge()).equals(String.valueOf(inputage))) {
								System.out.println(inputage + " �˻��Ǿ����ϴ�.");
								System.out.println(arrage.getName() + " - " + arrage.getAge() + " - " + arrage.getAddress());
								check = true;
								break;
							}
							
						}
					}
					
					if(!check) {
						System.out.println(inputage + "�˻����� �ʾҽ��ϴ�.");
					}
				}
				else if(inputs.equals("3")) {
					System.out.println("�˻��� �ּҸ� �Է��ϼ���");
					String inputaddr = buf.readLine();
					check = false;
					
					for(Object key : hast.keySet()) {
						ArrayList users = (ArrayList)hast.get(key);
						for(int i = 0; i < users.size(); i++) {
							
							List_9 arraddr = (List_9)users.get(i);
							if(arraddr.getAddress().equals(inputaddr)) {
								System.out.println(inputaddr + " �˻��Ǿ����ϴ�.");
								System.out.println(arraddr.getName() + " - " + arraddr.getAge() + " - " + arraddr.getAddress());
								check = true;
								break;
							}
							
						}
					}
					
					if(!check) {
						System.out.println(inputaddr + "�˻����� �ʾҽ��ϴ�.");
					}
				}
				else {
					System.out.println("�߸��� �Է��Դϴ�");
					System.exit(0);
				}
				
			}
			else if(temp.equals("3")) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���");
			}
		}
	}

}