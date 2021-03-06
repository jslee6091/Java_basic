package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.Iterator;

public class List_2 {

	public String name;
	public int age;
	public String address;
	
	public List_2(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
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



	public static void main(String[] args) {
		
		List_2 list = new List_2("이재성", 22, "서울");
		List_2 list2 = new List_2("이재성2", 23, "서울2");
		List_2 list3 = new List_2("이재성3", 24, "서울3");
		List_2 list6 = new List_2("이재성4", 25, "서울4");
		
		ArrayList array = new ArrayList();
		array.add(list);
		array.add(list2);
		array.add(list3);
		array.add(list6);
		
		for (int i = 0; i < array.size(); i++) {
			List_2 list4 = (List_2)array.get(i);
			System.out.println(list4.getName());
			System.out.println(list4.getAge());
			System.out.println(list4.getAddress());
			System.out.println("★★★★★★★★");
		}
		
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		
		// remove 2번째 방 지우시오
//		array.remove(list2);
		
		/* 강사님 코드
		Object[] ob = array.toArray();
		for (int i = 0; i < ob.length; i++) {
			List_2 list5 = (List_2)ob[i];
			if(list5.getName().equals("이재성2")) {
				array.remove(i);
			}
			else {
				System.out.println(list5.getName());
				System.out.println(list5.getAge());
				System.out.println(list5.getAddress());
				System.out.println("★★★★★★★★");
			}
		}
		*/
		
//		for (int i = 0; i < array.size(); i++) {
//			List_2 list4 = (List_2)array.get(i);
//			System.out.println(list4.getName());
//			System.out.println(list4.getAge());
//			System.out.println(list4.getAddress());
//			System.out.println("★★★★★★★★");
//		}
		
		// 주소 검색해서 맞으면 element(객체) 제거
		Iterator it = array.iterator();
		
		while(it.hasNext()) {
			List_2 list7 = (List_2)it.next();
			
			if(list7.address.equals("서울4")) {
				array.remove(it);
			}
			else {
				System.out.println(list7.getName());
				System.out.println(list7.getAge());
				System.out.println(list7.getAddress());
				System.out.println("★★★★★★★★");
			}
		}
	}

}
