package webdeveloper_one.java.collection;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {
		// Framework : ��ɵ��� ������ ��Ƽ� ���̸� ������ ���� �� �ְ� �ϴ� ���
		// �� ������ �𿩼� �ϳ��� Framework �̷�
		// spring : ��⺰�� �𿩼� �ϳ��� Framework�� �����.
		// spring, egovframework, spring_boot 3���� ������ �ִ�.
		// ibatis, mybatis -> oracle, mysql, mssql ����

		ArrayList arr = new ArrayList();
		
		// add, put, insert, set : ��´�.
		// ArrayList : index 0��°���� ����, 0���� ���� ��´�.
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
		System.out.println("1 ~ 10 �� : " + sum);
		
		arr.clear();
		
		for(int i = 1; i <= 10; i++) {
			arr.add(String.valueOf(i));
		}
		
		int sum2 = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			sum2 += Integer.parseInt(arr.get(i).toString());
		}
		
		System.out.println("1 ~ 10 �� : " + sum2);
		
	}

}
