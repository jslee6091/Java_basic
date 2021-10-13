package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ArrayListLinkedList_1 {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		LinkedList linklist = new LinkedList();
		LinkedHashMap linkedmap = new LinkedHashMap();
		
		// linkedlist ���Խð�
		Long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linklist.add(i);
		}
		
		Long end = System.nanoTime();
		System.out.println("linkdlist input time : " + (end - start) + "ns");

		// arraylist ���Խð�
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arraylist.add(i);
		}
		
		end = System.nanoTime();
		System.out.println("arraylist input time : " + (end - start) + "ns");
		
		// linkedhashmap ���Խð�
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedmap.put(i, i);
		}
		end = System.nanoTime();
		System.out.println("linkedmap input time : " + (end - start) + "ns");
		
		// ��ȸ �ð� ��
		// linkedlist ��ȸ(������)�ð�
		start = System.nanoTime();
		
		for(int i = 0; i < linklist.size(); i++) {
			linklist.get(i);
		}
		end = System.nanoTime();
		System.out.println("linkdlist output time : " + (end - start) + "ns");
		
		// arraylist ��ȸ(������)�ð�
		start = System.nanoTime();
		
		for(int i = 0; i < arraylist.size(); i++) {
			arraylist.get(i);
		}
		end = System.nanoTime();
		System.out.println("arraylist output time : " + (end - start) + "ns");
		
		// linkedhashmap ��ȸ(������)�ð�
		start = System.nanoTime();
		
		for(int i = 0; i < linkedmap.size(); i++) {
			linkedmap.get(i);
		}
		end = System.nanoTime();
		System.out.println("linkedmap output time : " + (end - start) + "ns");
				
	}

}