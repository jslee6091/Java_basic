package webdeveloper_one.doitjava;

public class Opt_2 {

	public static void main(String[] args) {
		
		// +-*/%
		System.out.println(2 + 3);
		System.out.println(8 - 5);
		System.out.println(2 * 6);
		System.out.println(9 / 3);
		System.out.println(7 % 2);
		
		int one = 5; int two = 2;
		
		System.out.println(one < two);
		System.out.println(one > two);
		System.out.println(one <= two);
		System.out.println(one >= two);
		
		one = 10; two = 10; int three = 5;
		
		System.out.println(one == two);
		System.out.println(one != two);
		System.out.println(one == three);
		System.out.println(one != three);

		// new : 새로운 객체 생성
		// 자바는 주소로 가지 못한다. 객체를 통해서만 접근 가능
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		// 문자열이 아닌 객체 비교이므로 false이다
		System.out.println(str1 == str2);
		// 문자열 비교이므로 true
		System.out.println(str1.equals(str2));
		
	}

}
