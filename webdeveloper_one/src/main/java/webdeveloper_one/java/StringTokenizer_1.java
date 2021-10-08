package webdeveloper_one.java;

import java.util.StringTokenizer;

public class StringTokenizer_1 {

	public static void main(String[] args) {
		
		// StringTokenizer : 토큰으로 구분해서 자른다
		// Token 기본 식별자는 공백
		StringTokenizer token = new StringTokenizer("Hello world world");
		
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
		
		StringBuffer bu = new StringBuffer();
		bu.append("이재성 1");
		bu.append(" 사는 곳은 서울시 1 1 1 1");
		bu.append(" 나이는 26 1 1");
		
		StringTokenizer token2 = new StringTokenizer(bu.toString());
		int num = 0;
		
		while(token2.hasMoreElements()) {
			if(token2.nextToken().equals("1")) {
				num++;
			}
		}
		System.out.println("1의 개수 : " + num);
	}

}
