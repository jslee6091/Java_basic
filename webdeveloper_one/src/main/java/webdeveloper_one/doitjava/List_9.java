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
			System.out.println("다음 중 하나를 선택하세요");
			System.out.println("1. 등록 2. 검색 3. 종료");
			String temp = buf.readLine();
			boolean check = false;
			
			// 등록
			if(temp.equals("1")) {
				System.out.println("이름, 나이, 주소을 순서대로 입력하세요");
				arr.add(new List_9(buf.readLine(), Integer.parseInt(buf.readLine()), buf.readLine()));
				System.out.println("입력 완료 되었습니다.");
				
				if(hast.size() == 0) {
					hast.put(1, arr);
				}
				else {
					hast.replace(1, arr);	
				}

			}
			else if(temp.equals("2")) {
				System.out.println("다음 검색 항목 중 하나를 선택하세요");
				System.out.println("1. 이름 2. 나이 3. 주소");
				String inputs = buf.readLine();
				check = false;
				
				if(inputs.equals("1")) {
					System.out.println("검색할 이름을 입력하세요");
					String inputname = buf.readLine();
					
					for(Object key : hast.keySet()) {

						ArrayList users = (ArrayList)hast.get(key);
						for(int i = 0; i < users.size(); i++) {
							
							List_9 arrname = (List_9)users.get(i);
							if(arrname.getName().equals(inputname)) {
								System.out.println(inputname + " 검색되었습니다.");
								System.out.println(arrname.getName() + " - " + arrname.getAge() + " - " + arrname.getAddress());
								check = true;
								break;
							}
						}
					}
					
					if(!check) {
						System.out.println(inputname + "검색되지 않았습니다.");
					}
				}
				else if(inputs.equals("2")) {
					System.out.println("검색할 나이을 입력하세요");
					int inputage = Integer.parseInt(buf.readLine());
					check = false;
					
					for(Object key : hast.keySet()) {
						ArrayList users = (ArrayList)hast.get(key);
						for(int i = 0; i < users.size(); i++) {
							
							List_9 arrage = (List_9)users.get(i);
							if(String.valueOf(arrage.getAge()).equals(String.valueOf(inputage))) {
								System.out.println(inputage + " 검색되었습니다.");
								System.out.println(arrage.getName() + " - " + arrage.getAge() + " - " + arrage.getAddress());
								check = true;
								break;
							}
							
						}
					}
					
					if(!check) {
						System.out.println(inputage + "검색되지 않았습니다.");
					}
				}
				else if(inputs.equals("3")) {
					System.out.println("검색할 주소를 입력하세요");
					String inputaddr = buf.readLine();
					check = false;
					
					for(Object key : hast.keySet()) {
						ArrayList users = (ArrayList)hast.get(key);
						for(int i = 0; i < users.size(); i++) {
							
							List_9 arraddr = (List_9)users.get(i);
							if(arraddr.getAddress().equals(inputaddr)) {
								System.out.println(inputaddr + " 검색되었습니다.");
								System.out.println(arraddr.getName() + " - " + arraddr.getAge() + " - " + arraddr.getAddress());
								check = true;
								break;
							}
							
						}
					}
					
					if(!check) {
						System.out.println(inputaddr + "검색되지 않았습니다.");
					}
				}
				else {
					System.out.println("잘못된 입력입니다");
					System.exit(0);
				}
				
			}
			else if(temp.equals("3")) {
				System.out.println("종료되었습니다");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}
		}
	}

}
