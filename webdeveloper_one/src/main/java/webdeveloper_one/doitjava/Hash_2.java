package webdeveloper_one.doitjava;

import java.util.Hashtable;

public class Hash_2 {

	public static void main(String[] args) {
		
		/* key, value -> 1 : 1 -> 속도가 제일 빠르다
		 * Map은 hash의 부모이다
		 */
		
		Hashtable<Object, Object> hash = new Hashtable<Object, Object>();
		hash.put(1, 1);
		hash.put(2, 2);
		hash.put(3, 3);
		hash.put(4, 4);
		hash.put(5, 5);
		
		/* for loop */
		for (int i = 0; i < hash.size(); i++) {
			System.out.println(hash.get(i + 1));
		}
		
		System.out.println("-----------------");
		
		// bean : 임시로 값을 저장한다
		LoginBean bean = new LoginBean();
		bean.setName("이재성");
		bean.setAge(26);
		bean.setAddress("대한민국");
		
		LoginBean bean2 = new LoginBean();
		bean2.setName("아무개");
		bean2.setAge(20);
		bean2.setAddress("서울시");
		
		hash.clear();
		
		hash.put(1, bean);
		hash.put(2, bean2);
		
		for(int i = 1; i <= hash.size(); i++) {
			LoginBean dd = (LoginBean)hash.get(i);
			System.out.println(dd.getAddress());
			System.out.println(dd.getAge());
			System.out.println(dd.getName());
			System.out.println("-----------------");
		}
		
		// package:webdeveloper_one.doitjava
		// class:InputLogin_A, InputLoginBean_A
		// class:InputLogin_M, InputLoginBean_M
		// 입력 이름, 나이, 주소, 이메일, 별명 5개 입력
		// A는 Arraylist, M은 HashMap, Hashtable 등 사용
		
	}

}
