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
		
		List_2 list = new List_2("���缺", 22, "����");
		List_2 list2 = new List_2("���缺2", 23, "����2");
		List_2 list3 = new List_2("���缺3", 24, "����3");
		List_2 list6 = new List_2("���缺4", 25, "����4");
		
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
			System.out.println("�ڡڡڡڡڡڡڡ�");
		}
		
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		
		// remove 2��° �� ����ÿ�
//		array.remove(list2);
		
		/* ����� �ڵ�
		Object[] ob = array.toArray();
		for (int i = 0; i < ob.length; i++) {
			List_2 list5 = (List_2)ob[i];
			if(list5.getName().equals("���缺2")) {
				array.remove(i);
			}
			else {
				System.out.println(list5.getName());
				System.out.println(list5.getAge());
				System.out.println(list5.getAddress());
				System.out.println("�ڡڡڡڡڡڡڡ�");
			}
		}
		*/
		
//		for (int i = 0; i < array.size(); i++) {
//			List_2 list4 = (List_2)array.get(i);
//			System.out.println(list4.getName());
//			System.out.println(list4.getAge());
//			System.out.println(list4.getAddress());
//			System.out.println("�ڡڡڡڡڡڡڡ�");
//		}
		
		// �ּ� �˻��ؼ� ������ element(��ü) ����
		Iterator it = array.iterator();
		
		while(it.hasNext()) {
			List_2 list7 = (List_2)it.next();
			
			if(list7.address.equals("����4")) {
				array.remove(it);
			}
			else {
				System.out.println(list7.getName());
				System.out.println(list7.getAge());
				System.out.println(list7.getAddress());
				System.out.println("�ڡڡڡڡڡڡڡ�");
			}
		}
	}

}