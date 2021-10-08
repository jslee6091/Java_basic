package webdeveloper_one.doitjava;

public class Casting_1 {
	
	public static void main(String[] args) {
		
		// up , down casting
		// 강제, 자동 casting
		
		// 문자열이 제일 크다
		// 문자열이 크기 때문에 자동으로 정수형이 문자형으로 바뀐다
		System.out.println("문자열" + 10);
		// 문자 -> 정수
		String strvalue = "1";
		int intvalue = Integer.parseInt(strvalue);
		intvalue = intvalue + 10;
		
		System.out.println("정수형 변환 : " + intvalue);
		// 정수 -> 문자
		int intvalue2 = 10;
		String strvalue2 = String.valueOf(intvalue2);
		System.out.println(strvalue2);
		
		// 업캐스팅
		// 모든 클래스는 반드시 Object를 상속 받아야한다
		// Object 상속 받지 않으면 자바가 아니다(native)
		
		// 모든 클래스의 부모는 Object
		// 모든 타입(type)을 부모가 받을 수 있다
		// 상속의 개념에서 자식이 부모보다 크거나 같다
		Object ob = (Object)new String("upcasting");
		if(ob.equals("upcasting")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		String obstrvalue = (String)ob;
		String obstrvalue2 = ob.toString();
		System.out.println("down casting : " + obstrvalue2);
		
	}
}
