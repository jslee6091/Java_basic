package webdeveloper_one.java;

import java.util.StringTokenizer;

public class StringTokenizer_1 {

	public static void main(String[] args) {
		
		// StringTokenizer : ��ū���� �����ؼ� �ڸ���
		// Token �⺻ �ĺ��ڴ� ����
		StringTokenizer token = new StringTokenizer("Hello world world");
		
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
		
		StringBuffer bu = new StringBuffer();
		bu.append("���缺 1");
		bu.append(" ��� ���� ����� 1 1 1 1");
		bu.append(" ���̴� 26 1 1");
		
		StringTokenizer token2 = new StringTokenizer(bu.toString());
		int num = 0;
		
		while(token2.hasMoreElements()) {
			if(token2.nextToken().equals("1")) {
				num++;
			}
		}
		System.out.println("1�� ���� : " + num);
	}

}
