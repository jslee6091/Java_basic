package webdeveloper_one.doitjava;

public class Gvar_1 {

	// 전역변수 : 접근 제한자, 타입, 변수이름
	// 초기화 필요 x
	// lifecycle : 주기 -> 객체 주기가 다하면(가비지 컬렉션) 소멸
	// 가비지 컬렉터 : jvm 돌고 있다가 쓰지 않는 객체가 있으면 자동으로 소멸, 우선순위 정하기 가능
	public String name;
	
	// 큰것 -> 작은 것
	// ex) 대한민국, 서울, 서초구, 양재동, 한국IT직업전문학고, 5층, 502호
	// 이것이 객체지향(Object-oriented) 이다.
	
	public static void main(String[] args) {
		
		// 지역변수는 반드시 초기화, 접근제한자 오지않음
		
		String name = "이재성";
		System.out.println(name);
		
		// new : 객체 생성
		Gvar_1 ob = new Gvar_1();
		ob.name = "Jason Lee";
		System.out.println(ob.name);
	}

}
