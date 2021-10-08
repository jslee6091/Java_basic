package webdeveloper_one.doitjava;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {
		
//		String array[] = {"1", "2", "3", "4", "5"};
//		int array2[] = {1,2,3,4,5};
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//		
//		System.out.println("-------------------------------");
//		
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
//		
//		System.out.println("-------------------------------");
		
		// ArrayList : List에서 파생되는(자식) 모든 것들은 index 0부터 시작
		// 요소(elements)에 대한 검색을 값으로만 찾을 수 있다(이름으로 검색 불가)
		ArrayList<Object> array = new ArrayList<>();
		array.add(26);
		array.add(22);
		array.add(5);
		array.add(2);
		array.add("lkwe");
		
		// Object : interface 상속 안됨, class 만 상속한다
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println("-------------------------------");
		
		array.remove(0);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println("-------------------------------");
		
		array.remove((Integer)5);
		// array.remove(new Integer(5));

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println("-------------------------------");
		
		array.remove("lkwe");
		// array.remove(new String("lkwe"));

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		array.clear();
		
		// 1 ~ 10 중 3,6,9 뺀 합 구하기
		
		ArrayList array2 = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			array2.add(i + 1);
		}
		
		array2.remove((Integer)3);
		array2.remove((Integer)6);
		array2.remove((Integer)9);
		
		int sum = 0;
		for (int i = 0; i < array2.size(); i++) {
			sum += (int)array2.get(i);
		}
		
		System.out.println("-------------------------------");		
		System.out.println(sum);
	}

}
