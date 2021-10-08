package webdeveloper_one.java;

public class Static_1 {

	// static : 모든 객체에 공유
	public static int init = 0;
	
	public Static_1() {
		++init;
		System.out.println(init);
	}
	
	public static void main(String[] args) {
		
//		Static_1 stat = new Static_1();
//		Static_1 stat2 = new Static_1();
//		Static_1 stat3 = new Static_1();
		
		for(int i = 1; i <= 5; i++) {
			// 이름이 없는 무명 객체
			new Static_1();
		}
		System.out.println(Static_1.init);

	}

}
