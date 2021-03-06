package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
		Vector vect = new Vector();
		vect.add(1);
		vect.add(2);
		vect.add(3);
		vect.add(4);
		vect.add(5);
		
		for (int i = 0; i < vect.size(); i++) {
			System.out.println(vect.elementAt(i));
		}
		
		ArrayList array = new ArrayList();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		
		HashMap hash = new HashMap();
		hash.put("vector", vect);
		hash.put("arraylist", array);
		
		System.out.println("------------------------------");
		Vector vect2 = (Vector)hash.get("vector");
		for (int i = 0; i < vect2.size(); i++) {
			System.out.println(vect2.get(i));
		}
		
		System.out.println("------------------------------");
		ArrayList array2 = (ArrayList)hash.get("arraylist");
		for (int i = 0; i < array2.size(); i++) {
			System.out.println(array2.get(i));
		}
		
		Hashtable table = new Hashtable(hash);
		Enumeration en = table.keys();
		
		while(en.hasMoreElements()) {
//			System.out.println(table.get(en.nextElement()));
			Object obvalue = table.get((String)en.nextElement());
			if(obvalue.getClass().getName().equals("java.util.ArrayList")) {
				ArrayList array3 = (ArrayList)obvalue;
				
				System.out.println("--------- arraylist ---------");
				for (int i = 0; i < array3.size(); i++) {
					System.out.println(array3.get(i));
				}
			}
			else if(obvalue.getClass().getName().equals("java.util.Vector")) {
				Vector vect3 = (Vector)obvalue;
				
				System.out.println("---------- Vector ----------");
				for (int i = 0; i < vect3.size(); i++) {
					System.out.println(vect3.get(i));
				}
			}
		}
	}

}
