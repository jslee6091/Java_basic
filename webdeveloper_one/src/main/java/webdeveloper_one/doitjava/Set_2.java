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
		System.out.println("삭제할 이름 입력");
		String deletename = buf.readLine();
		deletion = false;
		
		Object ob[] = link.toArray();
		for(int i = 0; i < ob.length; i++) {
			Set_2 temp = (Set_2)ob[i];
			if(temp.getUserid().equals(deletename)) {
				deletion = true;
				link.remove(temp);
				System.out.println("[" + temp.getUserid() + " , " + temp.getAddress() + "] 삭제되었습니다");
				break;
			}
		}
		if(!deletion) {
			System.out.println("이름이 존재하지 않습니다");
		}
	}
	
	public static void DeleteAddr() throws IOException {
		System.out.println("삭제할 주소 입력");
		String deleteaddr = buf.readLine();
		deletion = false;
		
		Object ob[] = link.toArray();
		for(int i = 0; i < ob.length; i++) {
			Set_2 temp = (Set_2)ob[i];
			if(temp.getAddress().equals(deleteaddr)) {
				deletion = true;
				link.remove(temp);
				System.out.println("[" + temp.getUserid() + " , " + temp.getAddress() + "] 삭제되었습니다");
				break;
			}
		}
		if(!deletion) {
			System.out.println("주소가 존재하지 않습니다");
		}
	}

	public static void main(String[] args) throws IOException {
		// LinkedHashSet
		// userid, address 추가입력(io), 삭제(이름 또는 주소로 삭제), 리스트 출력
		
		while(true) {
			System.out.println("==================================");
			System.out.println("3가지 중 하나 선택");
			System.out.println("1. 추가입력 2. 삭제 3. 출력 4. 종료");
			String choice = buf.readLine();
			
			switch (choice) {
			case "1": {
				System.out.println("이름과 주소를 입력");
				
				link.add(new Set_2(buf.readLine(), buf.readLine()));
				break;
			}
			case "2": {
				System.out.println("삭제 수단 선택");
				System.out.println("1. 이름 2. 주소");
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
					System.out.println("잘못 입력하셨습니다.");
				}
				
				break;
			}
			case "3": {
				Iterator it = link.iterator();
				while(it.hasNext()) {
					Set_2 sett = (Set_2)it.next();
					System.out.println("=========================");
					System.out.println("이름 : " + sett.getUserid());
					System.out.println("주소 : " + sett.getAddress());
				}
				break;
			}
			case "4": {
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}

}
