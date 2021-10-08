package webdeveloper_one.java.collection;

import java.util.ArrayList;

public class List_2 {

	public static void main(String[] args) {
		ArrayList<Object> array = new ArrayList<Object>();
		
//		array.add("문자열1");
//		array.add("문자열2");
//		array.add("문자열3");
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
		// 문자열 1 ~ 10 검색해서 3,8,9 이면 3,8,9 검색되었습니다.
		for(int i = 1; i <= 10; i++) {
			array.add(String.valueOf(i));
		}
		
		for(int i = 0; i < array.size(); i++) {
			String strvalue = (String)array.get(i);
			
			switch(strvalue){
				case "3": System.out.println("3 검색되었습니다."); break;
				case "8": System.out.println("8 검색되었습니다."); break;
				case "9": System.out.println("9 검색되었습니다."); break;
				default : break;
			}
			
			if(strvalue.equals("3") || strvalue.equals("8") || strvalue.equals("9")){
				System.out.println(strvalue + " 검색되었습니다.");
			}
			
		}
	}

}
