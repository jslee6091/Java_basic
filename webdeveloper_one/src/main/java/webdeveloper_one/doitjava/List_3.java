package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			list.add(i + 1);
			System.out.println(list.get(i));
		}
		
		System.out.println("============================");
		
		java.util.Iterator<Integer> it = list.iterator();
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		
		System.out.println("============================");
		
		ListIterator it2 = list.listIterator();
		try {
			while(it2.hasNext()) {
				System.out.println("list[" + it2.nextIndex() + "] : " + it2.next());
			}
			
			System.out.println("============================");
			
			while(it2.hasPrevious()) {
				System.out.println("list[" + it2.previousIndex() + "] : " + it2.previous());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
			}

}
