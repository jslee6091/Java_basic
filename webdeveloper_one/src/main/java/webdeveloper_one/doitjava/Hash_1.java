package webdeveloper_one.doitjava;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Hash_1 {

	public static void main(String[] args) {
		
		HashMap<String, String> hash = new HashMap();
		
		hash.put("이재성", "이재성");
		hash.put("홍길동", "홍길동");
		hash.put("아무개", "아무개");
		hash.put("이름", "주소");
		
		// 값을 출력하시오
		for(Object key : hash.keySet()) {
			System.out.println(key + " : " + hash.get(key));
		}
		
		Collection col = hash.values();
		Object ob[] = col.toArray();
		System.out.println(col);
		System.out.println(hash.values());
		
		System.out.println("==============keyset()===============");
		
		// 키와 값이 일치하는 것을 출력
		for(String key : hash.keySet()) {
			if(key.equals(hash.get(key))) {
				System.out.println(key + " : " + hash.get(key));
			}
		}
		
		Hashtable ht = new Hashtable(hash);
//		ht.put("이재성", "이재성");
//		ht.put("홍길동", "홍길동");
//		ht.put("아무개", "아무개");
//		ht.put("이름","주소");
		
		Enumeration enu = ht.keys();
		
		System.out.println("==============hashtable===============");
		
		// 키와 값이 일치하는 것을 출력
		while(enu.hasMoreElements()) {
			String strkey = enu.nextElement().toString();
			if(ht.get(strkey).equals(strkey)) {
				System.out.println(strkey + " : " + ht.get(strkey));
			}
		}
		
	}

}
