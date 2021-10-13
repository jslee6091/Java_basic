package webdeveloper_one.doitjava;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_1 {
	public String userid;
	public String address;

	
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


	public Set_1(String userid, String address) {
		setUserid(userid);
		setAddress(address);
	}	
	
	
	public static void main(String[] args) {
		LinkedHashSet link = new LinkedHashSet();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		
		
		Object ob[] = link.toArray();
		
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);			
		}
		System.out.println("---------------------");
		
		// 3 Áö¿ì±â
		link.remove(3);
		
		Iterator it = link.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		
		link.clear();
		Set_1 setob = new Set_1("userid", "address");
		Set_1 setob2 = new Set_1("userid2", "address2");
		Set_1 setob3 = new Set_1("userid3", "address3");
		
		link.add(setob);
		link.add(setob2);
		link.add(setob3);
		
		
		Object ob2[] = link.toArray();
		
		for (int i = 0; i < ob2.length; i++) {
			Set_1 setvalue = (Set_1)ob2[i];
//			String name = ob2[i].getClass().getName();
			
//			System.out.println(name);
			
			if(setvalue.getUserid().equals("userid2")) {
				link.remove(setvalue);
			}
			
			System.out.println(setvalue.getUserid());
			System.out.println(setvalue.getAddress());
		}
		System.out.println("---------------------");
		
//		link.remove(setob2);
		
		Iterator it2 = link.iterator();
		while(it2.hasNext()) {
			Set_1 sett = (Set_1)it2.next();
			System.out.println(sett.getUserid());
			System.out.println(sett.getAddress());
		}
		System.out.println("---------------------");
		
	}

}
