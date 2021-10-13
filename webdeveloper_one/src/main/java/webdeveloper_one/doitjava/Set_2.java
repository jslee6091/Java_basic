package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_2 {

	public String userid;
	public String address;
	public static boolean deletion;
	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static LinkedHashSet link = new LinkedHashSet();
		
	
	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}


	public Set_2(String userid, String address) {
		setUserid(userid);
		setAddress(address);
	}
	
	public static void DeleteName() throws IOException {
		System.out.println("������ �̸� �Է�");
		String deletename = buf.readLine();
		deletion = false;
		
		Object ob[] = link.toArray();
		for(int i = 0; i < ob.length; i++) {
			Set_2 temp = (Set_2)ob[i];
			if(temp.getUserid().equals(deletename)) {
				deletion = true;
				link.remove(temp);
				System.out.println("[" + temp.getUserid() + " , " + temp.getAddress() + "] �����Ǿ����ϴ�");
				break;
			}
		}
		if(!deletion) {
			System.out.println("�̸��� �������� �ʽ��ϴ�");
		}
	}
	
	public static void DeleteAddr() throws IOException {
		System.out.println("������ �ּ� �Է�");
		String deleteaddr = buf.readLine();
		deletion = false;
		
		Object ob[] = link.toArray();
		for(int i = 0; i < ob.length; i++) {
			Set_2 temp = (Set_2)ob[i];
			if(temp.getAddress().equals(deleteaddr)) {
				deletion = true;
				link.remove(temp);
				System.out.println("[" + temp.getUserid() + " , " + temp.getAddress() + "] �����Ǿ����ϴ�");
				break;
			}
		}
		if(!deletion) {
			System.out.println("�ּҰ� �������� �ʽ��ϴ�");
		}
	}

	public static void main(String[] args) throws IOException {
		// LinkedHashSet
		// userid, address �߰��Է�(io), ����(�̸� �Ǵ� �ּҷ� ����), ����Ʈ ���
		
		while(true) {
			System.out.println("==================================");
			System.out.println("3���� �� �ϳ� ����");
			System.out.println("1. �߰��Է� 2. ���� 3. ��� 4. ����");
			String choice = buf.readLine();
			
			switch (choice) {
			case "1": {
				System.out.println("�̸��� �ּҸ� �Է�");
				
				link.add(new Set_2(buf.readLine(), buf.readLine()));
				break;
			}
			case "2": {
				System.out.println("���� ���� ����");
				System.out.println("1. �̸� 2. �ּ�");
				String delete = buf.readLine();
				
				switch (delete) {
				case "1": {
					Set_2.DeleteName();
					break;
				}
				case "2": {
					Set_2.DeleteAddr();
					break;
				}
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				
				break;
			}
			case "3": {
				Iterator it = link.iterator();
				while(it.hasNext()) {
					Set_2 sett = (Set_2)it.next();
					System.out.println("=========================");
					System.out.println("�̸� : " + sett.getUserid());
					System.out.println("�ּ� : " + sett.getAddress());
				}
				break;
			}
			case "4": {
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
		
	}

}
