package webdeveloper_one.java.collection;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {
		// Framework : 기능들의 집합을 모아서 웹이면 웹에서 돌릴 수 있게 하는 모듈
		// 각 모듈들이 모여서 하나의 Framework 이룸
		// spring : 모듈별로 모여서 하나의 Framework을 만든다.
		// spring, egovframework, spring_boot 3가지 종류가 있다.
		// ibatis, mybatis -> oracle, mysql, mssql 연동

		ArrayList arr = new ArrayList();
		
		// add, put, insert, set : 담는다.
		// ArrayList : index 0번째부터 시작, 0부터 값을 담는다.
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		arr.clear();
		
		// question
		// get 1 ~ 10 sum
		int sum = 0;
		
		for(int i = 0; i <= 9; i++) {
			arr.add(i, i + 1);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			Integer val = (int)arr.get(i);
			sum += val;
		}
		System.out.println("1 ~ 10 합 : " + sum);
		
		arr.clear();
		
		for(int i = 1; i <= 10; i++) {
			arr.add(String.valueOf(i));
		}
		
		int sum2 = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			sum2 += Integer.parseInt(arr.get(i).toString());
		}
		
		System.out.println("1 ~ 10 합 : " + sum2);
		
	}

}
