package webdeveloper_one.java.collection;

import java.util.ArrayList;

public class List_2 {

	public static void main(String[] args) {
		ArrayList<Object> array = new ArrayList<Object>();
		
//		array.add("���ڿ�1");
//		array.add("���ڿ�2");
//		array.add("���ڿ�3");
//		
//		System.out.println(array.get(0));
//		System.out.println(array.get(1));
//		System.out.println(array.get(2));
//		
//		System.out.println("=============================");
//		
//		array.remove(0);
//		
//		System.out.println(array.get(0));
//		System.out.println(array.get(1));
//		System.out.println(array.get(2));
		
		// problem
		// ���ڿ� 1 ~ 10 �˻��ؼ� 3,8,9 �̸� 3,8,9 �˻��Ǿ����ϴ�.
		for(int i = 1; i <= 10; i++) {
			array.add(String.valueOf(i));
		}
		
		for(int i = 0; i < array.size(); i++) {
			String strvalue = (String)array.get(i);
			
			switch(strvalue){
				case "3": System.out.println("3 �˻��Ǿ����ϴ�."); break;
				case "8": System.out.println("8 �˻��Ǿ����ϴ�."); break;
				case "9": System.out.println("9 �˻��Ǿ����ϴ�."); break;
				default : break;
			}
			
			if(strvalue.equals("3") || strvalue.equals("8") || strvalue.equals("9")){
				System.out.println(strvalue + " �˻��Ǿ����ϴ�.");
			}
			
		}
	}

}
